package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvPhoto;
import hrms.backend.entities.concretes.JobSeekerCvSkill;

public interface JobSeekerCvSkillService {

	Result add(JobSeekerCvSkill jobSeekerCvSkill);
	DataResult<List<JobSeekerCvSkill>> getByJobSeeker_UserId(int userId);
}
