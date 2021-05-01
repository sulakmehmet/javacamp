package inheritanceOdev1;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.firstName = "Mehmet";
		instructor1.lastName = "Karlı";
		instructor1.course = "C# + Angular";
		instructor1.instructorRating = 4.2;

		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "Ahmet";
		student1.lastName = "Çark";
		student1.course = "Java + React";
		student1.completedCourseAmount = 8;

		InstructorManager instuctorManager = new InstructorManager();
		instuctorManager.add(instructor1);
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);

	}

}
