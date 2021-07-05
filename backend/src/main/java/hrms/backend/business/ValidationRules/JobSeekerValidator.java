package hrms.backend.business.ValidationRules;

import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.entities.dtos.JobSeekerForRegisterDto;

public class JobSeekerValidator{	
	
	
	public Result control(JobSeekerForRegisterDto dto) {
		
		String password = dto.getPassword();
		String passwordAgain = dto.getPasswordAgain();
		
		if(dto.getIdentityNumber().length()!=11) {
			return new ErrorResult("Lütfen geçerli bir kimlik no giriniz");
		}
		if(password.equals(passwordAgain)==false) {
			return new ErrorResult("Şifreler aynı değil");
			
		}
		
		return new SuccessResult();
		
	}
}
	

