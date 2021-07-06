package hrms.backend.entities.dtos;

import java.util.List;

import hrms.backend.entities.concretes.JobSeekerCvAddress;
import hrms.backend.entities.concretes.JobSeekerCvCoverLetter;
import hrms.backend.entities.concretes.JobSeekerCvEducation;
import hrms.backend.entities.concretes.JobSeekerCvExperience;
import hrms.backend.entities.concretes.JobSeekerCvLanguage;
import hrms.backend.entities.concretes.JobSeekerCvPhoto;
import hrms.backend.entities.concretes.JobSeekerCvSkill;

public class CvDto {
	
	private List<JobSeekerCvAddress> jobSeekerCvAddress;
	
	private List<JobSeekerCvCoverLetter> jobSeekerCvCoverLetter;
	
	private List<JobSeekerCvEducation> jobSeekerCvEducation;
	
	private List<JobSeekerCvExperience> jobSeekerCvExperience;
	
	private List<JobSeekerCvLanguage> jobSeekerCvLanguage;
	
	private List<JobSeekerCvSkill> jobSeekerCvSkill;
	
	private List<JobSeekerCvPhoto> jobSeekerCvPhoto;

	public CvDto(List<JobSeekerCvAddress> jobSeekerCvAddress, List<JobSeekerCvCoverLetter> jobSeekerCvCoverLetter,
			List<JobSeekerCvEducation> jobSeekerCvEducation, List<JobSeekerCvExperience> jobSeekerCvExperience,
			List<JobSeekerCvLanguage> jobSeekerCvLanguage, List<JobSeekerCvSkill> jobSeekerCvSkill,
			List<JobSeekerCvPhoto> jobSeekerCvPhoto) {
		super();
		this.jobSeekerCvAddress = jobSeekerCvAddress;
		this.jobSeekerCvCoverLetter = jobSeekerCvCoverLetter;
		this.jobSeekerCvEducation = jobSeekerCvEducation;
		this.jobSeekerCvExperience = jobSeekerCvExperience;
		this.jobSeekerCvLanguage = jobSeekerCvLanguage;
		this.jobSeekerCvSkill = jobSeekerCvSkill;
		this.jobSeekerCvPhoto = jobSeekerCvPhoto;
	}

	public List<JobSeekerCvAddress> getJobSeekerCvAddress() {
		return jobSeekerCvAddress;
	}

	public void setJobSeekerCvAddress(List<JobSeekerCvAddress> jobSeekerCvAddress) {
		this.jobSeekerCvAddress = jobSeekerCvAddress;
	}

	public List<JobSeekerCvCoverLetter> getJobSeekerCvCoverLetter() {
		return jobSeekerCvCoverLetter;
	}

	public void setJobSeekerCvCoverLetter(List<JobSeekerCvCoverLetter> jobSeekerCvCoverLetter) {
		this.jobSeekerCvCoverLetter = jobSeekerCvCoverLetter;
	}

	public List<JobSeekerCvEducation> getJobSeekerCvEducation() {
		return jobSeekerCvEducation;
	}

	public void setJobSeekerCvEducation(List<JobSeekerCvEducation> jobSeekerCvEducation) {
		this.jobSeekerCvEducation = jobSeekerCvEducation;
	}

	public List<JobSeekerCvExperience> getJobSeekerCvExperience() {
		return jobSeekerCvExperience;
	}

	public void setJobSeekerCvExperience(List<JobSeekerCvExperience> jobSeekerCvExperience) {
		this.jobSeekerCvExperience = jobSeekerCvExperience;
	}

	public List<JobSeekerCvLanguage> getJobSeekerCvLanguage() {
		return jobSeekerCvLanguage;
	}

	public void setJobSeekerCvLanguage(List<JobSeekerCvLanguage> jobSeekerCvLanguage) {
		this.jobSeekerCvLanguage = jobSeekerCvLanguage;
	}

	public List<JobSeekerCvSkill> getJobSeekerCvSkill() {
		return jobSeekerCvSkill;
	}

	public void setJobSeekerCvSkill(List<JobSeekerCvSkill> jobSeekerCvSkill) {
		this.jobSeekerCvSkill = jobSeekerCvSkill;
	}

	public List<JobSeekerCvPhoto> getJobSeekerCvPhoto() {
		return jobSeekerCvPhoto;
	}

	public void setJobSeekerCvPhoto(List<JobSeekerCvPhoto> jobSeekerCvPhoto) {
		this.jobSeekerCvPhoto = jobSeekerCvPhoto;
	}

	
	
	
	
}
