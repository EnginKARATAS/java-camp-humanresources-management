package kodlamaio.hrmsJava.Entity.concrates;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="cv")
public class Cv {

	@Id
 	@Column(name="id")
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="created_date")
	private String createdDate;
	
	@Column(name="last_modified")
	private Date lastModified;
	
	@Column(name="dateOfBirth")
	private int dateOfBirth;
	
	
	@OneToOne
	User user;
}
