package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvCoverLetter;

public interface JobSeekerCvCoverLetterDao extends JpaRepository<JobSeekerCvCoverLetter, Integer>{

}
