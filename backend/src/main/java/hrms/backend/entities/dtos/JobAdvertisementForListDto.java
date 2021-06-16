package hrms.backend.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

public class JobAdvertisementForListDto {
	
	@NotBlank
	private String companyName;
	
	@NotBlank
	private String title;
	
	@NotNull
	private int openPoisitons;
	
	@NotNull
	private LocalDate deadline;
	
	@NotNull
	private LocalDate releaseDate;

	public JobAdvertisementForListDto() {
		
	}
	
	public JobAdvertisementForListDto(@NotBlank String companyName, @NotBlank String title, int openPoisitons,
			LocalDate deadline, LocalDate releaseDate) {
		super();
		this.companyName = companyName;
		this.title = title;
		this.openPoisitons = openPoisitons;
		this.deadline = deadline;
		this.releaseDate = releaseDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getOpenPoisitons() {
		return openPoisitons;
	}

	public void setOpenPoisitons(int openPoisitons) {
		this.openPoisitons = openPoisitons;
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
}
