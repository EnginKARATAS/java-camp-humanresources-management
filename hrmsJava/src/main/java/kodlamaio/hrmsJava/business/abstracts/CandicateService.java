package kodlamaio.hrmsJava.business.abstracts;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;
import kodlamaio.hrmsJava.core.utilities.results.Result;

public interface CandicateService {
	List<Candicate> getAll();
	Result add(Candicate candicate);
	void delete(Candicate candicate);
	void update(Candicate candicate);
	void remove(Candicate candicate);
}
