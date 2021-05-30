package kodlamaio.hrmsJava.business.abstracts;

import kodlamaio.hrmsJava.Entity.concrates.Employer;
 
public interface SystemUserValidationService {
	boolean isSystemUserConfirmed(Employer employer);
}
