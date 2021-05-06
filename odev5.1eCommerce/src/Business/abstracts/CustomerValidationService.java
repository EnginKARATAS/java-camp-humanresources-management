package Business.abstracts;

import entity.concrates.Customer;

public interface CustomerValidationService {
	void login(Customer customer);
	void logout(Customer customer);
}
