package projeHrms.Hrms.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import projeHrms.Hrms.core.utilities.entities.Dto;

public class JobSeekerForRegisterDto implements Dto{
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String surname;
	
	@NotBlank
	@Size(min = 11, max = 11, message = "The Identity Number must consist of 11 digits.")
	private String identityNumber;
	
	@Past
	private LocalDate birthDate;
	
	@NotBlank
	@Email
	@Size(max = 100)
	private String email;
	
	@NotBlank
	private String password;
	
	@NotBlank
	private String passwordAgain;

	public JobSeekerForRegisterDto() {
		
	}
	
	public JobSeekerForRegisterDto(
			@NotBlank @Email @Size(max = 100) final String email,
			@NotBlank @Size(max = 100) final String password, 
			@NotBlank @Size(max = 100) final String passwordAgain,
			@NotBlank final String name, @NotBlank final String surname,
			@NotBlank @Size(min = 11, max = 11) final String identityNumber, 
			@NotNull @Past final LocalDate birthDate) {
		super();
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
		this.passwordAgain = passwordAgain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
