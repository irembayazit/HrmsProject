package projeHrms.Hrms.business.abstracts;

import java.util.List;

import projeHrms.Hrms.core.utilities.results.DataResult;
import projeHrms.Hrms.entities.concretes.JobPosition;

public interface JobPositionService{
	DataResult<List<JobPosition>> getAll();
}
