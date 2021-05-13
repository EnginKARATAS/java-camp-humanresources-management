package kodlamaio.hrmsJava.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsJava.Entity.concrates.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

	
	
}
