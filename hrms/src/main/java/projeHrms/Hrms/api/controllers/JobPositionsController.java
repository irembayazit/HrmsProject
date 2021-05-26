package projeHrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeHrms.Hrms.business.abstracts.JobPositionService;
import projeHrms.Hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobposition")

public class JobPositionsController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> GetAll(){
		return this.jobPositionService.getAll();
	}
	
	
}
