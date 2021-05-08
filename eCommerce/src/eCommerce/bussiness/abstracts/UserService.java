package eCommerce.bussiness.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(User user);

}
