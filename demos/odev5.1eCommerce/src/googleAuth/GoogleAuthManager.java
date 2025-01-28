package googleAuth;

import Business.abstracts.CustomerValidationService;
import entity.concrates.Customer;

public class GoogleAuthManager implements CustomerValidationService{
 
	@Override
	public void register(String name, String surname, String email, String password) {
		// TODO Auto-generated method stub
   	 System.out.println("Google ile kayýt alýndý :" + email);
		
	}
	@Override
	public void login(Customer customer) {
		// TODO Auto-generated method stub
   	 System.out.println("Google ile giriþ yapýldý : " + customer.getEmail());

	}
}
