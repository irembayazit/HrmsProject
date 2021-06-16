package hrms.backend.business.abstracts;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobAdvertisement;
import hrms.backend.entities.dtos.JobAdvertisementForListDto;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisementForListDto>> getAllByIsActiveForList();

	DataResult<List<JobAdvertisementForListDto>> findAllByIsActiveOrderByDeadlineForList(String sort);
	
	DataResult<List<JobAdvertisementForListDto>> findAllByIsActiveAndEmployer_CompanyNameForList(String companyName);

}
