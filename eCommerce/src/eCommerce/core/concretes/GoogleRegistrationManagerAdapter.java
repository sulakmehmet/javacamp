package eCommerce.core.concretes;

import eCommerce.GoogleRegistration.GoogleRegistrationManager;
import eCommerce.core.abstracts.UserRegistrationService;
import eCommerce.entities.concretes.User;

public class GoogleRegistrationManagerAdapter implements UserRegistrationService {

	@Override
	public boolean registration(User user) {
		GoogleRegistrationManager googleRegistrationManager = new GoogleRegistrationManager();
		if(googleRegistrationManager.register(user.getEmail(), user.getPassword())) {
			return true;
		}
		System.out.println("Google ile baðlantý saðlanamamýþtýr.");
		return false;
	}

}
