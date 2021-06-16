package hrms.backend.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@Column(name="cities")
	private String cities;

	@OneToMany(mappedBy = "city")
    private List<JobAdvertisement> jobAdvertisements;
	
	public City() {
		
	}
	
	public City(String cities) {
		super();
		this.cities = cities;
	}

	public int getId() {
		return id;
	}

	public String getCities() {
		return cities;
	}

	public void setCities(String cities) {
		this.cities = cities;
	}
}
