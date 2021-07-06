package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.UserService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobSeekerCvAddressDao;
import hrms.backend.dataAccess.abstracts.JobSeekerCvCoverLetterDao;
import hrms.backend.dataAccess.abstracts.JobSeekerCvEducationDao;
import hrms.backend.dataAccess.abstracts.JobSeekerCvExperienceDao;
import hrms.backend.dataAccess.abstracts.JobSeekerCvLanguageDao;
import hrms.backend.dataAccess.abstracts.JobSeekerCvPhotoDao;
import hrms.backend.dataAccess.abstracts.JobSeekerCvSkillDao;
import hrms.backend.dataAccess.abstracts.UserDao;
import hrms.backend.entities.concretes.User;
import hrms.backend.entities.dtos.CvDto;

@Service
public class UserManager implements UserService{

	private final UserDao userDao;
	private final JobSeekerCvAddressDao jobSeekerCvAddressDao;
	private final JobSeekerCvPhotoDao jobSeekerCvPhotoDao;
	private final JobSeekerCvEducationDao jobSeekerCvEducationDao;
	private final JobSeekerCvExperienceDao jobSeekerCvExperienceDao;
	private final JobSeekerCvLanguageDao jobSeekerCvLanguageDao;
	private final JobSeekerCvSkillDao jobSeekerCvSkillDao;
	private final JobSeekerCvCoverLetterDao jobSeekerCvCoverLetterDao;
	
	@Autowired 
	public UserManager(UserDao userDao, JobSeekerCvAddressDao jobSeekerCvAddressDao, JobSeekerCvPhotoDao jobSeekerCvPhotoDao,
			JobSeekerCvEducationDao jobSeekerCvEducationDao, JobSeekerCvExperienceDao jobSeekerCvExperienceDao,
			JobSeekerCvLanguageDao jobSeekerCvLanguageDao, JobSeekerCvSkillDao jobSeekerCvSkillDao,
			JobSeekerCvCoverLetterDao jobSeekerCvCoverLetterDao) {
		super();
		this.userDao = userDao;
		this.jobSeekerCvAddressDao = jobSeekerCvAddressDao;
		this.jobSeekerCvPhotoDao = jobSeekerCvPhotoDao;
		this.jobSeekerCvEducationDao = jobSeekerCvEducationDao;
		this.jobSeekerCvExperienceDao = jobSeekerCvExperienceDao;
		this.jobSeekerCvLanguageDao = jobSeekerCvLanguageDao;
		this.jobSeekerCvSkillDao = jobSeekerCvSkillDao;
		this.jobSeekerCvCoverLetterDao = jobSeekerCvCoverLetterDao;
	}


	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("bilgiler eklendi") ;
	}

	@Override
	public Result isEmailExist(final String email) {
		if (this.userDao.findByEmail(email) != null) {
			return new ErrorResult("Email already exist");
		}
		return new SuccessResult();
	}

	@Override
	public Result save(User user) {
		this.userDao.save(user); 
		return new SuccessResult("Kayıt işlemi başarılı");
	}

	@Override
	public DataResult<CvDto> CvDetailsGetByUSerId(int userId) {
		CvDto cvDto = new CvDto(jobSeekerCvAddressDao.getByJobSeeker_UserId(userId),
				jobSeekerCvCoverLetterDao.getByJobSeeker_UserId(userId),
				jobSeekerCvEducationDao.getByJobSeeker_UserId(userId),
				jobSeekerCvExperienceDao.getByJobSeeker_UserId(userId), 
				jobSeekerCvLanguageDao.getByJobSeeker_UserId(userId),
				jobSeekerCvSkillDao.getByJobSeeker_UserId(userId),
				jobSeekerCvPhotoDao.getByJobSeeker_UserId(userId));
		return new SuccessDataResult<CvDto>(cvDto);
	}
	

}
