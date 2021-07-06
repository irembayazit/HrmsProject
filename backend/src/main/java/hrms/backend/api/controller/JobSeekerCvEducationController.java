package hrms.backend.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import hrms.backend.business.abstracts.JobSeekerCvEducationService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.ErrorDataResult;
import hrms.backend.entities.concretes.JobSeekerCvEducation;

@RestController
@RequestMapping(value = "/api/cvEducation")
public class JobSeekerCvEducationController {

	private JobSeekerCvEducationService cvEducationService;

	@Autowired
	public JobSeekerCvEducationController(JobSeekerCvEducationService cvEducationService) {
		super();
		this.cvEducationService = cvEducationService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerCvEducation education) {
		return ResponseEntity.ok(this.cvEducationService.add(education));
	}
	
	@GetMapping("/getSchoolNameDesc")
	public ResponseEntity<?> SchoolNameDesc(@RequestParam int userId){
		return ResponseEntity.ok(this.cvEducationService.findAllByJobSeekerCv_UserIdOrderByGraduationYearDesc(userId));
	}
	
	@GetMapping(value = "/getById")
	public DataResult<List<JobSeekerCvEducation>> getById(int userId){
		return this.cvEducationService.getByJobSeeker_UserId(userId);
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
		(validationErrors,"Dogrulama hataları");
		return errors;
 		
	}
	
	
}
