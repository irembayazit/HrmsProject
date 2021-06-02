package projeHrms.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeHrms.Hrms.business.abstracts.JobSeekerService;
import projeHrms.Hrms.core.adapters.MernisSerivceAdapter;
import projeHrms.Hrms.core.adapters.MernisService;
import projeHrms.Hrms.core.utilities.results.ErrorResult;
import projeHrms.Hrms.core.utilities.results.Result;
import projeHrms.Hrms.core.utilities.results.SuccessResult;
import projeHrms.Hrms.dataAccess.abstracts.JobSeekerDao;
import projeHrms.Hrms.dataAccess.abstracts.UserDao;
import projeHrms.Hrms.entities.concretes.JobSeeker;
import projeHrms.Hrms.entities.concretes.User;
import projeHrms.Hrms.entities.dtos.JobSeekerForRegisterDto;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	private UserDao userDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,UserDao userDao) {
		super();
		this.jobSeekerDao = jobSeekerDao; 
		this.userDao = userDao;
	}

	@Override
	public Result register(JobSeekerForRegisterDto jobSeekerForRegisterDto){
						
		User user = new User(jobSeekerForRegisterDto.getEmail(),jobSeekerForRegisterDto.getPassword());
		this.userDao.save(user);
		
		JobSeeker jobSeeker = new JobSeeker(user.getId(),
				jobSeekerForRegisterDto.getName(),
				jobSeekerForRegisterDto.getSurname(),
				jobSeekerForRegisterDto.getIdentityNumber(),
				jobSeekerForRegisterDto.getBirthDate());
				
		/*if(this.mernisService.ChechkIfPeron(jobSeeker)) {
			this.jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Kayıt işlemi başarılı") ;
		}*/
		
		
		Result result = checkEmail(jobSeekerForRegisterDto.getEmail());
		if(result.isSuccess() == true) {
			return new SuccessResult("Kayıt işlemi başarılı") ;
		}
		
		
		return new ErrorResult("Not a valid person") ;
	}
	
	public Result checkEmail(String email) {
		if(this.jobSeekerDao.findByEmailEquals(email)!=null)
			return new SuccessResult();
		return new ErrorResult("bu email daha önce alınmış");
	}

}
