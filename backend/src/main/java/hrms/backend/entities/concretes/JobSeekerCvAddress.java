package hrms.backend.entities.concretes;

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
@Table(name="job_seeker_cv_addresses")  
@AllArgsConstructor
@NoArgsConstructor 
public class JobSeekerCvAddress{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@Column(name="github")
	private String github;
	
	@Column(name="linkedin")
	private String linkedin;

	public JobSeekerCvAddress() {
		
	}
	
	public JobSeekerCvAddress(JobSeeker jobSeeker, String github, String linkedin) {
		super();
		this.jobSeeker = jobSeeker;
		this.github = github;
		this.linkedin = linkedin;
	}

	public JobSeeker setJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public int getId() {
		return id;
	}
}
