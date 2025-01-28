package Business.abstracts;

public interface EmailService {
	boolean isEmailExists(String email);
	void sendEmail(int id, String name, String surname, String message);
 	void sendMailWithToken(String email,String token);
}
