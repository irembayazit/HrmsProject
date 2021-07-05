package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.JobSeekerCvEducationService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobSeekerCvEducationDao;
import hrms.backend.entities.concretes.JobSeekerCvEducation;

@Service
public class JobSeekerCvEducationManager implements JobSeekerCvEducationService{
	
	private JobSeekerCvEducationDao educationDao;
	
	public JobSeekerCvEducationManager(JobSeekerCvEducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(JobSeekerCvEducation cvEducation) {
		this.educationDao.save(cvEducation);
		return new SuccessResult("bilgiler eklendi");
	}

	@Override
	public DataResult<List<JobSeekerCvEducation>> findAllByJobSeeker_UserIdOrderByGraduationYearDesc(int userId) {
		
		List<JobSeekerCvEducation> jobSeekerCVEducations = this.educationDao.findAllByJobSeeker_UserIdOrderByGraduationYearDesc(userId);
		
		for(JobSeekerCvEducation  jobSeekerCVEducation : jobSeekerCVEducations) {
			
			if(jobSeekerCVEducation.getGraduationYear()==null) {
				
				return new SuccessDataResult<List<JobSeekerCvEducation>>(jobSeekerCVEducations,"Eğitimi devam ediyor");
			}
		}
				
		return new SuccessDataResult<List<JobSeekerCvEducation>>(jobSeekerCVEducations);
	}

	
}
