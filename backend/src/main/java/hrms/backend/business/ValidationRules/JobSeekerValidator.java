package hrms.backend.business.ValidationRules;

import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.entities.dtos.JobSeekerForRegisterDto;

public class JobSeekerValidator{	
	
	
	public Result control(JobSeekerForRegisterDto dto) {
		
		String password = dto.getPassword();
		String passwordAgain = dto.getPasswordAgain();
		
		if(dto.getEmail().isEmpty()) {
			return new ErrorResult("Email kısmı geçilemez");
		}
		if(dto.getName().isEmpty()) {
			return new ErrorResult("İsim alanı bos geçilemez");
		}
		if(dto.getSurname().isEmpty()) {
			return new ErrorResult("Soyisim alanı bos geçilemez");
		}
		if(dto.getIdentityNumber().isEmpty()|| dto.getIdentityNumber().length()!=11) {
			return new ErrorResult("Lütfen geçerli bir kimlik no giriniz");
		}
		if(dto.getPassword().isEmpty()) {
			return new ErrorResult("Şifre alanı boş geçilemez");
		}
		if(password.equals(passwordAgain)==false) {
			return new ErrorResult("Şifreler aynı değil");
			
		}
		
		return new SuccessResult();
		
	}
}
	

