package StepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import utilities.loggerLoad;
//import utilities.ElementsUtils;
public class F_Array_SD {
	ArrayPage array = new ArrayPage();
	static String expectedMsg;
@Given("User is on Home page")
public void user_is_on_home_page() {
	loggerLoad.info("User is on Home page");
    array.homeurl();
}

@When("User clicks on array module")
public void user_clicks_on_array_module() {
   loggerLoad.info("User clicks on getstarted button on array module");
   array.clickgetstartedBtn_Array();
}

@Then("User Navigated to Arrays Page")
public void user_navigated_to_arrays_page() {
	loggerLoad.info("User Navigated to Arrays Page");
	array.getArrayPage();
}

@Given("User is on Arrays Page")
public void user_is_on_arrays_page() {
	loggerLoad.info("User is on Arrays Page");
}

@When("User clicks on array in Python link")
public void user_clicks_on_array_in_python_link() {

	loggerLoad.info("User clicks on Array in Python link");
	array.click_ArraysInPython();
}

@Then("User Navigated to Arrays in Python Page")
public void user_navigated_to_arrays_in_python_page() {
    loggerLoad.info("User Navigated to Arrays in Python Page");
    array.arraysInPython_Url();
}

@Given("User click on Try here button on Arrays in Python page and navigate to try editor page")
public void user_click_on_try_here_button_on_arrays_in_python_page_and_navigate_to_try_editor_page() {
	loggerLoad.info("User click on Try here button on Arrays in Python page and navigate to try editor page");
	array.click_tryhereBtn();
	
}

@Given("User click on Arrays Using List topic")
public void user_click_on_arrays_using_list_topic() {

	loggerLoad.info("User click on Arrays Using List Link ");
	array.click_ArraysUsingList();
}

@Given("User click on basic Operations in Lists")
public void user_click_on_basic_operations_in_lists() {
   
	loggerLoad.info("User click on basic Operations in Lists");
	array.click_BasicOperations();
}

@Given("User click on Applications of Array")
public void user_click_on_applications_of_array() {
    
	loggerLoad.info("User click on Applications of Array");
	array.click_ApplicationofArray();
}

//tag11
@Given("User click on Practies Questions")
public void user_click_on_practies_questions() {
	loggerLoad.info("User click on Practies Questions");
	array.click_practiceQues();
}

@When("User click on Question1 its navigate to tryeditor page")
public void user_click_on_question1_its_navigate_to_tryeditor_page() {
   loggerLoad.info("User click on Question1 its navigate to tryeditor page");
   array.naviQuestionOne();
}

@When("User clear the tryeditor textbox")
public void user_clear_the_tryeditor_textbox() {
	loggerLoad.info("User clear the tryeditor textbox");
	array.txteditorclr();
}
//tag13
@When("User click on submit button")
public void user_click_on_submit_button() {
	loggerLoad.info("User click on submit button");
    array.click_submitBtn();
}

@Then("The user should be presented with successful submission message")
public void the_user_should_be_presented_with_successful_submission_message() {
	loggerLoad.info("User should be presented with run result ");
	loggerLoad.info("Expected Message : " + expectedMsg);
	String actualMsg = array.getActualResult();
	loggerLoad.info("Actual result : " + actualMsg);
	assertEquals(actualMsg , expectedMsg, "Result do not match");
}

//tag14
@When("User click on Question2 its navigate to tryeditor page")
public void user_click_on_question2_its_navigate_to_tryeditor_page() {
  
	loggerLoad.info("User click on Question2 its navigate to tryeditor page");
	array.click_Question2();
}

//tag16
@When("User click on Question3 its navigate to tryeditor page")
public void user_click_on_question3_its_navigate_to_tryeditor_page() {
	loggerLoad.info("User click on Question3 its navigate to tryeditor page");
	array.click_Question3();
}

//tag18
@When("User click on Question4 its navigate to tryeditor page")
public void user_click_on_question4_its_navigate_to_tryeditor_page() {
	loggerLoad.info("User click on Question4 its navigate to tryeditor page");
	array.click_Question4();
}

@Then("Navigate back to Home page")
public void navigate_back_to_home_page() {
	loggerLoad.info("Navigate back to Home page");
	array.homeurl();
}

}
