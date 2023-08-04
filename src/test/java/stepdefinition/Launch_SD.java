package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.Loggers;
import utilities.WebUtility;

public class Launch_SD {

	public WebDriver driver;
	public Launch_SD dsalgo;

	@Given("Open Chrome Browser")
	public void open_chrome_browser() {

		driver = DriverFactory.getDriver();
		Loggers.info("Launching Chrome browser");

	}

	@Given("open portal link")

	public void open_portal_link() {
		/*
		 * String URL1 = "https://dsportalapp.herokuapp.com"; driver.get(URL1);
		 */
		
		driver.get(ConfigReader.getApplicationUrl());
		Loggers.info("Opening Home Page");

	}

	@When("I click on get started")

	public void i_click_on_get_started()

	{
		WebElement webEl = driver.findElement(By.className("btn"));
		webEl.click();
		Loggers.info("Clicking on Get Started Button ");
		// WebUtility.webClick(webEl);

	}

	@Then("the landing page is HOME Page")

	public void the_landing_page_is_home_page() {
		Loggers.info("we are in the Home page now ");
	

	}
}
