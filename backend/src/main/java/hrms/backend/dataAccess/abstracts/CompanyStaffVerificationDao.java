package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.CompanyStaffVerification;

public interface CompanyStaffVerificationDao extends JpaRepository<CompanyStaffVerification, Integer> {

}
