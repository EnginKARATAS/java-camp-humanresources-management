package Business.concrates;

 
import Business.abstracts.CustomerValidationService;
import Business.abstracts.EmailCheckService;
import core.abstracts.TextCheckService;
import entity.concrates.*;
 
public class CustomerValidationManager implements CustomerValidationService{

	CustomerManager  _customerManager;
	TextCheckService _textCheckService ;
	EmailCheckService _emailCheckService;
	public CustomerValidationManager(CustomerManager _customerManager, TextCheckService _textCheckService, EmailCheckService _emailCheckService
			 ) {
 		this._customerManager = _customerManager;//müþterileri yönet
		this._textCheckService = _textCheckService;//regex kontrolü yap
		this._emailCheckService = _emailCheckService;
		
	}

	@Override
	public void login(Customer customer) {
 
			boolean isEmailCredidentals = _textCheckService.checkWithRegex("^(.+)@(.+)$", customer.getEmail());
			
			if (customer.getPassword().length()>6 && isEmailCredidentals) {
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
