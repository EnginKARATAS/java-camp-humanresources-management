package kodlamaio.hrmsJava.business.abstracts;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Employer;
import kodlamaio.hrmsJava.Entity.concrates.JobAdvertsement;
import kodlamaio.hrmsJava.core.utilities.results.DataResult;
import kodlamaio.hrmsJava.core.utilities.results.Result;

public interface JobAdvertsementService {
	DataResult<List<JobAdvertsement>> getAll();
	Result add(JobAdvertsement jobAdvertsement,  Employer employer);
	Result delete(JobAdvertsement jobAdvertsement,  Employer employer);
	Result update(JobAdvertsement jobAdvertsement,  Employer employer);
	Result remove(JobAdvertsement jobAdvertsement,  Employer employer);
	Result unactive(JobAdvertsement jobAdvertsement,  Employer employer);
	Result active(JobAdvertsement jobAdvertsement,  Employer employer);
}
