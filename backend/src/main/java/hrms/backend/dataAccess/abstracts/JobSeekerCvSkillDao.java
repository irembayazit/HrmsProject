package hrms.backend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvPhoto;
import hrms.backend.entities.concretes.JobSeekerCvSkill;

public interface JobSeekerCvSkillDao extends JpaRepository<JobSeekerCvSkill, Integer>{

	List<JobSeekerCvSkill> getByJobSeeker_UserId(int userId);
}
