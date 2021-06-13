package hrms.backend.entities.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EmployerForRegisterDto {
	
	@NotBlank
	private String companyName;
	
	@NotBlank
	private String webSite;

	@NotBlank
	@Email
	@Size(max = 100)
	private String email;
	
	@NotBlank
	private String phone;
	
	@NotBlank
	private String password;
	
	@NotBlank
	private String passwordAgain;

	public EmployerForRegisterDto() {
		
	}
	
	public EmployerForRegisterDto(@NotBlank String companyName, @NotBlank String webSite,
			@NotBlank @Email @Size(max = 100) String email, @NotBlank String phone, @NotBlank String password,
			@NotBlank String passwordAgain) {
		super();
		this.companyName = companyName;
		this.webSite = webSite;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.passwordAgain = passwordAgain;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordAgain() {
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}
}
