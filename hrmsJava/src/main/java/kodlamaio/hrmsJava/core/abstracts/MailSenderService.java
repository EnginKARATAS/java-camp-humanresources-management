package kodlamaio.hrmsJava.core.abstracts;


import kodlamaio.hrmsJava.Entity.concrates.Candidate;

public interface MailSenderService {
	void sendToken(Candidate candidate, String token);
}
