package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobPosition;

public interface JobPositionService{
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	Result isPositionExist(String title);
}
