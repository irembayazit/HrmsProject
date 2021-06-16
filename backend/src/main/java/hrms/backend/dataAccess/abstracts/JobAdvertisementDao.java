package hrms.backend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.backend.entities.concretes.JobAdvertisement;
import hrms.backend.entities.dtos.JobAdvertisementForListDto;

public interface JobAdvertisementDao  extends JpaRepository<JobAdvertisement,Integer>{

	@Query("SELECT new hrms.backend.entities.dtos.JobAdvertisementForListDto"
			+ "(e.companyName,p.title,j.openPoisitons,j.releaseDate,j.deadline)"
			+ " FROM JobAdvertisement j JOIN j.employer e JOIN j.jobPosition p WHERE j.isActive=true")
	List<JobAdvertisementForListDto> findAllByIsActiveForList();
	
	
	@Query("SELECT new hrms.backend.entities.dtos.JobAdvertisementForListDto"
			+ "(e.companyName,p.title,j.openPoisitons,j.releaseDate,j.deadline)"
			+ " FROM JobAdvertisement j JOIN j.employer e JOIN j.jobPosition p WHERE j.isActive=true ORDER BY j.deadline ")
	List<JobAdvertisementForListDto> findAllByIsActiveOrderByDeadlineForList();
	
	
	@Query("SELECT new hrms.backend.entities.dtos.JobAdvertisementForListDto"
			+ "(e.companyName,p.title,j.openPoisitons,j.releaseDate,j.deadline)"
			+ " FROM JobAdvertisement j JOIN j.employer e JOIN j.jobPosition p WHERE j.isActive=true ORDER BY j.deadline DESC")
	List<JobAdvertisementForListDto> findAllByIsActiveOrderByDeadlineDescForList();

	
	@Query("SELECT new hrms.backend.entities.dtos.JobAdvertisementForListDto"
			+ "(e.companyName,p.title,j.openPoisitons,j.releaseDate,j.deadline)"
			+ " FROM JobAdvertisement j JOIN j.employer e JOIN j.jobPosition p WHERE j.isActive=true AND e.companyName=:companyName ")
	List<JobAdvertisementForListDto> findAllByIsActiveAndEmployer_CompanyNameForList(String companyName);

	
}
