package projeHrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeHrms.Hrms.business.abstracts.JobPositionService;
import projeHrms.Hrms.core.utilities.results.DataResult;
import projeHrms.Hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")

public class JobPositionsController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionService.getAll();
	}
	
	
}
