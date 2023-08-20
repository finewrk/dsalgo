package StepDefinition;

//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import utilities.ExcelReader;
import utilities.configFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterPage;
import pageObjects.SignInPage;
import utilities.loggerLoad;

public class D_SignIn_SD {
	
	SignInPage signin = new SignInPage();
	String ExcelPath = configFileReader.getExcelPath();
	String expectedMessage;
	static String username;
	static String password;
	RegisterPage registerpage = new RegisterPage();
	Boolean isRequired ;
	String actualmessage;
	//@tag1

@Given("The user is on signin page")
public void the_user_is_on_signin_page() {
   signin.openLogin();
}

	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
	   
		loggerLoad.info("User clicks on Register ");
		signin.registerInSignIn();
		
	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
	   
		loggerLoad.info("User redirected to Registration page from signin page");
		signin.openRegisterurl();
		String Title = signin.titleOfPage();
		loggerLoad.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title, "Registration", "Title do not match");
	}
//tag2
	@Given("The user is on Sign in page")
	public void the_user_is_on_sign_in_page() {
		loggerLoad.info("User clicks on Login again and navigate back to login page ");
		signin.openLogin();
	}
	
//	@When("The user enter invalid {string} and {string}")
//	public void the_user_enter_invalid_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
//	   
//	    signin.invalidusername(dataTable);
//	    signin.invalidpwd(dataTable);
//	    signin.clickloginbutton();
//	}

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String username, String password) {
		loggerLoad.info("User Enter username as \" " + username + "\" and Password as \" "+ username +"\" ");
		System.out.println("Username"+username);
		System.out.println("Password"+password);
		isRequired = signin.BoolLogin(username,password);
		
		assertTrue(isRequired);
		loggerLoad.info("Empty field value is validated");
	}
	@Then("click login button to verify")
	public void click_login_button_to_verify() {

		loggerLoad.info("User clicks on login button");
		signin.clickloginbutton();
	}
//tag3
	@Given("The user is on Login page")
	public void the_user_is_on_login_page() {
		loggerLoad.info("User clicks on Login again and navigate back to login page ");
		signin.openLogin();
	}
	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String Sheetname, Integer Rownumber) throws InvalidFormatException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		ExcelReader excelReader = new ExcelReader();
		
		List<Map<String, String>> testdata = excelReader.getData(ExcelPath, Sheetname);
		username = testdata.get(Rownumber).get("username");
		password = testdata.get(Rownumber).get("password");
		expectedMessage = testdata.get(Rownumber).get("expectedmessage");
		actualmessage = signin.actualerrormsg();
		loggerLoad.info("User Enter username as \" "+username+"\" and Password as \" " +password+ "\" ");
		if (username != null || password != null) {
			signin.BoolLogin(username, password);
		}
		//assertTrue(signin.actualerrormsg(), "Please fill out this field");
		//assertEquals(actualmessage, expectedMessage);
	}

	@Then("click login button")
	public void click_login_button() {
	  loggerLoad.info("User click login button");
	  loggerLoad.info("Expected Message form excel sheet is :" +expectedMessage);
	  signin.clickloginbutton();
	  String msg = signin.messagewhenLogin();
	  loggerLoad.info("Actual Message from the website is:  " + msg);
	  assertEquals(msg, expectedMessage);

	  
	}
//tag4
	@Given("The user is on signin page with valid username {string} and password {string}")
	public void the_user_is_on_signin_page_with_valid_username_and_password(String username, String password) {
		loggerLoad.info("User Enter username as \" " + username + "\" and Password as \" "+ password +"\" ");
		//signin.BoolLogin(username, password);
	    //signin.clickloginbutton();
	}

	@When("The user click signout button")
	public void the_user_click_signout_button() {
	  loggerLoad.info("User clicks signout button");
	  signin.signout();
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		loggerLoad.info("User is in home page without sign in");
		loggerLoad.info("Alert message should be "+ signin.alertmessage());
	
	}

  //tag5 

@Given("The user clicks sign in button")
public void the_user_clicks_sign_in_button() {
	
	 signin.openLogin();
}

@Given("enter valid username {string} and password {string}")
public void enter_valid_username_and_password(String username, String password) {
	loggerLoad.info("User Enter username as \" " + username + "\" and Password as \" "+ password +"\" ");
	signin.BoolLogin(username, password);
}

@When("The user clicks login button")
public void the_user_clicks_login_button() {
	 loggerLoad.info("User clicks login button");
	 signin.clickloginbutton();
}


}
