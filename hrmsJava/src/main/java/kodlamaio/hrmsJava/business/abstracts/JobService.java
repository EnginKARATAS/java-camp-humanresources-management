package kodlamaio.hrmsJava.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrmsJava.Entity.concrates.Job;

public interface JobService {
	List<Job> getAll();
	Optional<Job> findById(int id);
}
