package hrms.backend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.JobSeekerCvLanguageService;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobSeekerCvLanguageDao;
import hrms.backend.entities.concretes.JobSeekerCvLanguage;


@Service
public class JobSeekerCvLanguageManager implements JobSeekerCvLanguageService{

	private JobSeekerCvLanguageDao languageDao;
	
	@Autowired
	public JobSeekerCvLanguageManager(JobSeekerCvLanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public Result add(JobSeekerCvLanguage cvLanguage) {
		this.languageDao.save(cvLanguage);
		return new SuccessResult("Bilgiler eklendi");
	}

}
