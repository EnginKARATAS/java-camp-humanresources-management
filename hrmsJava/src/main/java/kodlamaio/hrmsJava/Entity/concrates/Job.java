package kodlamaio.hrmsJava.Entity.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="job_titles")
public class Job {
	
	@Id
 	@Column(name="id")
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
	
	@Column(name="title")
	private String title;
	@Column(name="content")
	private String content;
	Job(){}
}
