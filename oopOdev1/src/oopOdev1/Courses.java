package oopOdev1;

public class Courses {

	public Courses() {
		System.out.println("Kurucu metod çalýþtýrýldý.");
	}

	public Courses(int id, String name, String instructor, double status) {
		this();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.status = status;
	}

	int id;
	String name;
	String instructor;
	double status;

}
