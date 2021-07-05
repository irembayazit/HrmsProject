 package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvEducation;

public interface JobSeekerCvEducationService {

	Result add(JobSeekerCvEducation cvEducation);
	DataResult<List<JobSeekerCvEducation>>  findAllByJobSeeker_UserIdOrderByGraduationYearDesc(int userId);
	
}
 