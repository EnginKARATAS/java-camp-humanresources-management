package Business.abstracts;

 
import entity.concrates.Customer;

public interface CustomerValidationService {
	void register(String name,String surname, String email, String password);
	void login(Customer customer);
 }
