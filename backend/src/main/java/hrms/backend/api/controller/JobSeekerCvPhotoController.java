package hrms.backend.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import hrms.backend.business.abstracts.JobSeekerCvPhotoService;
import hrms.backend.core.utilities.results.Result;

@RestController
@RequestMapping(value = "/api/cvPhoto")
public class JobSeekerCvPhotoController {
	
	private JobSeekerCvPhotoService cvPhotoService;

	public JobSeekerCvPhotoController(JobSeekerCvPhotoService cvPhotoService) {
		super();
		this.cvPhotoService = cvPhotoService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestParam int userId, @RequestParam MultipartFile file) {
		return cvPhotoService.upload(userId, file);
	}
	
	
}
