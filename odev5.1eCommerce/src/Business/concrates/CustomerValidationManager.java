package Business.concrates;

 
import Business.abstracts.CustomerValidationService;
import Business.abstracts.EmailService;
import core.abstracts.TextCheckService;
import entity.concrates.*;
 
public class CustomerValidationManager implements CustomerValidationService{

	CustomerManager  _customerManager;
	TextCheckService _textCheckService ;
	EmailService _emailService;
	
	public CustomerValidationManager(CustomerManager _customerManager, TextCheckService _textCheckService, EmailService _emailService) {
 		this._customerManager = _customerManager;//müþterileri yönet
		this._textCheckService = _textCheckService;//regex kontrolü yap
		this._emailService = _emailService;
		
	}

	@Override
	public void register(String name, String surname, String email, String password) {
		// TODO Auto-generated method stub
		if (password.length() > 6 && _emailService.isEmailExists(email) && _customerManager.get(0) != null && name.length()>2 && surname.length()>2 ) {
			_emailService.sendEmail(0, name, surname, "Baþarýyla kaydoldunuz");
			_emailService.sendMailWithToken(email, password);
			System.out.println(email + "adresine email gönderildi");
		}
		else {
			System.out.println("incorrect creditentals");
		}
	}
	
 
	@Override
	public void login(Customer customer) {
 
			boolean isEmailCredidentals = _textCheckService.checkWithRegex("^(.+)@(.+)$", customer.getEmail());
			
			if (customer.getPassword().length()>6  ) {
				System.out.println("user kaydedildi");			
			}
			else {   
				System.out.println("þifre 6 karakterden az olamaz");
			}					

	}

 
 


 



 
	
}
