package nLayeredDemo.dataAccess.abstracts;

 
import java.util.List;

import nLayeredDemo.entities.concrates.Product;

public interface ProductDao {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	void get(Product product);
	List<Product> getAll();

}
