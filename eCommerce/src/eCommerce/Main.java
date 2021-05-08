package eCommerce;

import eCommerce.bussiness.abstracts.UserService;
import eCommerce.bussiness.concretes.UserManager;
import eCommerce.core.concretes.GoogleRegistrationManagerAdapter;
import eCommerce.core.concretes.UserRegistrationManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao(), new UserRegistrationManager());
		
		User user1 = new User(1, "Mehmet", "Çetin", "mehme@gmail.com", "1234567");
		userService.add(user1);
		userService.login(user1);

	}

}
