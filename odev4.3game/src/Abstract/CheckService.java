package Abstract;

import Entity.Customer;

public interface CheckService {
	boolean isUserExists(Customer customer);
}
