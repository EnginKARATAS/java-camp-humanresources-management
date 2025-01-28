package Concrate;

import Abstract.BaseCustomerService;
import Abstract.CustomerCheckService;
import Entities.Customer;
 

public class SturbucksCustomerService extends BaseCustomerService{
	
	CustomerCheckService _customerCheckService;
	
	public  SturbucksCustomerService (CustomerCheckService checkService) {
		_customerCheckService = checkService; 
	}

//c# ta virtual ile iþaretleyip burada override etmen gerekir javada gerek yok
	@Override
	public void save(Customer customer) throws Exception {
		
 		if(_customerCheckService.checkIfRealPerson(customer)) {
 			super.save(customer);
   		}
 		else {
 			throw new Exception("Not a valid person");
 		}
	}

}
