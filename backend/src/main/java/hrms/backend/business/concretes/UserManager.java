package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.UserService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.UserDao;
import hrms.backend.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private final UserDao userDao;
	
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

	@Override
	public Result isEmailExist(final String email) {
		if (this.userDao.findByEmail(email) != null) {
			return new ErrorResult("Email already exist");
		}
		return new SuccessResult();
	}

	@Override
	public Result save(User user) {
		this.userDao.save(user); 
		return new SuccessResult("Kayıt işlemi başarılı");
	}	

}
