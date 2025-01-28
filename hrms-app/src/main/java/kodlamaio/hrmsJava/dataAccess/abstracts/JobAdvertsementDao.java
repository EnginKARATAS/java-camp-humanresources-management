package kodlamaio.hrmsJava.dataAccess.abstracts;

 import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsJava.Entity.concrates.JobAdvertsement;

public interface JobAdvertsementDao extends JpaRepository<JobAdvertsement, Integer> {
	List<JobAdvertsement> getByCreatedDate(LocalDate createdDate);
	List<JobAdvertsement> getByEmployer(int employerId);
}
