package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.EmailActivationService;
import hrms.backend.business.abstracts.JobSeekerService;
import hrms.backend.business.abstracts.MernisActivationService;
import hrms.backend.business.abstracts.UserService;
import hrms.backend.core.adapters.Mernis;
import hrms.backend.core.utilities.business.BusinessRules;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobSeekerDao;
import hrms.backend.entities.concretes.JobSeeker;
import hrms.backend.entities.concretes.User;
import hrms.backend.entities.dtos.JobSeekerForRegisterDto;

@Service
public class JobSeekerManager implements JobSeekerService{

	private final JobSeekerDao jobSeekerDao;
	private final UserService userService;
	private final MernisActivationService mernisActivationService;
	private final EmailActivationService emailActivationService;
	
	@Autowired
	public JobSeekerManager(final JobSeekerDao jobSeekerDao,
							final UserService userService, 
							final MernisActivationService mernisActivationService,
							final EmailActivationService emailActivationService) {
		super();
		this.jobSeekerDao = jobSeekerDao; 
		this.userService = userService;
		this.mernisActivationService = mernisActivationService;
		this.emailActivationService = emailActivationService;
	}

	@Override
	public Result register(final JobSeekerForRegisterDto jobSeekerForRegisterDto){
						
		final Result result = BusinessRules.run(
				
				userService.isEmailExist(jobSeekerForRegisterDto.getEmail()),
				
				isIdentityNumberExist(jobSeekerForRegisterDto.getIdentityNumber()), 
				
				this.mernisActivationService.check(new Mernis(
				jobSeekerForRegisterDto.getIdentityNumber(),
				jobSeekerForRegisterDto.getName(),
				jobSeekerForRegisterDto.getSurname(),
				jobSeekerForRegisterDto.getBirthDate().getYear()))				
				);
		
		if(!result.isSuccess()){
			return result;
		}
		
		final User user = new User(jobSeekerForRegisterDto.getEmail(),jobSeekerForRegisterDto.getPassword());
		this.userService.save(user); 
		
		final JobSeeker jobSeeker = new JobSeeker(user.getId(),
				jobSeekerForRegisterDto.getName(),
				jobSeekerForRegisterDto.getSurname(),
				jobSeekerForRegisterDto.getIdentityNumber(),
				jobSeekerForRegisterDto.getBirthDate());
				
		this.jobSeekerDao.save(jobSeeker);
		

		emailActivationService.Send(user.getId());
		
		
		return new SuccessResult("Kayıt işlemi başarılı") ;		
		
	}

	@Override
	public Result isIdentityNumberExist(String identityNumber) {
		if (this.jobSeekerDao.findByIdentityNumber(identityNumber) != null) {
			return new ErrorResult("invalid identity number");
		}
		return new SuccessResult();
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Data listelendi");
	}

}
