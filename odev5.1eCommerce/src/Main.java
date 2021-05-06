import Business.concrates.CustomerValidationManager;
import core.concrate.JavaPatternCheckManager;
import entity.concrates.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		customer.setId(0);
		customer.setFirstName("Engin");
		customer.setLastName("Karataþ");
		customer.setEmail("enginkaratas99@gmail.com");
		customer.setPassword("abcd");
		
		CustomerValidationManager customerManager = new CustomerValidationManager();
		customerManager.login(customer);
		JavaPatternCheckManager.checkWithRegex(null, null)
		
	}

}
