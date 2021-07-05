package hrms.backend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.JobSeekerCvSkillService;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobSeekerCvSkillDao;
import hrms.backend.entities.concretes.JobSeekerCvSkill;

@Service
public class JobSeekerCvSkillManager implements JobSeekerCvSkillService{

	private JobSeekerCvSkillDao jobSeekerCvSkillDao;

	@Autowired
	public JobSeekerCvSkillManager(JobSeekerCvSkillDao jobSeekerCvSkillDao) {
		super();
		this.jobSeekerCvSkillDao = jobSeekerCvSkillDao;
	}

	@Override
	public Result add(JobSeekerCvSkill jobSeekerCvSkill) {
		this.jobSeekerCvSkillDao.save(jobSeekerCvSkill);
		return new SuccessResult("Bilgiler eklendi");
	}
	
	
}
