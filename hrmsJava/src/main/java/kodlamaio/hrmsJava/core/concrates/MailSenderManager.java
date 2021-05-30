package kodlamaio.hrmsJava.core.concrates;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;
import kodlamaio.hrmsJava.core.abstracts.MailSenderService;

public class MailSenderManager implements MailSenderService{

	@Override
	public void sendToken(Candicate candicate, String token) {
		System.out.println(candicate.getEmail() +" adresine " + token + " gönderildi");
	}
	
}
