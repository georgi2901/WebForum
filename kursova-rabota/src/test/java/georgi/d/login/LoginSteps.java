package georgi.d.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import georgi.d.login.model.LoginScreenModel;

public class LoginSteps {
	
	private LoginScreenModel loginModel;

	@Given("^Отваря страницата за вход в системата$")
	public void openLoginScreen() throws Throwable {
		loginModel = new LoginScreenModel();
	}

	@When("^Въведе валидно потребителско име$")
	public void inputValidUsername() throws Throwable {
		loginModel.setUsername("Георги");
	}

	@When("^въведе валидна парола$")
	public void inputValidPassword() throws Throwable {
		loginModel.setPassword("123321");
	}

	@When("^и натисне бутона за вход$")
	public void pressLoginButton() throws Throwable {
		loginModel.pressLoginButton();
	}

	@Then("^Вижда съобщение за успешен вход в системата\\.$")
	public void checkMessage() throws Throwable {
		assertEquals("Успешен вход в системата!", loginModel.getMessage());
	}
	
	@Then("^Вижда съобщение за липса на данни$")
	public void emptyDataMessage() throws Throwable {
		assertEquals("Въведете име и парола!", loginModel.getMessage());
	}

}
