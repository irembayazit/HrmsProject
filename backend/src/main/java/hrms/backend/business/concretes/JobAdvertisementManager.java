package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.JobAdvertisementService;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessDataResult;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobAdvertisementDao;
import hrms.backend.entities.concretes.JobAdvertisement;
import hrms.backend.entities.dtos.JobAdvertisementForListDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("bilgiler eklendi"); 
	}
	
	@Override
	public DataResult<List<JobAdvertisementForListDto>> getAllByIsActiveForList() {
		final List<JobAdvertisementForListDto> jobAdvertForListDtos = jobAdvertisementDao.findAllByIsActiveForList();

		return new SuccessDataResult<List<JobAdvertisementForListDto>>(jobAdvertForListDtos);
	}

	@Override
	public DataResult<List<JobAdvertisementForListDto>> findAllByIsActiveOrderByDeadlineForList(String sort) {
		
		final List<JobAdvertisementForListDto> jobAdvertForListDtos = sort.equals("desc")
				? jobAdvertisementDao.findAllByIsActiveOrderByDeadlineDescForList()
				: jobAdvertisementDao.findAllByIsActiveOrderByDeadlineForList();

		return new SuccessDataResult<List<JobAdvertisementForListDto>>(jobAdvertForListDtos);
	}

	@Override
	public DataResult<List<JobAdvertisementForListDto>> findAllByIsActiveAndEmployer_CompanyNameForList(
			String companyName) { 
		
		final List<JobAdvertisementForListDto> jobAdvertForListDtos = jobAdvertisementDao.findAllByIsActiveAndEmployer_CompanyNameForList(companyName);

		return new SuccessDataResult<List<JobAdvertisementForListDto>>(jobAdvertForListDtos);
	}

}
