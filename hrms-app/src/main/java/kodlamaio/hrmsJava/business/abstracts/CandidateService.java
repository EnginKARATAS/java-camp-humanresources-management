package kodlamaio.hrmsJava.business.abstracts;

import java.util.List;

import kodlamaio.hrmsJava.Entity.concrates.Candidate;
import kodlamaio.hrmsJava.core.utilities.results.Result;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateService {
	List<Candidate> getAll();
	Result add(Candidate Candidate);
	void delete(Candidate Candidate);
	void update(Candidate Candidate);
	void remove(Candidate Candidate);
}
