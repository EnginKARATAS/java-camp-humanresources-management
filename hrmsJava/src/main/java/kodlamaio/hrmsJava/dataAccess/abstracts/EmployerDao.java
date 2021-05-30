package kodlamaio.hrmsJava.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

 import kodlamaio.hrmsJava.Entity.concrates.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
