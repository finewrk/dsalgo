package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LaunchPage;
import utilities.ConfigReader;
import utilities.Constant;
import utilities.DriverFactory;
import utilities.Loggers;
import utilities.WebUtility;

public class Launch_SD {

	public LaunchPage launchPage;

	@Given("Open Chrome Browser")
	public void open_chrome_browser() {

		launchPage = new LaunchPage(DriverFactory.getDriver());
		Loggers.info("Launching Chrome Browser");
	}

	@Given("open portal link")
	public void open_portal_link() {

		DriverFactory.openPage(ConfigReader.getApplicationUrl());
		Loggers.info("Opening Home Page");

	}

	@When("I click on get started")
	public void i_click_on_get_started()
	{
		launchPage.clickgetstarted();
		Loggers.info("Clicking on Get Started Button ");

	}

	@Then("the landing page is HOME Page")
	public void the_landing_page_is_home_page() {
		Loggers.info("we are in the Home page now ");
		Assert.assertEquals(launchPage.gethomepagetitle(), Constant.HOME_PAGE_TITLE);

	}
}
