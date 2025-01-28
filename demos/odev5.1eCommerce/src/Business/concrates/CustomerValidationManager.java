package Business.concrates;

 
import Business.abstracts.CustomerValidationService;
import Business.abstracts.EmailService;
import core.abstracts.TextCheckService;
import core.concrate.EmailToken;
import entity.concrates.*;
 
public class CustomerValidationManager implements CustomerValidationService{

	CustomerManager  _customerService;
	TextCheckService _textCheckService ;
	EmailService _emailService;
	
	public CustomerValidationManager(CustomerManager _customerManager, TextCheckService _textCheckService, EmailService _emailService) {
 		this._customerService = _customerManager;//müþterileri yönet
		this._textCheckService = _textCheckService;//regex kontrolü yap
		this._emailService = _emailService;
		
	}

	@Override
	public void register(String name, String surname, String email, String password) {
		// TODO Auto-generated method stub
		EmailToken etoken = new EmailToken();
		Customer customer = new Customer();
		customer.setId(0);
		customer.setFirstName(name);
		customer.setLastName(surname);
		customer.setEmail(email);
		customer.setPassword(password);
		
		if (password.length() > 6 && _textCheckService.checkWithRegex("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", email) && _customerService.get(0) != null && name.length()>2 && surname.length()>2 ) {
			
			if (!_customerService.isCustomerExists(customer)) {
				_emailService.sendEmail(0, name, surname, "Baþarýyla kaydoldunuz");
				_emailService.sendMailWithToken(email, "æ##ßæf4a4½#]23rwei");
				System.out.println(email + "adresine email gönderildi");
				//kullanýcý objesi oluþtur ve gönder
								
				etoken.setToken("token generate edildi ve buradan gönderildi");		
				_emailService.sendMailWithToken(email, etoken.getToken());
				customer.setActivated(false);
				_customerService.add(customer);
			}
			else
				System.out.println("user db de mevcuttur ekleme yapýlamadý");
			
		}
		else {
			System.out.println("incorrect creditentals");
		}
	}
	

	@Override
	public void login(Customer customer) {
		
		String isCustomerExist = "sorguSonucuEvet";
			
 			if (customer.isActivated() && isCustomerExist == "sorguSonucuEvet") {
 				System.out.println("kullanýcý giriþ yaptý" + customer.getFirstName());
 				_customerService.get(customer.getId());
			}
			else {   
				System.out.println("login yapýlamadý eposta onaylanmamýþ yada dbde yok");
			}					

	}

 
 


 



 
	
}
