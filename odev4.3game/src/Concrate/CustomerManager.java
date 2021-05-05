package Concrate;

import Abstract.CheckService;
import Abstract.CustomerService;
import Entity.Customer;

public class CustomerManager implements CustomerService {

	CheckService _checkService;
	
	
	public CustomerManager(CheckService _checkService) {
 		this._checkService = _checkService;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if (_checkService.isUserExists(customer)) {
			System.out.println(customer.getFirstName() + " adlý kullanýcý sisteme eklendi");
		}
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getId() + "id li kullanýcý silindi");
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName() +" isimli kullanýcý güncellendi");
		
	}

}
