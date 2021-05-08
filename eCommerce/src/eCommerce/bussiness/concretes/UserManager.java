package eCommerce.bussiness.concretes;

import eCommerce.bussiness.abstracts.UserService;
import eCommerce.core.abstracts.UserRegistrationService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private UserRegistrationService userRegistration;

	public UserManager(UserDao userDao, UserRegistrationService userRegistration) {
		super();
		this.userDao = userDao;
		this.userRegistration = userRegistration;
	}

	@Override
	public void add(User user) {
		if (userRegistration.registration(user)) {
			this.userDao.add(user);
			System.out.println("Kay�t i�lemi ba�ar�l�.");
		}else {
			System.out.println("Kay�t i�lemi ba�ar�s�z.");
		}
		
	}

	@Override
	public void login(User user) {
		boolean isTrue = false;
		if (user.getEmail()!= " " && user.getPassword()!= " ") {
			//sistemde kay�tl� eposta kullan�c�lar
			User user1 = new User(2, "Hasan", "Canik", "hasan@gmail.com", "1234567");
			User user2 = new User(3, "R��t�", "Serin", "rustu@gmail.com", "1234567");
			User user3 = new User(4, "Ali", "Kasti", "ali@gmail.com", "1234567");
			User[] users = {user1, user2, user3};
			
			for (User userr:users) {
				if(user.getEmail() == userr.getEmail() && user.getPassword() == userr.getPassword()) {
					isTrue = true;
					return;
				}else {
					isTrue = false;
				}
			}
			if(isTrue) {
				System.out.println("Oturum a�ma ba�ar�l�.");
			}else {
				System.out.println("Eposta veya parola hatal�!");
			}
			
		}else {
			System.out.println("Eposta ya da parola bo� ge�ilemez.");
		}
		
	}

}
