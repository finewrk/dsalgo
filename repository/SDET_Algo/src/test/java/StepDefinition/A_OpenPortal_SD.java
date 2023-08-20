package StepDefinition;

//import static org.testng.Assert.assertEquals;

import org.testng.Assert;

//import utilities.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.OpenPortalPage;

import utilities.loggerLoad;

public class A_OpenPortal_SD extends OpenPortalPage{
	
	OpenPortalPage openPage = new OpenPortalPage();

@Given("User opens dsalgo portal app url")
public void user_opens_dsalgo_portal_app_url() {
	loggerLoad.info("User is on DSAlgo portal page");
	openPage.dsalgo();
   
}

@When("User click on Get Started button")
public void user_click_on_get_started_button() {
	loggerLoad.info("User clicks on \"Getstarted link\" on Main Page");
	openPage.clickgetstarted();
	
}

@Then("User is navigated to Home page")
public void user_is_navigated_to_home_page() {
	
	String ExpTitle = OpenPortalPage.gethomepagetitle();
	String Title = openPage.getPageTitle();
	loggerLoad.info("Title of current page is:"+ Title );
	Assert.assertEquals(Title,ExpTitle);
	loggerLoad.info("User navigated to home page");
}


}


