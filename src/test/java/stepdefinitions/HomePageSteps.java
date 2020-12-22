package stepdefinitions;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	private static String title;
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@When("user clicks on Build proposal through Sales Tools from Menu icon")
	public void user_clicks_on_build_proposal_through_sales_tools_from_menu_icon() {
		homePage.navigateToMenu();
		homePage.clickToolsSection();
		homePage.clickProposalBuilder();
	}

	@Then("user clicks SELECT LEAD proposal")
	public void user_clicks_select_lead_proposal() {
		homePage.clickSelectLead();
	}
}
