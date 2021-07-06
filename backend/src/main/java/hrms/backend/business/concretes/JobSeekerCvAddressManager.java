package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.JobSeekerCvAddressService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobSeekerCvAddressDao;
import hrms.backend.entities.concretes.JobSeekerCvAddress;

@Service
public class JobSeekerCvAddressManager implements JobSeekerCvAddressService{

	private JobSeekerCvAddressDao jobSeekerCvAddressDao;

	@Autowired
	public JobSeekerCvAddressManager(JobSeekerCvAddressDao jobSeekerCvAddressDao) {
		super();
		this.jobSeekerCvAddressDao = jobSeekerCvAddressDao;
	}

	@Override
	public Result add(JobSeekerCvAddress jobSeekerCvAddress) {
		this.jobSeekerCvAddressDao.save(jobSeekerCvAddress);
		return new SuccessResult("Bilgiler eklendi");
	}

	@Override
	public DataResult<List<JobSeekerCvAddress>> getByUserId(int userId) {
		return new SuccessDataResult<List<JobSeekerCvAddress>>(jobSeekerCvAddressDao.getByJobSeeker_UserId(userId));
	}
	
	
}
