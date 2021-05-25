package kodlamaio.hrmsJava.business.abstracts;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;

public interface AuthService {
	void signUp(Candicate candicate);
	void signIn(Candicate candicate);	
}
