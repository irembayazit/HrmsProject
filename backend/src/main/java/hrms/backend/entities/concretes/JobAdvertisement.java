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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="job_advertisement")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

    @ManyToOne()
    @JsonIgnoreProperties({"id","website","phone","password","email"})
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne()
    @JoinColumn(name = "job_position_id")
    private  JobPosition jobPosition;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

	@Column(name = "is_active")
	private boolean isActive;
    
	@NotNull
	@Column(name="min_salary")
	private int minSalary;
	
	@NotNull
	@Column(name="max_salary")
	private int maxSalary;
	
	@NotNull
	@Column(name="deadline")
	private LocalDate deadline;
	
	@NotNull
	@Column(name="release_date")
	private LocalDate releaseDate;
	
	@NotNull
	@Column(name="open_positions")
	private int openPoisitons;
	
	@NotNull
	@Column(name="definition")
	private String definition;

	public JobAdvertisement() {
		
	}
	
	public JobAdvertisement(Employer employer, JobPosition jobPosition, City city, int minSalary, int maxSalary,
			LocalDate deadline, LocalDate releaseDate, int openPoisitons, String definition, boolean isActive) {
		super();
		this.employer = employer;
		this.jobPosition = jobPosition;
		this.city = city;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.deadline = deadline;
		this.releaseDate = releaseDate;
		this.openPoisitons = openPoisitons;
		this.definition = definition;
		this.isActive = isActive;
	}

	public int getId() {
		return id;
	}
	
	public Employer getEmployerId() {
		return employer;
	}

	public void setEmployerId(Employer employerId) {
		this.employer = employerId;
	}

	public JobPosition getJobPositionId() {
		return jobPosition;
	}

	public void setJobPositionId(JobPosition jobPositionId) {
		this.jobPosition = jobPositionId;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getOpenPoisitons() {
		return openPoisitons;
	}

	public void setOpenPoisitons(int openPoisitons) {
		this.openPoisitons = openPoisitons;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	
	
	
	
}
