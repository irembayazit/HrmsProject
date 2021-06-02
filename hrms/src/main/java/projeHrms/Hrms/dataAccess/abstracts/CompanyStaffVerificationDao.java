package projeHrms.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import projeHrms.Hrms.entities.concretes.CompanyStaffVerification;

public interface CompanyStaffVerificationDao extends JpaRepository<CompanyStaffVerification, Integer> {

}
