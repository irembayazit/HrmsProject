package hrms.backend.business.ValidationRules;

import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.entities.concretes.JobAdvertisement;

public class JobAdvertisementValidator {
	
	public Result control(JobAdvertisement jobAdvertisement) {
		
		if(jobAdvertisement.getDefinition().isEmpty()) {
			return new ErrorResult("Tanım alanı bos geçilemez");
		} 
		if(jobAdvertisement.getMaxSalary() < jobAdvertisement.getMinSalary()) {
			return new ErrorResult("Maaş bilgilerini dogru giriniz");
		}
		if(jobAdvertisement.getOpenPoisitons() <= 0) {
			return new ErrorResult("Açık pozisyon alanını dogru giriniz");
		}
		if(jobAdvertisement.getOpenPoisitons() <= 0) {
			return new ErrorResult("Açık pozisyon alanını dogru giriniz");
		}
		
		return new SuccessResult();
		
	}
}
