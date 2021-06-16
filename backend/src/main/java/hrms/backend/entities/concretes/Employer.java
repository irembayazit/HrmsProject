package hrms.backend.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;


@Entity
@Table(name="employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer{
	
	@Id
	@NotNull
	@Column(name="user_id")
	private int userId;
	
	@NotBlank
	@Size(max = 100)
	@Column(name = "company_name")
	private String companyName;
	
	@NotBlank
	@Size(max = 100)
	@Column(name = "website")
	private String website;
	
	@NotBlank
	@Size(max = 15)
	@Column(name = "phone")
	private String phone;
	
	@OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;
	
	public Employer() {
		
	}
	
	public Employer(int user_id, String companyName, String website, String phone) {
		super();
		this.userId = user_id;
		this.companyName = companyName;
		this.website = website;
		this.phone = phone;
	}

	public int getUser_id() {
		return userId;
	}

	public void setUser_id(int user_id) {
		this.userId = user_id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
