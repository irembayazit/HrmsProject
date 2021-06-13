package hrms.backend.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="company_staff_verifications")
public class CompanyStaffVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@NotNull
	@Column(name = "employer_id")
	private int employerId;
	
	@NotNull
	@Column(name = "company_staff_id")
	private int companyStaffId;
	
	@NotNull
	@Column(name = "is_approved")
	private boolean isApproved;
	
	public CompanyStaffVerification() {
		
	}
	
	public CompanyStaffVerification(int id, int employerId, int companyStaffId, boolean isApproved) {
		super();
		this.id = id;
		this.employerId = employerId;
		this.companyStaffId = companyStaffId;
		this.isApproved = isApproved;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public int getCompanyStaffId() {
		return companyStaffId;
	}

	public void setCompanyStaffId(int companyStaffId) {
		this.companyStaffId = companyStaffId;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
}
