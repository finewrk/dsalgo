package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.configFileReader;
import utilities.driverFactory;

public class OpenPortalPage {
	public static WebDriver driver = driverFactory.getdriver();
	String URL=configFileReader.getUrl();
	//String homeURL=configFileReader.getHomePage();
	 @FindBy(xpath="//a[@href='/home']")WebElement getstarted;
	 public void OpenPortalPage() {

			PageFactory.initElements(driver, this);
		}
	 public void dsalgo() {

			driver.get(URL);

		}
	 public void clickgetstarted() {
		 PageFactory.initElements(driver, this);
		 getstarted.click();
		 
		 
	 }
	 public String getPageTitle() {

			String title = driver.getTitle();
			return title;

		}
	public static String gethomepagetitle() {
		// TODO Auto-generated method stub
		return "NumpyNinja";
	}
	 
	
	
}
