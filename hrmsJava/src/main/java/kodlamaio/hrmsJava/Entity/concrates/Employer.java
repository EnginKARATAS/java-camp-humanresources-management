package kodlamaio.hrmsJava.Entity.concrates;

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Employer")
public class Employer {
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_site")
	private String webSite;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "mail")
	private String mail;
}
