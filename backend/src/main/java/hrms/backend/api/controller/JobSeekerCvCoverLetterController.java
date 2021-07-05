package hrms.backend.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.abstracts.JobSeekerCvCoverLetterService;
import hrms.backend.entities.concretes.JobSeekerCvCoverLetter;

@RestController
@RequestMapping("/api/cvCoverLetter")
public class JobSeekerCvCoverLetterController {

	private JobSeekerCvCoverLetterService coverLetterService;

	public JobSeekerCvCoverLetterController(JobSeekerCvCoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> add(@RequestBody JobSeekerCvCoverLetter jobSeekerCvCoverLetter) {
		return ResponseEntity.ok(this.coverLetterService.add(jobSeekerCvCoverLetter));
		
	}
	
}
