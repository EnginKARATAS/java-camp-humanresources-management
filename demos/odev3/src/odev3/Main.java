package odev3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student karatas = new Student();
		karatas.setName("ENGIN");
		karatas.setSurname("KARATAS");
		
		Instructor demirog = new Instructor();
		demirog.setName("ENGIN");
		demirog.setSurname("DEMIROG");
		
		Admin admin = new Admin();
		admin.setName("admin");
		admin.setSurname("admin");
		
		User[] users = new User[] {karatas, demirog};
		UserManager userManager = new UserManager();
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		SuperAdminTestManager adminTestManager = new SuperAdminTestManager();
		
		studentManager.commitRoll(karatas);
		instructorManager.commitRoll(demirog);
		adminTestManager.commitRoll(admin);
		
		for(User user : users) {
			userManager.login(user);	
			userManager.logout(user);
		}
		
	}

}
