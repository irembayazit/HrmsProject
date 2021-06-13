package hrms.backend.business.ValidationRules;

import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.entities.concretes.JobPosition;

public class JobPositionValidator {
	
	public Result control(JobPosition jobPosition) {
	
		if(jobPosition.getTitle().isEmpty()) {
			return new ErrorResult("İsim alanı bos geçilemez");
		}
		return new SuccessResult();
		
	}
}
