package stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Homepage;
import pageobjects.TreePage;
import utilities.DriverFactory;
import utilities.ExcelReader;
import utilities.Loggers;

public class Tree_SD {
	
	String excelpath = ".\\src/test/resources/ExcelData/pythoncodeexcel.xlsx";
	String output="";
	String expmsg;
	String actmsg;
	String windowtitle;
	WebDriver driver =DriverFactory.getDriver();
	TreePage treepage = new TreePage(driver);
	Homepage homepage ;
	
	@Given("user able to click on dropdown for tree")
	public void user_able_to_click_on_dropdown_for_tree() throws InterruptedException {
		homepage = new Homepage(driver);
		homepage.dropDownclk();
		Thread.sleep(1000);  
	}
	   

	@When("user select tree option")
	public void user_select_tree_option() throws InterruptedException {
		treepage.dropdown_tree();
		Thread.sleep(1000);
		Loggers.info("select Tree menu from dropdown");	   
	}

	@When("user select tree in python")
	
	public void user_select_tree_in_python() throws InterruptedException {
		/*
		 * Loggers.info("select treein python"); treepage.dropdown_tree();
		 * Thread.sleep(1000);
		 */
	}

	@Given("user click on Try Here button in tree")
	public void user_click_on_try_here_button_in_tree() {
		treepage.click_implementationinPython();
		treepage.click_Tryhere();
		Loggers.info("Tree try button click");
	}

	@When("user enter valid code in tree in python from given {string} and {int}")
	public void user_enter_valid_code_in_tree_in_python_from_given_and(String Sheet1, Integer int1) 
		 throws InvalidFormatException, IOException {
			ExcelReader reader = new ExcelReader();
			Loggers.info("User enter valid code for operations in stack");
			List<Map<String, String>> testData=reader.getData(excelpath,"Sheet1");
			String pythoncode=testData.get(int1).get("pythoncode"); // Column heading
			output=testData.get(int1).get("result"); // Column heading
			expmsg=output;
			System.out.println("*************** Excel Value "+pythoncode);
			treepage.userInput1(pythoncode);
			System.out.println("*************** UserInput1"+output);
	}


	@When("user click run button in tree")
	public void user_click_run_button_in_tree() 
		  throws InterruptedException {
			treepage.clickOnRun();
			Loggers.info(" run button click");
		}

	@Then("user should see output in tree")
	public void user_should_see_output_in_tree() {
		
			actmsg=TreePage.output();
			System.out.println(actmsg);
			driver.navigate().back();  
		}

		/*
		 * @When("user enter invalid code in tree in python from given {string} and {int}"
		 * ) public void user_enter_invalid_code_in_tree_in_python_from_given_and(String
		 * string, Integer int1) throws InvalidFormatException, IOException {
		 * ExcelReader reader = new ExcelReader();
		 * Loggers.info("User enter valid code for operations in stack");
		 * List<Map<String, String>> testData=reader.getData(excelpath,"Sheet1"); String
		 * pythoncode=testData.get(int1).get("pythoncode"); // Column heading
		 * output=testData.get(int1).get("result"); // Column heading expmsg=output;
		 * System.out.println("*************** Excel Value "+pythoncode);
		 * treepage.userInput1(pythoncode);
		 * System.out.println("*************** UserInput1"+output);
		 * treepage.clickOnRun();
		 * 
		 * }
		 */
		/*
		 * @Then("user should get alert in tree") public void
		 * user_should_get_alert_in_tree() throws InterruptedException {
		 * 
		 * Loggers.info("run button click for invalid code"); Alert alert
		 * =driver.switchTo().alert(); WebDriverWait w = new
		 * WebDriverWait(driver,Duration.ofSeconds(5));
		 * if(w.until(ExpectedConditions.alertIsPresent())==null)
		 * System.out.println("alert not exist"); else
		 * System.out.println("Alert exists"); alert.accept(); DriverFactory.NavBack();
		 * //Thread.sleep(3000); }
		 */
	
		
//	/*@Given("user select tree operation page")
//	public void user_select_tree_operation_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("user select practice questions in tree")
//	public void user_select_practice_questions_in_tree() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("navigate back to login page from tree")
//	public void navigate_back_to_login_page_from_tree() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}*/
//
//
}
