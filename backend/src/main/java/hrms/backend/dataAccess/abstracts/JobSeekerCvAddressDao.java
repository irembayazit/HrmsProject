package hrms.backend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvAddress;

public interface JobSeekerCvAddressDao extends JpaRepository<JobSeekerCvAddress, Integer>{
	
	List<JobSeekerCvAddress> getByJobSeeker_UserId(int userId);
}
