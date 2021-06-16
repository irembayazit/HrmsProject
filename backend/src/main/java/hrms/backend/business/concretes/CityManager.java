package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.CityService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.dataAccess.abstracts.CityDao;
import hrms.backend.entities.concretes.City;

@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Şehirler listelendi");
	}

}
