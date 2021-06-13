package hrms.backend.core.adapters;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class Mernis {
	
	@NotNull
	private String identityNumber;

	@NotBlank
	private String name;

	@NotBlank
	private String surname;

	@Past
	private int birthDate;

	public Mernis() {
		
	}
	
	public Mernis(@NotNull String identityNumber, @NotBlank String name, @NotBlank String surname, @Past int birthDate) {
		super();
		this.identityNumber = identityNumber;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
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

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
