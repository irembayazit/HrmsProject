package hrms.backend.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.PastOrPresent;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_seeker_cv_educations")  
@AllArgsConstructor
@NoArgsConstructor 
public class JobSeekerCvEducation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="department_name")
	private String departmentName;
	 
	@Column(name="start_year")
	private LocalDate startYear;
	
	@Column(name="graduation_year")
	private LocalDate graduationYear;

	public JobSeekerCvEducation() {
		
	}
	
	public JobSeekerCvEducation(JobSeeker jobSeeker, String schoolName, String departmentName,@PastOrPresent LocalDate startYear,
			@PastOrPresent LocalDate graduationYear) {
		super();
		this.jobSeeker = jobSeeker;
		this.schoolName = schoolName;
		this.departmentName = departmentName;
		this.startYear = startYear;
		this.graduationYear = graduationYear;
	}

	public JobSeeker getJobSeekerId() {
		return jobSeeker;
	}

	public void setJobSeekerId(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public LocalDate getStartYear() {
		return startYear;
	}

	public void setStartYear(LocalDate startYear) {
		this.startYear = startYear;
	}

	public LocalDate getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(LocalDate graduationYear) {
		this.graduationYear = graduationYear;
	}

	public int getId() {
		return id;
	}
}
