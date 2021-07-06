package hrms.backend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.abstracts.JobSeekerCvLanguageService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.entities.concretes.JobSeekerCvExperience;
import hrms.backend.entities.concretes.JobSeekerCvLanguage;

@RestController
@RequestMapping(value = "/api/cvLanguage")
public class JobSeekerCvLanguageController {
	private JobSeekerCvLanguageService cvLanguageService;

	@Autowired
	public JobSeekerCvLanguageController(JobSeekerCvLanguageService cvLanguageService) {
		super();
		this.cvLanguageService = cvLanguageService;
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> add(@RequestBody JobSeekerCvLanguage cvLanguage){
		return ResponseEntity.ok(this.cvLanguageService.add(cvLanguage));
	}
	
	@GetMapping(value = "/getById")
	public DataResult<List<JobSeekerCvLanguage>> getById(int userId){
		return this.cvLanguageService.getByJobSeeker_UserId(userId);
	}
}
