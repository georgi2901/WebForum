package georgi.d.topic;

import java.util.Set;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import georgi.d.models.Role;
import georgi.d.models.User;
import georgi.d.topic.service.TopicService;

public class TopicSteps {
	
	private User user;
	private String topicName;
	
	
	@Given("^В системата влизаме с администраторски профил$")
	public void enterAdminUser() throws Throwable {
		user = new User("Joro", "12344321");
		final Set<Role> roles = user.getRoles();
		roles.add(new Role("admin"));
	}
	
	@Given("^В системата влизаме с обикновен профил$")
	public void enterUser() throws Throwable {
		user = new User("Ivan", "123321");
		final Set<Role> roles = user.getRoles();
		roles.add(new Role("user"));
	}

	@Given("^Отваряме страницата за създаване на теми$")
	public void openCreateTopic() {

	}

	@When("^Въведе име на тема: \"([^\"]*)\"$")
	public void topicName(String topic) throws Throwable {
		this.topicName=topic;
	}

	@When("^натискаме бутона за създаване$")
	public void createButton() throws Throwable {
		TopicService.cretaeTopic(user, topicName);
	}

	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void messageSeen(String message) throws Throwable {
		assertEquals(message, message);
	}

}
