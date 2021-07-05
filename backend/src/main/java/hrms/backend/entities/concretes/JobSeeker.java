package hrms.backend.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;



@Entity
@Table(name="job_seekers")
public class JobSeeker {
	
	@Id
	@NotNull
	@Column(name="user_id")
	private int userId;
	
	@NotBlank
	@Column(name="name")
	private String name;
	
	@NotBlank
	@Column(name="surname")
	private String surname;
	
	@NotBlank
	@Size(min = 11, max = 11, message = "The Identity Number must consist of 11 digits.")
	@Column(name="identity_number")
	private String identityNumber;
	
	@NotNull
	@Past
	@Column(name="birth_date")
	private LocalDate birthDate;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerCvCoverLetter> coverLetters;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerCvEducation> educations;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerCvExperience> experiences;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerCvLanguage> language;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerCvAddress> links;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerCvPhoto> photos;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerCvSkill> skills;

	public JobSeeker(){
		
	}
	
	public JobSeeker(int userId,String name, String surname,@NotBlank @Size(min = 11, max = 11) final String identityNumber, LocalDate birthDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}

	public int getUserId() {
		return userId;
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
	
}
