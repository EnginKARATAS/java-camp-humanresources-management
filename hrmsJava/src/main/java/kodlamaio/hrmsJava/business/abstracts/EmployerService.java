package kodlamaio.hrmsJava.business.abstracts;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import kodlamaio.hrmsJava.Entity.concrates.Employer;

public interface EmployerService {
	List<Candicate> getAll();
	Result add(Employer employer);
	void delete(Employer employer);
	void update(Employer employer);
	void remove(Employer employer);
}
