package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructure;
import utilities.configFileReader;
import utilities.loggerLoad;
//import org.openqa.selenium.WebDriver;
import utilities.ElementsUtils;
import static org.testng.Assert.assertEquals;

public class E_Datastructure_SD {
	
	DataStructure dsalgopage = new DataStructure();
	String ExcelPath = configFileReader.getExcelPath();
	ElementsUtils elementUtil = new ElementsUtils();
	static String pythoncode;
	static String result;
	static String expectedResult;
	Boolean isRequired ;
	//tag1
	@Given("User click on Get started button in data Structures module")
	public void user_click_on_get_started_button_in_data_structures_module() {
		loggerLoad.info("User is on ds algo Home page and clicks Datastructre getstarted button");
		dsalgopage.clickgetstartedBtn();
	}

	@When("User click on Time Complexity button")
	public void user_click_on_time_complexity_button() {
		loggerLoad.info("User click on Time Complexity button");
		dsalgopage.selectTimecomplexity();
	}

	@When("click Try here button and navigate to try edidor page")
	public void click_try_here_button_and_navigate_to_try_edidor_page() {
	  loggerLoad.info("user clicks Try here button and navigate to try edidor page");
	  dsalgopage.clicktryhereBtn();
	}
	//tag2
	@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer Rownumber) throws Exception {
	   loggerLoad.info("User enters valid python code in tryEditor from sheetname :" + Sheetname + " and row number : " + Rownumber);
	   dsalgopage.enterPythonCode(Sheetname, Rownumber);
	   expectedResult = dsalgopage.getExpectedResult(Sheetname, Rownumber);
	}

	@When("User click on run button")
	public void user_click_on_run_button() {
		loggerLoad.info("User click run button");
		dsalgopage.clickRunBtn();	
	}

	@Then("User should be presented with run result")
	public void user_should_be_presented_with_run_result() {
		loggerLoad.info("User should be presented with run result ");
		loggerLoad.info("Expected result : " + expectedResult);
		String actualMsg = dsalgopage.getActualResult();
		loggerLoad.info("Actual result : " + actualMsg);
		assertEquals(actualMsg , expectedResult, "Result do not match");
	   
	}
	@Given("The user is on try edidor page")
	public void the_user_is_on_try_edidor_page() {
		dsalgopage.tryeditorPage();
	}

	@When("The user enter invalid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_invalid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer Rownumber) throws Exception {
		//dsalgopage.clear();
		loggerLoad.info("User enters invalid python code in tryEditor from sheetname :" + Sheetname + " and row number : " + Rownumber);
		dsalgopage.enterPythonCode(Sheetname, Rownumber);
		expectedResult = dsalgopage.getExpectedResult(Sheetname, Rownumber);
	}

	@Then("User should get alert message")
	public void user_should_get_alert_message() {
		loggerLoad.info("User should be presented with error message");
		loggerLoad.info("Expected result : " + expectedResult);
	    String actualErrorMsg = dsalgopage.getAlertErrorText();
	    loggerLoad.info("Actual Error Message : " + actualErrorMsg);
	    assertEquals(actualErrorMsg, expectedResult, "Result do not match");
	}

	@Given("User click on practice questons")
	public void user_click_on_practice_questons() {
		loggerLoad.info("User click on practice questons");
		dsalgopage.practicequestions();
	}

	@Given("Navigate back to data stuctures introduction page")
	public void navigate_back_to_data_stuctures_introduction_page() {
		loggerLoad.info("Navigate back to data stuctures introduction page");
		dsalgopage.navigatebackToHome();
	}


}
