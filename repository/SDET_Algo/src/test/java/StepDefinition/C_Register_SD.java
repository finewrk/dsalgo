package StepDefinition;

//import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.loggerLoad;
import pageObjects.RegisterPage;

public class C_Register_SD {
	
	RegisterPage registerpage = new RegisterPage();
//tag1
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		loggerLoad.info("The user opens Register page");
		registerpage.openRegisterurl();
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
	    loggerLoad.info("The user did not enter any inputs in the fields");
	    registerpage.clickRegisterBtn();
	}

	@Then("It should display an error message {string} below Username textbox")
	public void it_should_display_an_error_message_below_username_textbox(String expUsernameErrorMsg) {
		loggerLoad.info("Error message is displayed " + registerpage.getEmptyfieldErrormsgUser()+ " an error below Username textbox");
		assertTrue(registerpage.getEmptyRequiredUser(), "Please fill out this field");
		assertEquals(registerpage.getEmptyfieldErrormsgUser(), expUsernameErrorMsg);
	 
	}
//tag2
	@When("The user clicks {string} button after entering username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string, io.cucumber.datatable.DataTable dataTable) {
		loggerLoad.info("The user enter valid username with other fields empty");
		registerpage.validUserNameOnly(dataTable);
		registerpage.clickRegisterBtn();
	}

	@Then("It should display an error message {string} below Password textbox")
	public void it_should_display_an_error_message_below_password_textbox(String expErrorpwdmsg) {
	 
		loggerLoad.info("Error message is displayed " + registerpage.getEmptyfieldErrormsgUser()+ " an error below Password textbox");
		assertTrue(registerpage.getEmptyRequiredPwd(), "Please fill out this field");
		assertEquals(registerpage.getEmptyfieldErrormsgPwd(), expErrorpwdmsg);
	}
//tag3
	@When("The user clicks {string} button after entering {string} and {string} with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_and_with_password_confirmation_field_empty(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	    
		registerpage.validUserNameOnly(dataTable);
		registerpage.validPwd(dataTable);
		registerpage.clickRegisterBtn();
	}

	@Then("It should display an error message {string} below Password Confirmation textbox")
	public void it_should_display_an_error_message_below_password_confirmation_textbox(String expErrorconPwd) {
		loggerLoad.info("Error message is displayed " + registerpage.getEmptyfieldErrormsgUser()+ " an error below Password textbox");
		assertTrue(registerpage.getEmptyRequiredConfirmPwd(), "Please fill out this field.");
		assertEquals(registerpage.getEmptyfieldErrormsgConfirmPwd(), expErrorconPwd);
	}
//tag4
	@When("The user enters a {string} with characters other than Letters, digits and {string}")
	public void the_user_enters_a_with_characters_other_than_letters_digits_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		registerpage.validUserNameOnly(dataTable);
		registerpage.validPwd(dataTable);
		registerpage.validConfirmPwd(dataTable);
		registerpage.clickRegisterBtn();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	    loggerLoad.info("Expected Error message is: " +string);
	    loggerLoad.info("Error message in Website after filling up every field is(no characters): " +registerpage.errormsgforInvalidusername());
	    assertEquals(registerpage.errormsgforInvalidusername(), string);
	}
//tag5
	@When("The user clicks {string} button after entering valid {string} and different passwords in {string} and {string} fields")
	public void the_user_clicks_button_after_entering_valid_and_different_passwords_in_and_fields(String string, String string2, String string3, String string4, io.cucumber.datatable.DataTable dataTable) {
	    registerpage.validUserNameOnly(dataTable);
		registerpage.validPwd(dataTable);
		registerpage.validConfirmPwd(dataTable);
		registerpage.clickRegisterBtn();;
	}
//tag6
	@When("The user enters a valid {string} and {string} with characters less than {int}")
	public void the_user_enters_a_valid_and_with_characters_less_than(String string, String string2, Integer int1, io.cucumber.datatable.DataTable dataTable) {
		registerpage.validUserNameOnly(dataTable);
		registerpage.validPwd(dataTable);
		registerpage.validConfirmPwd(dataTable);
		registerpage.clickRegisterBtn();
	}
//tag7
	@When("The user enters a valid {string} and {string} with only numbers")
	public void the_user_enters_a_valid_and_with_only_numbers(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		registerpage.validUserNameOnly(dataTable);
		registerpage.validPwd(dataTable);
		registerpage.validConfirmPwd(dataTable);
		registerpage.clickRegisterBtn();
	}
//tag8
	@When("The user enters a valid {string} and {string} similar to username")
	public void the_user_enters_a_valid_and_similar_to_username(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		registerpage.validUserNameOnly(dataTable);
		registerpage.validPwd(dataTable);
		registerpage.validConfirmPwd(dataTable);
		registerpage.clickRegisterBtn();	}
//tag9
	@When("The user enters a valid {string} and commonly used password {string}")
	public void the_user_enters_a_valid_and_commonly_used_password(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		registerpage.validUserNameOnly(dataTable);
		registerpage.validPwd(dataTable);
		registerpage.validConfirmPwd(dataTable);
		registerpage.clickRegisterBtn();	}
//tag11
	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
		registerpage.validUserNameOnly(dataTable);
		registerpage.validPwd(dataTable);
		registerpage.validConfirmPwd(dataTable);
		registerpage.clickRegisterBtn();
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
		loggerLoad.info("Valid User redirected to Homepage ");
		String Title = registerpage.getPageTitle();
		loggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, "NumpyNinja", "Title mismatch");
	}
//tag10
	@When("The user enters a valid existing {string} with {string} and {string}")
	public void the_user_enters_a_valid_existing_with_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		registerpage.validUserNameOnly(dataTable);
		registerpage.validPwd(dataTable);
		registerpage.validConfirmPwd(dataTable);
		registerpage.clickRegisterBtn();
	}
//tag12
//	@Given("The user is on signin page")
//	public void the_user_is_on_signin_page() {
//	    loggerLoad.info("The user opens sign in page");
//		registerpage.openSiginurl();
//	}
//
//	@When("The user enter valid {string} and {string}")
//	public void the_user_enter_valid_and(String string, String string2,io.cucumber.datatable.DataTable dataTable ) {
//		registerpage.validUserNameOnly(dataTable);
//		registerpage.validPwd(dataTable);
//		
//	}
//
//	@Then("click login button to verify")
//	public void click_login_button_to_verify() {
//	   
//		loggerLoad.info("The user click login button to verify");
//		registerpage.clickLogin();
//	}

//tag14
	@Given("The user is in the Sign in page")
	public void the_user_is_in_the_sign_in_page() {
	   loggerLoad.info("The user is in sign in page already");
	}

	@When("The user clicks the {string} link")
	public void the_user_clicks_the_link(String string) {
		registerpage.clickSignout();
		 loggerLoad.info("The user clicks sign out ");

	}

	@Then("The user should be redirected to the homepage with the message {string}")
	public void the_user_should_be_redirected_to_the_homepage_with_the_message(String StrSignout) {
		loggerLoad.info("Logged out alert message"  + registerpage.getlogoutalertmsg()+ " is shown on the top");
		assertEquals(registerpage.getlogoutalertmsg(), StrSignout);
		
	}


}
