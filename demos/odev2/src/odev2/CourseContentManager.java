package odev2;

public class CourseContentManager {
	
	//burasýný okuma
	//
	//ICourseManager courseManager;
	//constructor parametresine ICourseManager i ver
	//Depenndency Inversion budur
	
	public CourseContentManager() {
		
	}
	
	public void Delete(String title) {
		System.out.println("verdiiðin titleye göre course contentinin baþlýðýný bulup sildim " + title);
	}
	
	public void Add(Course content) {
		System.out.println("verilen content, base classýn titlesine göre eklendi");
		System.out.println(content);
		System.out.println(content);
	}
}
