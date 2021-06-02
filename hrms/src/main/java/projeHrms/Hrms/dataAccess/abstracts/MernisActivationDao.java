package projeHrms.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import projeHrms.Hrms.entities.concretes.MernisActivation;

public interface MernisActivationDao extends JpaRepository<MernisActivation, Integer> {

}