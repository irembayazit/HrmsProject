package hrms.backend.business.abstracts;

import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvCoverLetter;

public interface JobSeekerCvCoverLetterService {
	
	Result add(JobSeekerCvCoverLetter coverLetter);
	
}
