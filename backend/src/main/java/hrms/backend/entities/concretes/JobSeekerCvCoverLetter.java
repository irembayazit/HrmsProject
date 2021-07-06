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
@Table(name="job_seeker_cv_cover_letters")  
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerCvCoverLetter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	public JobSeekerCvCoverLetter() {
		
	}
	
	public JobSeekerCvCoverLetter(JobSeeker jobSeeker, String coverLetter) {
		super();
		this.jobSeeker = jobSeeker;
		this.coverLetter = coverLetter;
	}

	public int getId() {
		return id;
	}

	public JobSeeker setJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}
}
