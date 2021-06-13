package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.EmailActivation;

public interface EmailActivationDao extends JpaRepository<EmailActivation, Integer> {

}

