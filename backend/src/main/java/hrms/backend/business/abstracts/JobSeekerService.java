package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeeker;
import hrms.backend.entities.dtos.JobSeekerForRegisterDto;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	Result register(JobSeekerForRegisterDto jobSeekerForRegisterDto);
	Result isIdentityNumberExist(final String identityNumber);
	DataResult<JobSeeker> getByUserId(int id);
}
