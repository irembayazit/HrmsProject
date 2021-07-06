package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvAddress;

public interface JobSeekerCvAddressService {
	Result add(JobSeekerCvAddress jobSeekerCvAddress);
	DataResult<List<JobSeekerCvAddress>> getByUserId(int userId);
}
