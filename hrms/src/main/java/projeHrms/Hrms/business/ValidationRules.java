package projeHrms.Hrms.business;

import projeHrms.Hrms.core.utilities.results.ErrorResult;
import projeHrms.Hrms.core.utilities.results.Result;
import projeHrms.Hrms.core.utilities.results.SuccessResult;
import projeHrms.Hrms.entities.dtos.JobSeekerForRegisterDto;

public class ValidationRules{	
	
	
	public Result control(JobSeekerForRegisterDto dto) {
		
		System.out.println("merhaba*******************");
		
		if(dto.getEmail() == null) {
			return new ErrorResult("Email kısmı geçilemez");
		}
		if(dto.getName().length() < 4) {
			return new ErrorResult("İsim alanı bos geçilemez");
		}
		if(dto.getSurname() == null) {
			return new ErrorResult("Soyisim alanı bos geçilemez");
		}
		if(dto.getIdentityNumber() == null || dto.getIdentityNumber().length()!=11) {
			return new ErrorResult("Lütfen geçerli bir kimlik no giriniz");
		}
		if(dto.getPassword() == null) {
			return new ErrorResult("Şifre alanı boş geçilemez");
		}
		
		return new SuccessResult();
		
	}
}
	

