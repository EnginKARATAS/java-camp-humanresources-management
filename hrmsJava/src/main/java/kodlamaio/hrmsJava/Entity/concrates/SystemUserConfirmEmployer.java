package kodlamaio.hrmsJava.Entity.concrates;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="system_user_confirm_employer")
public class SystemUserConfirmEmployer {

	@Id
	private int id;
	
	@JoinColumn(name="e")
	Employer employer;
	
}
