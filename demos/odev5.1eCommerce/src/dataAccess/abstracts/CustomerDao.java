package dataAccess.abstracts;

 
import entity.concrates.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer get(int customer);
}
