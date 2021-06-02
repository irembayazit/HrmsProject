package projeHrms.Hrms.business.abstracts;

import java.util.List;

import projeHrms.Hrms.core.utilities.results.DataResult;
import projeHrms.Hrms.core.utilities.results.Result;
import projeHrms.Hrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);
}
