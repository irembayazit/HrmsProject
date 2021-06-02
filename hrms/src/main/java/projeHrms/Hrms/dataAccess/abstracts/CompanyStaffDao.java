package projeHrms.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import projeHrms.Hrms.entities.concretes.CompanyStaff;

public interface CompanyStaffDao extends JpaRepository<CompanyStaff, Integer> {

}