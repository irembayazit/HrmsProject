package hrms.backend.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="company_staffs")
public class CompanyStaff {
	
	@Id
	@NotNull
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;

	public CompanyStaff() {
		
	}
	
	public CompanyStaff(int user_id, String name, String surname) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.surname = surname;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
