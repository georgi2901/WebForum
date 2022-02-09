package georgi.d.login.model;

import georgi.d.login.service.LoginService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public void setUsername(final String username) {
		this.username = username;
		
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public void pressLoginButton() {
		message = LoginService.login(username, password);
		
	}

	public String getMessage() {
		return message;
	}

}
