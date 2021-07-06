package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvCoverLetter;

public interface JobSeekerCvCoverLetterService {
	
	Result add(JobSeekerCvCoverLetter coverLetter);
	DataResult<List<JobSeekerCvCoverLetter>> getByJobSeeker_UserId(int userId);
}
