package georgi.d.login.service;

import java.util.Collections;
import java.util.List;

import georgi.d.models.User;

public class LoginService {

	private static List<User> userDB = Collections.singletonList(new User("Георги", "123321"));
	public static String login(final String username, final String password) {
		
		if (null == password || null == username) {
			return "Въведете име и парола!";
		}
		
		final boolean isUserExisting = userDB.stream().anyMatch(u->u.getUsername().equals(username)&&u.getPassword().equals(password));
		return isUserExisting ? "Успешен вход в системата!" : null;
	}
 
}
