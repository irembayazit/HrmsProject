package projeHrms.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

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

}
