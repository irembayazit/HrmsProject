package projeHrms.Hrms.business.abstracts;

import projeHrms.Hrms.core.utilities.results.Result;
import projeHrms.Hrms.entities.dtos.JobSeekerForRegisterDto;

public interface JobSeekerService {
	Result register(JobSeekerForRegisterDto jobSeekerForRegisterDto);
}
