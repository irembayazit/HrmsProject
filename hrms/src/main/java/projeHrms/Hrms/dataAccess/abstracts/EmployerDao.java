package projeHrms.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import projeHrms.Hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
