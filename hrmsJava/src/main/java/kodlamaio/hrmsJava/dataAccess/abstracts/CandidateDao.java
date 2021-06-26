package kodlamaio.hrmsJava.dataAccess.abstracts;

import kodlamaio.hrmsJava.Entity.concrates.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CandidateDao extends JpaRepository<Candidate, Integer>{

}
