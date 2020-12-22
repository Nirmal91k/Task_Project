package stepdefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	ConfigReader config = new ConfigReader();
	private DriverFactory driverFactory;
	private static String title;	
	public String baseUrl = config.getApplicationUrl();
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get(baseUrl);
	}

	@When("user enters username")
	public void user_enters_username() {
		loginPage.enterUserName();
	}

	@When("user enters password")
	public void user_enters_password() {
		loginPage.enterPassword();
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}

}
