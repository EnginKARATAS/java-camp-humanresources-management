package kodlamaio.hrmsJava.Entity.concrates;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisements")
@Entity
public class JobAdvertsement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;

	@Column(name = "description")
	private String description;

	@Column(name = "number_of_position_opened")//?
	private int numberOfPositionOpened;
	
	@Column(name = "quota")//?
	private int quota;

	@Column(name = "expiration_date")	
	private LocalDateTime expirationDate;

	@Column(name = "created_date")
	private LocalDateTime createdDate;

	@Column(name = "min_salary")
	private Double minSalary;

	@Column(name = "max_salary")
	private Double maxSalary;

	@Column(name = "is_active")
	private boolean isActive;


	@ManyToOne//(cascade = CascadeType.PERSIST)// 
	private City city;

	@ManyToOne//(cascade = CascadeType.PERSIST)// 
 	private Job job;
	
	@ManyToOne//(cascade = CascadeType.PERSIST)// 
 	private Employer employer;

	private LocalDate releaseDate;

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = LocalDate.now();
		// Json'da releaseDate gönderilmeye çalışılırsa işe yaramayacak.
	}
	
}