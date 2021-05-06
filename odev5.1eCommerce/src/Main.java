import java.util.ArrayList;
import java.util.List;

import Business.abstracts.CustomerValidationService;
import Business.abstracts.EmailCheckService;
import Business.concrates.CustomerManager;
import Business.concrates.CustomerValidationManager;
import Business.concrates.SMTPEmailManager;
import Business.concrates.TextCheckManager;
import core.abstracts.CheckService;
import core.abstracts.TextCheckService;
import core.concrate.JavaPatternCheckManager;
import dataAccess.concrates.AbcCustomerDao;
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
		
		Customer customer2 = new Customer();
		customer.setId(0);
		customer.setFirstName("Elif");
		customer.setLastName("Karataþ");
		customer.setEmail("elif@gmail.com");
		customer.setPassword("123minecraft");
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		customers.add(customer2);
	
		CustomerManager customerManager = new CustomerManager(new AbcCustomerDao());
		TextCheckService contextCheckManager = new TextCheckManager(new JavaPatternCheckManager());
		EmailCheckService emailCheckManager = new SMTPEmailManager();
				
		CustomerValidationManager customerValidationManager = new CustomerValidationManager();
		customerManager.login(customers);
		
 
		
	}

}
