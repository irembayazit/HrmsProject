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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_seeker_CV_experiences")  
@AllArgsConstructor
@NoArgsConstructor 
public class JobSeekerCvExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;

	@Column(name="workplace_name")
	private String workplaceName;
	
	@Column(name="position")
	private String position;
	
	@Column(name="start_year")
	private LocalDate startYear;
	
	@Column(name="end_year")
	private LocalDate endYear;
	
	public JobSeekerCvExperience() {
		
	}
	
	public JobSeekerCvExperience(JobSeeker jobSeeker, String workplaceName, String position, LocalDate startYear,
			LocalDate endYear) {
		super();
		this.jobSeeker = jobSeeker;
		this.workplaceName = workplaceName;
		this.position = position;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	public JobSeeker setJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public LocalDate getStartYear() {
		return startYear;
	}

	public void setStartYear(LocalDate startYear) {
		this.startYear = startYear;
	}

	public LocalDate getEndYear() {
		return endYear;
	}

	public void setEndYear(LocalDate endYear) {
		this.endYear = endYear;
	}

	public int getId() {
		return id;
	}
	
}
