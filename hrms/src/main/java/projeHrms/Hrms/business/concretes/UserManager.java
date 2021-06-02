package projeHrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeHrms.Hrms.business.abstracts.UserService;
import projeHrms.Hrms.core.utilities.results.DataResult;
import projeHrms.Hrms.core.utilities.results.Result;
import projeHrms.Hrms.core.utilities.results.SuccessDataResult;
import projeHrms.Hrms.core.utilities.results.SuccessResult;
import projeHrms.Hrms.dataAccess.abstracts.UserDao;
import projeHrms.Hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired 
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("bilgiler eklendi") ;
	}

}
