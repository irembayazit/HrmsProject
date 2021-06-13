package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{
	JobPosition findByTitle(String title);
}
 