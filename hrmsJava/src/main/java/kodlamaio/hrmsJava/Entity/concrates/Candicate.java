package kodlamaio.hrmsJava.Entity.concrates;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="candicates")
public class Candicate {

	@Id
 	@Column(name="id")
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="nationalId")
	private String nationalId;
	
	@Column(name="dateOfBirth")
	private Date dateOfBirth;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
}
