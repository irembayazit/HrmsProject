package hrms.backend.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.abstracts.JobSeekerCvSkillService;
import hrms.backend.entities.concretes.JobSeekerCvSkill;

@RestController
@RequestMapping("/api/cvSkill")
public class JobSeekerCvSkillController {

	private JobSeekerCvSkillService jobSeekerCvSkillService;

	public JobSeekerCvSkillController(JobSeekerCvSkillService jobSeekerCvSkillService) {
		super();
		this.jobSeekerCvSkillService = jobSeekerCvSkillService;
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> add(@RequestBody JobSeekerCvSkill jobSeekerCvSkill) {
		return ResponseEntity.ok(this.jobSeekerCvSkillService.add(jobSeekerCvSkill));
		
	}
}
