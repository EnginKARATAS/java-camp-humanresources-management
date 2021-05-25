package kodlamaio.hrmsJava.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;

public interface CandicateDao extends JpaRepository<Candicate, Integer>{

}
