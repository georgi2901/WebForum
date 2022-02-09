package georgi.d.comment;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import georgi.d.comment.model.CommentScreenModel;


public class CommentSteps {
	
	private CommentScreenModel commentModel;

	@Given("^Отваря страницата за писане на коментар$")
	public void openCommentPage() throws Throwable {
		commentModel = new CommentScreenModel();
	}

	@When("^Въведе валидно име на тема$")
	public void insertName() throws Throwable {
		commentModel.setContentA("Мотори");
	}
	
	@When("^Въведе невалидно име на тема$")
	public void invalidName() throws Throwable {
		commentModel.setContentA("Имоти");
	}

	@When("^въведе съдържание на коментара$")
	public void insertContent() throws Throwable {
		commentModel.setContentB("123321");
	}

	@When("^и натисне бутона за създаване на коментар$")
	public void pressCommentButton() throws Throwable {
		commentModel.pressCommentButton();
	}

	@Then("^Вижда съобщение за успешено създаване на коментар$")
	public void seesMessage() throws Throwable {
		assertEquals("Успешно създадохте коментар!", commentModel.getMessage());
	}
	
	@Then("^Вижда съобщение за липса на съдържание$")
	public void noContentMessage() throws Throwable {
		assertEquals("Липсва съдържание на коментара!", commentModel.getMessage());
	}
	
	@Then("^Вижда съобщение за несъществуваща тема$")
	public void notExistingTopicMessage() throws Throwable {
		assertEquals("Няма такава тема!", commentModel.getMessage());
	}


}
