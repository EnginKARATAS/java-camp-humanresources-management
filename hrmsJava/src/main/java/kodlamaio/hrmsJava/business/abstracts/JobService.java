package kodlamaio.hrmsJava.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrmsJava.Entity.concrates.Job;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;

public interface JobService {
	DataResult<List<Job>>  getAll();
	Optional<Job> findById(int id);
	Result add(Job job);
}
