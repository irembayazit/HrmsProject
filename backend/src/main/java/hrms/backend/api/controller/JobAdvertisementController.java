package hrms.backend.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.ValidationRules.JobAdvertisementValidator;
import hrms.backend.business.abstracts.JobAdvertisementService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobAdvertisement;
import hrms.backend.entities.dtos.JobAdvertisementForListDto;

@RestController
@RequestMapping("/api/jobAdvertisement")

public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;

	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result  add(@RequestBody final JobAdvertisement jobAdvertisement){
		
		final Result result =  new JobAdvertisementValidator().control(jobAdvertisement);
		
		if(result.isSuccess()==true)
			return this.jobAdvertisementService.add(jobAdvertisement);			
		
		return result;
	}
	
	@GetMapping("/isActiveTrue")
    public DataResult<List<JobAdvertisementForListDto>> getByIsActiveTrue(){
        return this.jobAdvertisementService.getAllByIsActiveForList();
    }
	
	@GetMapping("/isActiveTrueAndDate")
    public DataResult<List<JobAdvertisementForListDto>> getByIsActiveTrueAndDate(String sort){
        return this.jobAdvertisementService.findAllByIsActiveOrderByDeadlineForList(sort);
    }
	
	@GetMapping("/getByIsActiveTrueAndCompanyName")
    public DataResult<List<JobAdvertisementForListDto>> getByIsActiveTrueAndCompanyName(String companyName){
        return this.jobAdvertisementService.findAllByIsActiveAndEmployer_CompanyNameForList(companyName);
    }
	
}
