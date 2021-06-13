package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.CompanyStaffVerificationService;
import hrms.backend.business.abstracts.EmailActivationService;
import hrms.backend.business.abstracts.EmployerService;
import hrms.backend.business.abstracts.UserService;
import hrms.backend.core.utilities.business.BusinessRules;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.EmployerDao;
import hrms.backend.entities.concretes.Employer;
import hrms.backend.entities.concretes.User;
import hrms.backend.entities.dtos.EmployerForRegisterDto;

@Service
public class EmployerManager implements EmployerService {
	private final EmployerDao employerDao;
	private final EmailActivationService emailActivationService;
	private final UserService userService;
	private CompanyStaffVerificationService staffVerificationService;

	public EmployerManager(
			EmployerDao employerDao,
			EmailActivationService emailActivationService,
			UserService userService,
			CompanyStaffVerificationService staffVerificationService) {
		
		super();
		this.employerDao = employerDao;
		this.emailActivationService = emailActivationService;
		this.userService = userService;
		this.staffVerificationService = staffVerificationService;
	}

	@Override
	public Result register(EmployerForRegisterDto employerForRegisterDto) {
		
		final Result result = BusinessRules.run(				
			userService.isEmailExist(employerForRegisterDto.getEmail()),
			staffVerificationService.Verification()
			);
	
		if(!result.isSuccess()){
			return result;
		}
			
		final User user = new User(employerForRegisterDto.getEmail(),employerForRegisterDto.getPassword());
		this.userService.save(user); 
		
		emailActivationService.Send(user.getId());
		
		final Employer employer = new Employer(user.getId(),
				employerForRegisterDto.getCompanyName(),
				employerForRegisterDto.getWebSite(),
				employerForRegisterDto.getPhone());
				
		this.employerDao.save(employer);
		

		emailActivationService.Send(user.getId());
		
		
		return new SuccessResult("Kayıt işlemi başarılı") ;	
		
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data listelendi");
	}

	
}
