package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi " + user.getEmail());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile g�ncellendi " + user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi " + user.getEmail());
		
	}

}
