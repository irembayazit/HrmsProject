package hrms.backend.api.controller; 

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.ValidationRules.JobSeekerValidator;
import hrms.backend.business.abstracts.JobSeekerService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.ErrorDataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeeker;
import hrms.backend.entities.dtos.JobSeekerForRegisterDto;

@RestController
@RequestMapping("/api/jobseekers")

public class JobSeekersController {

	private final JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekersController(final JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
	}
	
	@PostMapping("/register")
	public Result  register(@RequestBody final JobSeekerForRegisterDto jobSeekerForRegisterDto){
		final Result result =  new JobSeekerValidator().control(jobSeekerForRegisterDto);
		
		if(result.isSuccess()==true)
			return this.jobSeekerService.register(jobSeekerForRegisterDto);			
		
		return result;	
	}
	
	@PostMapping(value = "/getByUserId")
	public DataResult<JobSeeker> getByUserId(@RequestParam int userId){
		return this.jobSeekerService.getByUserId(userId);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException
	(MethodArgumentNotValidException exceptions){
		
		Map<String,String> validationErrors = new HashMap<String,String>(); 
		for(FieldError filedError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(filedError.getField(), filedError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>
		(validationErrors,"Dogrulama hatalar??");
		return errors;
 		
	}
	
}
