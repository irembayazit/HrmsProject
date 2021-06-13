package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
