package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvLanguage;

public interface JobSeekerCvLanguageDao extends JpaRepository<JobSeekerCvLanguage, Integer>{

		
}
