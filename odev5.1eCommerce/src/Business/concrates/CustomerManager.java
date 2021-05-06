package Business.concrates;

import Business.abstracts.CustomerService;
import dataAccess.abstracts.CustomerDao;
import entity.concrates.Customer;

public class CustomerManager implements CustomerService {

	CustomerDao _customerDao;
	
	public CustomerManager(CustomerDao _customerDao) {
 		this._customerDao = _customerDao;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		_customerDao.add(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		_customerDao.delete(customer);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		_customerDao.update(customer);
	}

	@Override
	public Customer get(int id) {
		return _customerDao.get(id);
	}

}
