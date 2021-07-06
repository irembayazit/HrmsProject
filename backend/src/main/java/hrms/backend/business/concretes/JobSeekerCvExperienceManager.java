package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.JobSeekerCvExperienceService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobSeekerCvExperienceDao;
import hrms.backend.entities.concretes.JobSeekerCvExperience;

@Service
public class JobSeekerCvExperienceManager implements JobSeekerCvExperienceService{
	
	private JobSeekerCvExperienceDao cvExperienceDao;

	@Autowired
	public JobSeekerCvExperienceManager(JobSeekerCvExperienceDao cvExperienceDao) {
		super();
		this.cvExperienceDao = cvExperienceDao;
	}

	@Override
	public Result add(JobSeekerCvExperience cvExperience) {
		this.cvExperienceDao.save(cvExperience);
		return new SuccessResult("bilgiler eklendi");
	}

	@Override
	public DataResult<List<JobSeekerCvExperience>> findAllByJobSeekerCv_UserIdOrderByEndYearDesc(int userId) {
		
		List<JobSeekerCvExperience> cvExperiences = this.cvExperienceDao.findAllByJobSeeker_UserIdOrderByEndYearDesc(userId);
		
		for(JobSeekerCvExperience cvExperience : cvExperiences) {
			if(cvExperience.getEndYear() == null) {
				return new SuccessDataResult<List<JobSeekerCvExperience>>(cvExperiences,"Devam ediyor");
			}
		}
		
		return new SuccessDataResult<List<JobSeekerCvExperience>>(cvExperiences);
	}

	@Override
	public DataResult<List<JobSeekerCvExperience>> getByJobSeeker_UserId(int userId) {
		return new SuccessDataResult<List<JobSeekerCvExperience>>(cvExperienceDao.getByJobSeeker_UserId(userId));
	}
	
	
}
