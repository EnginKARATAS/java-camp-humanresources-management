package Business.concrates;

import java.util.regex.Pattern;

import Business.abstracts.CustomerValidationService;
import entity.concrates.*;
public class CustomerValidationManager implements CustomerValidationService{

	@Override
	public void login(Customer customer) {
		// TODO Auto-generated method stub
		if (customer.getPassword().length()>6) {
			System.out.println("user kaydedildi");			
		}
		else {   
			System.out.println("þifre 6 karakterden az olamaz");
		}
		
	}

	@Override
	public void logout(Customer customer) {
		// TODO Auto-generated method stub
	}
	
}
