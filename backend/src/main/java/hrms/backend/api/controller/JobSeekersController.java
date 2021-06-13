package hrms.backend.api.controller; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.ValidationRules.JobSeekerValidator;
import hrms.backend.business.abstracts.JobSeekerService;
import hrms.backend.core.utilities.results.DataResult;
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
	
}
