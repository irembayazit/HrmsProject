package projeHrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeHrms.Hrms.business.abstracts.UserService;
import projeHrms.Hrms.core.utilities.results.DataResult;
import projeHrms.Hrms.core.utilities.results.Result;
import projeHrms.Hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")

public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getall(){
		return this.userService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody User user){
		return this.userService.add(user);
	}
	
}
