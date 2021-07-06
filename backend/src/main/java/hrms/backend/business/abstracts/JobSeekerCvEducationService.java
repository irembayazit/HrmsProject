 package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvEducation;

public interface JobSeekerCvEducationService {

	Result add(JobSeekerCvEducation cvEducation);
	DataResult<List<JobSeekerCvEducation>>  findAllByJobSeekerCv_UserIdOrderByGraduationYearDesc(int userId);
	DataResult<List<JobSeekerCvEducation>> getByJobSeeker_UserId(int userId);
}
 