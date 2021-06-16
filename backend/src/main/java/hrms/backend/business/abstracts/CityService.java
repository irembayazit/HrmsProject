package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
}
