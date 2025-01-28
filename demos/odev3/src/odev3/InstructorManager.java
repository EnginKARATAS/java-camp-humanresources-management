package odev3;

public class InstructorManager extends UserManager{            
	
	public void openRoll() {
	//close after 3 hour	
	}
	
	@Override
	public void commitRoll(User user) {
		System.out.println("öðretmen classýndan öðretmen " + user.getName() +" "+user.getSurname()+" yoklamayý commitledi");

	}
	
	public void addHomeWork() {
		
	}
	
	public void addNewActivity() {
		
	}
	
	public void addNewCourse() {
		
	}
	
	
	

}
