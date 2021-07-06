package hrms.backend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvLanguage;
import hrms.backend.entities.concretes.JobSeekerCvPhoto;

public interface JobSeekerCvPhotoDao extends JpaRepository<JobSeekerCvPhoto, Integer>{

	List<JobSeekerCvPhoto> getByJobSeeker_UserId(int userId);
}
