package Business.concrates;

import Business.abstracts.EmailService;

public class SMTPEmailManager implements EmailService {

	@Override
	public boolean isEmailExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	
 	@Override
	public void sendMailWithToken(String mail, String token) {
		// TODO Auto-generated method stub
 		System.out.println("kullanýcýnýn girdiði maile token linki gönderildi dunyadaki£nGuzelToken = " + token);
		
	}
 	
 	@Override
 	public void responseMailWithToken(String token) {
		// TODO Auto-generated method stub
		System.out.println("databasede tokene sahip user arandý ve silindi");
		
	}
 	
	@Override
	public void sendEmail(int id, String name, String surname, String message) {
		// TODO Auto-generated method stub
		
	}
}
