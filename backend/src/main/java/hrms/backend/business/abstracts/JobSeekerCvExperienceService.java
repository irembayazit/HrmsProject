package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvExperience;

public interface JobSeekerCvExperienceService {
	
	Result add(JobSeekerCvExperience cvExperience);
	DataResult<List<JobSeekerCvExperience>>  findAllByJobSeekerCv_UserIdOrderByEndYearDesc(int userId);
	DataResult<List<JobSeekerCvExperience>> getByJobSeeker_UserId(int userId);
}
