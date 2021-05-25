package kodlamaio.hrmsJava.business.abstracts;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;

public interface CandicateService {
	List<Candicate> getAll();
	boolean add(Candicate candicate);
	void delete(Candicate candicate);
	void update(Candicate candicate);
	void remove(Candicate candicate);
}
