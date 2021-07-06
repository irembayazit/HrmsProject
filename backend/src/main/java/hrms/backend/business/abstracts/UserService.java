package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.User;
import hrms.backend.entities.dtos.CvDto;

public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);
	Result isEmailExist(final String email);
	Result save(User user);
	DataResult<CvDto> CvDetailsGetByUSerId(int userId);
}
