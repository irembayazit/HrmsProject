package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.Employer;
import hrms.backend.entities.dtos.EmployerForRegisterDto;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result register(EmployerForRegisterDto employerForRegisterDto);
}
