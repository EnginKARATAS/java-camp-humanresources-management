package kodlamaio.hrmsJava.core.concrates;

import kodlamaio.hrmsJava.Entity.concrates.Candidate;
import kodlamaio.hrmsJava.core.abstracts.MailSenderService;

public class MailSenderManager implements MailSenderService{
	@Override
	public void sendToken(Candidate candidate, String token) {
			System.out.println(candidate.getEmail() +" adresine " + token + " gönderildi");
	}
}
