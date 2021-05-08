package kodlama.io.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.northwind.entities.concrates.Product;

//entityrepository = JpaRepository
public interface ProductDao extends JpaRepository<Product,Integer>{
	

}
