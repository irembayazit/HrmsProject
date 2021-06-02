package projeHrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeHrms.Hrms.business.abstracts.JobPositionService;
import projeHrms.Hrms.core.utilities.results.DataResult;
import projeHrms.Hrms.core.utilities.results.SuccessDataResult;
import projeHrms.Hrms.dataAccess.abstracts.JobPositionDao;
import projeHrms.Hrms.entities.concretes.JobPosition;

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
	
}
