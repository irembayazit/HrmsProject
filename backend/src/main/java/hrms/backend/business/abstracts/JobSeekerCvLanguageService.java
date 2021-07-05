package hrms.backend.business.abstracts;

import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvLanguage;

public interface JobSeekerCvLanguageService {
	
	Result add(JobSeekerCvLanguage cvLanguage);
	
}
