package hrms.backend.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	JobSeeker  findByIdentityNumber(String identityNumber);
	
}
