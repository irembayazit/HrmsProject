package hrms.backend.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.backend.business.abstracts.CityService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")

public class CitiesController {
	private CityService cityService;

	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<City>> getAll(){
		return this.cityService.getAll();
	}
	
}
