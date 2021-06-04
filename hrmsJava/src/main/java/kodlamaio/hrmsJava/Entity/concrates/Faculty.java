package kodlamaio.hrmsJava.Entity.concrates;
 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "jobAdvertisement" })
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "faculties")
@Entity
public class Faculty {

	@Column(name = "name")
	private String name;

	@ManyToOne()
    @JsonIgnore()
    @JoinColumn(name = "school_id")
    private School schools;

}

