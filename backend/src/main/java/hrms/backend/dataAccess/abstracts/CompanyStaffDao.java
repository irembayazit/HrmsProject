package hrms.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.backend.entities.concretes.CompanyStaff;

public interface CompanyStaffDao extends JpaRepository<CompanyStaff, Integer> {

}