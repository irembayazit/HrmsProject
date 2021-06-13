package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.MernisActivation;

public interface MernisActivationDao extends JpaRepository<MernisActivation, Integer> {

}