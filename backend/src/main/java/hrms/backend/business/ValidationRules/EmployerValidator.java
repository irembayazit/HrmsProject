package hrms.backend.business.ValidationRules;

import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.entities.dtos.EmployerForRegisterDto;

public class EmployerValidator {
	
	public Result control(EmployerForRegisterDto dto) {
		
		String password = dto.getPassword();
		String passwordAgain = dto.getPasswordAgain();
		
		String[] index = dto.getEmail().split("@");
		String email = index[0];
		
		System.out.println(index + " * " + email + dto.getWebSite());
		
		
		if(dto.getCompanyName().isEmpty()) {
			return new ErrorResult("İsim alanı bos geçilemez");
		}
		if(dto.getEmail().isEmpty()) {
			return new ErrorResult("Email kısmı boş geçilemez");
		}
		if(dto.getWebSite().isEmpty()) {
			return new ErrorResult("web site kısmı boş geçilemez");
		}
		if(dto.getWebSite().equals(email)==false) {
			return new ErrorResult("e-posta'nız web sitenizin ile aynı domain adına sahip olmalı");
		}
		if(dto.getPhone().isEmpty() || dto.getPhone().length()<11) {
			return new ErrorResult("Lütfen geçerli bir tel no giriniz");
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
