package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Stackpage;
import utilities.loggerLoad;
public class H_Stack_SD {
	
	//DataStructure dsalgopage = new DataStructure();
	Stackpage stack = new Stackpage();
	//tag1
	@Given("User click on Get started button in Stack module")
	public void user_click_on_get_started_button_in_stack_module() {
		loggerLoad.info("User click on Get started button in Stack module");
		stack.click_getStartedStack();	  
	}
	
	@When("User click on Operations in Stack button")
	public void user_click_on_operations_in_stack_button() {
		loggerLoad.info("User click on Operations in Stack button");
	    stack.click_OperationInStack();
	}
	//tag3
	@Given("User click on Implementation text")
	public void user_click_on_implementation_text() {
		loggerLoad.info("User click on Operations in Stack button");
		stack.click_ImplementationStack();
	}
   //tag4
	@Given("User click on Applications text")
	public void user_click_on_applications_text() {
	    
		loggerLoad.info("User click on Applications text");
		stack.click_ApplicationStack();
	}
	
	//tag7
	@Given("The user is in Application page page")
	public void the_user_is_in_application_page_page() {
		loggerLoad.info("The User is in Application page page");
		stack.click_ApplicationStack();
	}

	@When("User click on practice questons in Application page")
	public void user_click_on_practice_questons_in_application_page() {
		loggerLoad.info("User click on practice questons in Application page");
		stack.PracticeQueStack();
	}

	@Then("Navigate back to Application page")
	public void navigate_back_to_application_page() {
		loggerLoad.info("Navigate back toApplication page");
		stack.navigatestackAppli();
	}


}
