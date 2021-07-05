package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvAddress;

public interface JobSeekerCvAddressDao extends JpaRepository<JobSeekerCvAddress, Integer>{

}
