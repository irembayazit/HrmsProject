package hrms.backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.abstracts.JobSeekerCvAddressService;
import hrms.backend.core.utilities.results.Result;

import hrms.backend.entities.concretes.JobSeekerCvAddress;

@RestController
@RequestMapping(value = "/api/cvAddress")
public class JobSeekerCvAddressController {

	private JobSeekerCvAddressService addressService;

	@Autowired
	public JobSeekerCvAddressController(JobSeekerCvAddressService addressService) {
		super();
		this.addressService = addressService;
	}
	
	@PostMapping(value = "/addGithubAddress")
	public Result addGithubAddress(@RequestBody JobSeekerCvAddress jobSeekerCvAddress) {
		return this.addressService.add(jobSeekerCvAddress);
	}
}
