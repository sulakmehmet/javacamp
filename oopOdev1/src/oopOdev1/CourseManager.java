package oopOdev1;

public class CourseManager {
	void finishAndContinue(Lecture lecture) {
		System.out.println(lecture.name + "  --->   Ders tamamlandı.");
	}

	void enroll(Courses course) {
		System.out.println(course.name + "   --->   Kursa kayıt gerçekleştirildi.");
	}

}
