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
		
		
		if(dto.getWebSite().equals(email)==false) {
			return new ErrorResult("e-posta'nız web sitenizin ile aynı domain adına sahip olmalı");
		}
		if(dto.getPhone().isEmpty() || dto.getPhone().length()<11) {
			return new ErrorResult("Lütfen geçerli bir tel no giriniz");
		}
		if(password.equals(passwordAgain)==false) {
			return new ErrorResult("Şifreler aynı değil");
			
		}
		
		return new SuccessResult();
		
	}
}	
