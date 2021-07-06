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
@Table(name="job_seeker_cv_skills")  
@AllArgsConstructor
@NoArgsConstructor 
public class JobSeekerCvSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@Column(name="skills")
	private String skill;
	
	public JobSeekerCvSkill() {
		
	}

	public JobSeekerCvSkill(JobSeeker jobSeeker, String skill) {
		super();
		this.jobSeeker = jobSeeker;
		this.skill = skill;
	}
	
	public JobSeeker setJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getId() {
		return id;
	}
	
}
