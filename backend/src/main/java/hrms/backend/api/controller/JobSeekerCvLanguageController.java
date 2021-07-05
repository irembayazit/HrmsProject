package hrms.backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.abstracts.JobSeekerCvLanguageService;
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
}
