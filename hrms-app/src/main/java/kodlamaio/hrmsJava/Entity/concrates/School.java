package kodlamaio.hrmsJava.Entity.concrates;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data 
@Table(name="schools")
public class School{

	@Id
 	@Column(name="id")
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
	
	@Column(name="city_id")
	private String cityId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="department")
	private String department;
	
	
	@JsonIgnore()
    @OneToMany(mappedBy = "school_id")
	private List<SchoolCandidate> candidateProgrammingInformations;
}

