package hrms.backend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvExperience;

public interface JobSeekerCvExperienceDao extends JpaRepository<JobSeekerCvExperience, Integer>{
	
	List<JobSeekerCvExperience> findAllByJobSeeker_UserIdOrderByEndYearDesc(int userId);
	List<JobSeekerCvExperience> getByJobSeeker_UserId(int userId);
	
}
