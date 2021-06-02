package projeHrms.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import projeHrms.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	JobSeeker findByEmailEquals(String email);
}
