package kodlamaio.hrmsJava.business.concrates;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;
import kodlamaio.hrmsJava.business.abstracts.AuthService;
import kodlamaio.hrmsJava.core.concrates.TextCheckManager;
import kodlamaio.hrmsJava.dataAccess.abstracts.CandicateDao;

public class AuthManager implements AuthService{

	private CandicateDao _candicateDao;
	
	
	public AuthManager(CandicateDao _candicateDao) {
	
		this._candicateDao = _candicateDao;
	}

	@Override
	public void signUp(Candicate candicate) {
		// TODO Auto-generated method stub
		boolean isEmailValid = TextCheckManager.isEmaiValid(candicate.getEmail());
		boolean isEmailExist = true;
		if (isEmailValid && isEmailExist) {
			System.out.println("kayıt olundu");
		}
	}

	@Override
	public void signIn(Candicate candicate) {
		// TODO Auto-generated method stub
		System.out.println("giriş yapıldı");
		
	}

}
