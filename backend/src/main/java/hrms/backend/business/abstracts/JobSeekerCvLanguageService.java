package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvLanguage;

public interface JobSeekerCvLanguageService {
	
	Result add(JobSeekerCvLanguage cvLanguage);
	DataResult<List<JobSeekerCvLanguage>> getByJobSeeker_UserId(int userId);
}
