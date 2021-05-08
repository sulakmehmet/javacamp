package eCommerce.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.core.abstracts.UserRegistrationService;
import eCommerce.entities.concretes.User;

public class UserRegistrationManager implements UserRegistrationService {

	@Override
	public boolean registration(User user) {
		if (user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			if (emailValidate(user.getEmail()) && emailCheck(user.getEmail())) {
				if (user.getPassword().length() >= 6) {
					if (verificationEmail(user.getEmail())) {
						return true;
					}else {
						System.out.println("Doðrulama e postasý gönderilmiþtir. Lütfen kontrol edin.");
						return false;
					}					
				}
				System.out.println("Parola en az 6 karakter olmalýdýr.");
				return false;
			}
			System.out.println("Email yanlýþ ya da kullanýlmýþtýr.");
			return false;
		}
		System.out.println("Ad ve soyad geçersizdir.");
		return false;
	}

	public static boolean emailValidate(String email) {

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		//System.out.println(email + " : " + matcher.matches());
		return matcher.matches();
	}

	public static boolean emailCheck(String email) {
		String[] emails = { "abc@gmail.com", "asd@gmail.com", "mehmet@gmail.com" };
		for (String ePosta : emails) {
			if (email == ePosta) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean verificationEmail(String email) {
		// doðrulama maili simüle edilmiþtir.
		return false;
	}

}
