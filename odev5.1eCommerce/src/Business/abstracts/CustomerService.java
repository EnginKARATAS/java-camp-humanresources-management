package Business.abstracts;

import entity.concrates.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer get(int id);
	boolean isCustomerExists(Customer customer);
	
}
