package hrms.backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.abstracts.JobSeekerCvExperienceService;
import hrms.backend.entities.concretes.JobSeekerCvExperience;

@RestController
@RequestMapping(value = "/api/cvExperience")
public class JobSeekerCvExperienceController {

	private JobSeekerCvExperienceService cvExperienceService;

	@Autowired
	public JobSeekerCvExperienceController(JobSeekerCvExperienceService cvExperienceService) {
		super();
		this.cvExperienceService = cvExperienceService;
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> add(@RequestBody JobSeekerCvExperience cvExperience) {
		return ResponseEntity.ok(this.cvExperienceService.add(cvExperience));
		
	}
	
	@GetMapping(value = "/getExperienceDesc")
	public ResponseEntity<?> ExperienceDesc(@RequestParam int userId){
		return ResponseEntity.ok(this.cvExperienceService.findAllByJobSeeker_UserIdOrderByEndYearDesc(userId));
	}
	
}
