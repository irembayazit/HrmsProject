package hrms.backend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.JobSeekerCvCoverLetterService;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobSeekerCvCoverLetterDao;
import hrms.backend.entities.concretes.JobSeekerCvCoverLetter;

@Service
public class JobSeekerCvCoverLetterManager implements JobSeekerCvCoverLetterService{

	private JobSeekerCvCoverLetterDao coverLetterDao;
	
	@Autowired
	public JobSeekerCvCoverLetterManager(JobSeekerCvCoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	public Result add(JobSeekerCvCoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("bilgiler eklendi") ;
	}

}
