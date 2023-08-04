package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Constant;


public class LaunchPage {


	public LaunchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement getstarted;

	@FindBy(className =  "navbar-brand") WebElement homePageTitle;
	
	public void clickgetstarted() {
		getstarted.click();

	}

	public String gethomepagetitle() {
		return homePageTitle.getText();

	}
	
}
