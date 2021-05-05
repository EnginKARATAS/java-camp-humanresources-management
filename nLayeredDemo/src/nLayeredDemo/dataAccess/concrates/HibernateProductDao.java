package nLayeredDemo.dataAccess.concrates;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concrates.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("hibernate ile eklendi " + product.getName());
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
