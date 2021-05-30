package kodlamaio.hrmsJava.core.abstracts;

import kodlamaio.hrmsJava.Entity.concrates.Candicate;

public interface MailSenderService {
	void sendToken(Candicate candicate, String token);
}
