package hrms.backend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.ValidationRules.EmployerValidator;
import hrms.backend.business.abstracts.EmployerService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.Employer;
import hrms.backend.entities.dtos.EmployerForRegisterDto;

@RestController
@RequestMapping("/api/employer")

public class EmployerController {
	private EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/register")
	public Result  register(@RequestBody final EmployerForRegisterDto employerForRegisterDto){
		final Result result =  new EmployerValidator().control(employerForRegisterDto);
		
		if(result.isSuccess()==true)
			return this.employerService.register(employerForRegisterDto);			
		
		return result;	
	}
	
}
