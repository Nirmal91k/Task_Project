package stepdefinitions;

import org.junit.Assert;

import com.pages.ProposalPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProposalPageSteps {

	private static String title;
	private ProposalPage ProposalPage = new ProposalPage(DriverFactory.getDriver());

	@Then("user clicks on ADD LEAD button")
	public void user_clicks_on_add_lead_button() {
		ProposalPage.clickLead();
	}

	@Then("user enters First Name")
	public void user_enters_first_name() {
		ProposalPage.entersFirstName();
	}

	@Then("user enters Last Name")
	public void user_enters_last_name() {
		ProposalPage.entersLastName();
	}

	@Then("user enters Email address")
	public void user_enters_email_address() {
		ProposalPage.entersEmail();
	}

	@Then("user enters Phone Number")
	public void user_enters_phone_number() {
		ProposalPage.entersPhoneNo();
	}

	@Then("user enters Scheduling Request Input Date")
	public void user_enters_scheduling_request_input_date() {
		ProposalPage.entersCalanderDate();
	}

	@Then("user enters Scheduling Request Input Time")
	public void user_enters_scheduling_request_input_time() {
		ProposalPage.entersCalanderTime();
	}

	@Then("user Uploads Document")
	public void user_uploads_document() {
		ProposalPage.uploadsDocument();
	}

	@Then("user Uploads Images")
	public void user_uploads_images() {
		ProposalPage.uploadsImage();
	}

	@Then("user click on SAVE LEAD button")
	public void user_click_on_save_lead_button() {
		ProposalPage.saveLead();
	}
}