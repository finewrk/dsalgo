package StepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.loggerLoad;
import pageObjects.HomePage;

public class B_Home_SD {
	HomePage homepage =new HomePage();
	
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		loggerLoad.info("User is on DSAlgo portal page");
		homepage.dsalgoHome();
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
		loggerLoad.info("User clicks on \"Getstarted link\" on Home Page");
	    homepage.getStartedHome(string);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
		String alert = homepage.alert();
		loggerLoad.info("Alert Message: " + alert);
		assertEquals(alert, string, "Title do not match");
	}

	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
	    homepage.dropDown(string);
	}
	@Then("The second warning message {string}")
	public void the_second_warning_message(String string) {
		String alert = homepage.alert();
		loggerLoad.info("Alert Message: " + alert);
		assertEquals(alert, string, "Title do not match");
	}


	@When("The user clicks on signin link")
	public void the_user_clicks_on_signin_link() {
		loggerLoad.info("User clicks on Sign in ");
		homepage.homeSignin();
	}

	@Then("The user redirected to login page")
	public void the_user_redirected_to_login_page() {
		loggerLoad.info("User redirected to login page ");
		String Title = homepage.loginTitle();
		loggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, "Login", "Title do not match");

	}

	@When("The user clicks on register link")
	public void the_user_clicks_on_register_link() {
		loggerLoad.info("User clicks on Register ");
		homepage.homeregister();
	}

	@Then("The user redirected to Registration page")
	public void the_user_redirected_to_registration_page() {
		loggerLoad.info("User redirected to Registraion page ");
		String Title = homepage.registertitle();
		loggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, "Registration", "Title do not match");
	}


}
