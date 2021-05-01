package inheritanceOdev1;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.firstName + " Öğrenci eklendi.");
	}

}
