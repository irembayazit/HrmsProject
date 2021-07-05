package hrms.backend.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_seeker_cv_languages")  
@AllArgsConstructor
@NoArgsConstructor 
public class JobSeekerCvLanguage {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@Column(name="language")
	private String language;
	
	@Range(min = 1, max = 5)
	@Column(name="level")
	private int level;

	public JobSeekerCvLanguage() {
		
	}
	
	public JobSeekerCvLanguage(JobSeeker jobSeeker, String language,@Range(min = 1, max = 5) int level) {
		super();
		this.jobSeeker = jobSeeker;
		this.language = language;
		this.level = level;
	}

	public JobSeeker getJobSeekerId() {
		return jobSeeker;
	}

	public void setJobSeekerId(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getId() {
		return id;
	}
}
