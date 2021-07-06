package hrms.backend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvLanguage;

public interface JobSeekerCvLanguageDao extends JpaRepository<JobSeekerCvLanguage, Integer>{

	List<JobSeekerCvLanguage> getByJobSeeker_UserId(int userId);
}
