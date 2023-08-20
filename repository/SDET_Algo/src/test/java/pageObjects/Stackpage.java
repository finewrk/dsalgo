package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import utilities.configFileReader;
import utilities.driverFactory;

public class Stackpage {
	public static WebDriver driver = driverFactory.getdriver();
	String StackURL = configFileReader.getStackURL();
	@FindBy(xpath = "//a[@href='stack']")WebElement getstarted_Stack;
	@FindBy(linkText="Operations in Stack")WebElement OperationsinStack;
	@FindBy(linkText="Implementation")WebElement Implementation;
	@FindBy(linkText="Applications")WebElement Applications;
	@FindBy(linkText="Practice Questions")WebElement PracticeQueStack;
	public Stackpage(){
		PageFactory.initElements(driver, this);	
	}

	public void click_getStartedStack() {
	
		getstarted_Stack.click();
	}

	public void click_OperationInStack() {
		
		OperationsinStack.click();
	}
	public void click_ImplementationStack() {
		driver.navigate().back();
		Implementation.click();
		
	}

	public void click_ApplicationStack() {
		driver.navigate().back();
		Applications.click();
		
	}

	public void PracticeQueStack() {
		driver.navigate().back();
		PracticeQueStack.click();
		
	}

	public void navigatestackAppli() {
		
		driver.navigate().back();
	}

}
