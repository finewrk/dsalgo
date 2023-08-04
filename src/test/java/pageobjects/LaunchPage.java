package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LaunchPage {


	public LaunchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement getstarted;

	public void clickgetstarted() {
		getstarted.click();

	}

	public String gethomepagetitle() {
		return "NumpyNinja";

	}

}
