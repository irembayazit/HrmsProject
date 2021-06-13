package hrms.backend.business.abstracts;

import hrms.backend.core.adapters.Mernis;
import hrms.backend.core.business.BaseService;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.MernisActivation;

public interface MernisActivationService  extends BaseService<MernisActivation, Integer> {
	Result check(Mernis mernis);
}
