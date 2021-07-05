package hrms.backend.business.abstracts;

import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvAddress;

public interface JobSeekerCvAddressService {
	Result add(JobSeekerCvAddress jobSeekerCvAddress);
}
