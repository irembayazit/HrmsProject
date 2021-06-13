package hrms.backend.business.abstracts;

import hrms.backend.core.utilities.results.Result;

public interface EmailActivationService {
	Result Send(int user_id);
}
