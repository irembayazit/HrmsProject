package hrms.backend.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.abstracts.EmailActivationService;
import hrms.backend.core.utilities.results.Result;

@RestController
@RequestMapping("/api/emailactivation")

public class EmailActivationController {
	private EmailActivationService activationService;

	public EmailActivationController(EmailActivationService activationService) {
		super();
		this.activationService = activationService;
	}
	
	@PostMapping("/send")
	public Result send(int id){
		return this.activationService.Send(id);
	}
}
