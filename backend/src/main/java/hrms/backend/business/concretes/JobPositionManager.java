package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.JobPositionService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobPositionDao;
import hrms.backend.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		
		Result result = isPositionExist(jobPosition.getTitle());
		
		if(!result.isSuccess()){
			return result;
		}
		
		jobPositionDao.save(jobPosition);
		
		return new SuccessResult("iş pozisyonu eklendi");
	}
	
	@Override
	public Result isPositionExist(String title) {
		if (this.jobPositionDao.findByTitle(title) != null) {
			return new ErrorResult("invalid title");
		}
		return new SuccessResult();
	}
	
}
