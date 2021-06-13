package hrms.backend.core.utilities.business;

import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;

public class BusinessRules {
	
	public static Result run(final Result... logics) {
		
		for (final Result logic : logics)
			
			if (!logic.isSuccess())
				return logic;
		
		return new SuccessResult();
		
	}
	
}
