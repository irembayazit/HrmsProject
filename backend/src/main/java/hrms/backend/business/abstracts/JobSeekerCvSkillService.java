package hrms.backend.business.abstracts;

import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvSkill;

public interface JobSeekerCvSkillService {

	Result add(JobSeekerCvSkill jobSeekerCvSkill);
}
