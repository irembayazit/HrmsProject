package projeHrms.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


import lombok.Builder;

@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@NotBlank
	@Email
	@Size(max = 100)
	@Column(name="email")
	private String email;
	

	@NotBlank
	@Size(max = 50)
	@Column(name="password")
	private String password;
	
	public User() {
		
	}
	
	@Builder
	public User(@NotBlank @Email @Size(max = 100) final String email,
			@NotBlank @Size(max = 100) final String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasword() {
		return password;
	}

	public void setPasword(String password) {
		this.password = password;
	}	
	
}
