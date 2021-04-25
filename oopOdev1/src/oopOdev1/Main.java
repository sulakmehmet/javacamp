package oopOdev1;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1, "C# + Angular", "Engin Demiroð", 19.25);
		Courses course2 = new Courses(2, "Java + React", "Engin Demiroð", 10.50);

		Courses[] courses = { course1, course2 };

		for (Courses course : courses) {
			System.out.println(course.id + " | " + course.name + " | " + course.instructor);
		}

		Lecture lecture1 = new Lecture();
		lecture1.id = 1;
		lecture1.name = "C# Temelleri";

		Lecture lecture2 = new Lecture();
		lecture2.id = 2;
		lecture2.name = "Yoklama";

		CourseManager courseManager = new CourseManager();
		courseManager.enroll(course1);
		courseManager.finishAndContinue(lecture1);
		courseManager.finishAndContinue(lecture2);

	}

}
