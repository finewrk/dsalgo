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

import pageobjects.Homepage;

import pageobjects.StackPage;
import utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggers;
import utilities.ExcelReader;

public class Stack_SD {
	
	String excelpath = ".\\src/test/resources/ExcelData/pythoncodeexcel.xlsx";
	String output="";
	String expmsg;
	String actmsg;
	String windowtitle;
	WebDriver driver =DriverFactory.getDriver();
	StackPage stackpage = new StackPage(driver);
	Homepage homepage;
	
	@Given("user able to click on dropdown")
	public void user_able_to_click_on_dropdown() throws InterruptedException {
		//driversetup.openPage("https://dsportalapp.herokuapp.com/login");
		
		homepage = new Homepage(driver);
		
		homepage.dropDownclk();
		//Thread.sleep(1000);
	}

	@When("user select stack option")
	public void user_select_stack_option() throws InterruptedException {
		stackpage.selectstack();
		//Thread.sleep(1000);
		Loggers.info("select stack menu from dropdown");
	}

	@When("user select operations in stack")
	public void user_selct_operations_in_stack() throws InterruptedException {
		Loggers.info("select operations in stack");
		stackpage.menuselection(1);		
		//Thread.sleep(1000);
		
	}
//	operations in stack page
	@Given("user click on Try Here button")
	public void user_click_on_try_here_button() throws InterruptedException {
		stackpage.trybtnclk();
		//Thread.sleep(1000);
		Loggers.info("try button click");
	}

	@When("user enter valid python code from given {string} and {int}")
	public void user_enter_valid_python_code_from_given_and(String string, Integer int1) throws InterruptedException, InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		Loggers.info("User enter valid code for operations in stack");
		List<Map<String, String>> testData=reader.getData(excelpath,"Sheet1");
		
		String pythoncode=testData.get(int1).get("pythoncode"); // Column heading
		output=testData.get(int1).get("result"); // Column heading

		expmsg=output;
		System.out.println(pythoncode);
		System.out.println(output);
	
		stackpage.readcode(pythoncode);		
	}

	@When("user click run button")
	public void user_click_run_button() throws InterruptedException {
		stackpage.runbtnclk();
		Loggers.info("run button click");
		
	}
	@Then("user should see output")
	public void user_should_see_output() {
		actmsg=stackpage.compoutout();
		System.out.println(actmsg);
		driver.navigate().back();
	}
	
	@When("user enter invalid python code from given {string} and {int}")
	public void user_enter_invalid_python_code_from_given_and(String string, Integer int1) throws InvalidFormatException, IOException, InterruptedException {

		ExcelReader reader = new ExcelReader();
		Loggers.info("User enter invalid code for operations in stack");
		List<Map<String, String>> testData=reader.getData(excelpath,"Sheet1");
		String pythoncode=testData.get(int1).get("pythoncode"); // Column heading
		output=testData.get(int1).get("result"); // Column heading

		expmsg=output;
		System.out.println(pythoncode);
		System.out.println(output);
	
		stackpage.readcode(pythoncode);		
	}

	@Then("user should get alert")
	public void user_should_get_alert() throws InterruptedException {
		
		Loggers.info("run button click for invalid code");
		 Alert alert =driver.switchTo().alert();
		   WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		   if(w.until(ExpectedConditions.alertIsPresent())==null)
			   System.out.println("alert not exist");
		   else
			   System.out.println("Alert exists");
		alert.accept();
		DriverFactory.NavBack();
		
	}
	
// implementation page
	
	@Given("user select implementation")
	public void user_select_implementation() throws InterruptedException {
		Loggers.info("select implementation in stack");
		stackpage.menuselection(2);		
		//Thread.sleep(1000);
	}
	

//applications
	@Given("user select applications")
	public void user_select_applications() throws InterruptedException {
		Loggers.info("selectapplications in stack");
		stackpage.menuselection(3);		
		//Thread.sleep(1000);
	}

	
	@Given("user select practice questions")
	public void user_select_practice_questions() throws InterruptedException {
		Loggers.info("select practice questions in stack");
		stackpage.menuselection(4);		
		Thread.sleep(1000);
	}

	@Given("navigate back to login page")
	public void navigate_back_to_login_page() {
		DriverFactory.NavBack();
	}
}
