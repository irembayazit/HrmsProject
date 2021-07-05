package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobSeekerCvPhoto;

public interface JobSeekerCvPhotoDao extends JpaRepository<JobSeekerCvPhoto, Integer>{

}
