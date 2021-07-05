package hrms.backend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvEducation;


public interface JobSeekerCvEducationDao extends JpaRepository<JobSeekerCvEducation, Integer>{
	
	List<JobSeekerCvEducation> findAllByJobSeeker_UserIdOrderByGraduationYearDesc(int userId);
}
