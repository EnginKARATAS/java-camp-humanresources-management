package odev2;

import odev2.Course;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course("Java React", "Engin Demiroð", "2 Ay", "Arkadaþlar ödev çok önemli biliyonuz (açýklama)");
		Course course2 = new Course();
		course2.Title = "Linux";
		course2.IntroductionLetter = "Baya Temelden Arkalaþlar";
		course2.Teacher = "Mehmet Karabaþoðlu";
		course2.TotalTime = "15 Iþýk yýlý(Learning Hell)";
		
		Course[] courses = {course1, course2};
		for(Course course : courses)
			System.out.println(course.Title);
		
		CourseContent content1 = new CourseContent();
		content1.Date = "21 April 2021";
		content1.Link = "https://www.kodlama.io/courses/1332369/lectures/31944217";
		content1.Content = "<html><link src='www.youtube.com/canliyayinlinki'</html>";
		
		CourseContentManager courseContentManager = new CourseContentManager();
		courseContentManager.Delete(course1.Title);		
		
		Course course3 = new Course();
		course2.Title = "XXX";
		course2.IntroductionLetter = "Baya Temelden Arkalaþlar";
		course2.Teacher = "AAA";
		course2.TotalTime = "15 Iþýk yýlý(Learning Hell)";
		
		courseContentManager.Add(course3);
	}

}
