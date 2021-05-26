package projeHrms.Hrms.business.abstracts;

import java.util.List;

import projeHrms.Hrms.entities.concretes.JobPosition;

public interface JobPositionService{
	List<JobPosition> getAll();
}
