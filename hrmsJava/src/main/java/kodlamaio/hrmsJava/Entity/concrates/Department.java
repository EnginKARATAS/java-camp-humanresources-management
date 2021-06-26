package kodlamaio.hrmsJava.Entity.concrates;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Entity
@Data 
@Table(name="departments")
public class Department{

	@Id
	@Column(name="id")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="faculty_id")
	private String cityId;
	
	@Column(name="name")
	private String name;
	
	@JsonIgnore()
	@JoinColumn(name = "faculty_id")
	private List<Faculty> facultes;
}

