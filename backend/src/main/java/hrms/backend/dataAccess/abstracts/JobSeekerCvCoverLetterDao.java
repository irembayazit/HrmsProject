package hrms.backend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvCoverLetter;

public interface JobSeekerCvCoverLetterDao extends JpaRepository<JobSeekerCvCoverLetter, Integer>{

	List<JobSeekerCvCoverLetter> getByJobSeeker_UserId(int userId);
}
