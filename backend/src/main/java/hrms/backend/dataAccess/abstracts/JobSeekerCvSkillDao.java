package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvSkill;

public interface JobSeekerCvSkillDao extends JpaRepository<JobSeekerCvSkill, Integer>{

}
