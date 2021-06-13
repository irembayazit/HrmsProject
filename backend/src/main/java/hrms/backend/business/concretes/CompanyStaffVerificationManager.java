package hrms.backend.business.concretes;

import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.CompanyStaffVerificationService;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;

@Service
public class CompanyStaffVerificationManager implements CompanyStaffVerificationService{

	@Override
	public Result Verification() {
		return new SuccessResult();
	}

}
