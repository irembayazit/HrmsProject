package projeHrms.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import projeHrms.Hrms.entities.concretes.EmailActivation;

public interface EmailActivationDao extends JpaRepository<EmailActivation, Integer> {

}
