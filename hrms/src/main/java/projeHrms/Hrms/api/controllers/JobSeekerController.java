package projeHrms.Hrms.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeHrms.Hrms.business.ValidationRules;
import projeHrms.Hrms.business.abstracts.JobSeekerService;
import projeHrms.Hrms.core.utilities.results.Result;
import projeHrms.Hrms.entities.dtos.JobSeekerForRegisterDto;

@RestController
@RequestMapping("/api/jobseekers")

public class JobSeekerController {

	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping("/register")
	public Result  register(@Valid @RequestBody final JobSeekerForRegisterDto jobSeekerForRegisterDto){
		
		
		
		Result result =  new ValidationRules().control(jobSeekerForRegisterDto);
		
		if(result.isSuccess()==true)
			return this.jobSeekerService.register(jobSeekerForRegisterDto);			
		
		return result;
		
		
		/*
		 * final Result result = jobSeekerService.register(jobSeekerForRegisterDto);
		 * 
		 * if (result.isSuccess()==false) return new
		 * ResponseEntity<>(result,HttpStatus.BAD_REQUEST);
		 * 
		 * return ResponseEntity.ok(result);
		 */
	
	}
	
}
