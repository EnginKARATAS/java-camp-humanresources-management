package odev3;

public class StudentManager extends UserManager {
	
	public void sendHomeWork() {
		
	}
	
	@Override
	public void commitRoll(User user) {
		System.out.println("öðrenci classýndan öðrenci " + user.getName() +" yoklamayý commitledi");
	}
	

}
