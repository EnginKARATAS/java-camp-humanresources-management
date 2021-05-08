package kodlama.io.northwind.business.abstracts;

import java.util.List;

import kodlama.io.northwind.entities.concrates.Product;

public interface ProductService {
	List<Product> getAll();
}
