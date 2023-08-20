package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.configFileReader;
import utilities.driverFactory;

public class QueuePage {
	public static WebDriver driver = driverFactory.getdriver();
	String QueueURL = configFileReader.getqueueurl();
	String HomeURL = configFileReader.getHomePage();
	@FindBy(xpath = "//a[@href='queue']")WebElement getstarted_queue;
	@FindBy(linkText="Implementation of Queue in Python")WebElement ImplemenationofQue;
	@FindBy(linkText="Implementation using array")WebElement ImplemenationUsingArray;
	@FindBy(linkText="Queue Operations")WebElement QueueOperations;
	@FindBy(linkText="Implementation using collections.deque")WebElement ImplementUsingCollections;
	@FindBy(linkText="Practice Questions")WebElement PracticeQueInQue;
	public QueuePage() {
	
		PageFactory.initElements(driver, this);	
	}

	public void click_getstartedqueue() {
		getstarted_queue.click();
		
	}

	public void click_ImplemenationofQue() {
		
		ImplemenationofQue.click();
	}

	public void click_ImpleUSingCollections() {
		
		driver.navigate().back();
		ImplementUsingCollections.click();
	}

	public void click_ImplementationUsingArray() {
		driver.navigate().back();
		ImplemenationUsingArray.click();	
	}

	public void click_QueueOpeations() {
		driver.navigate().back();
		QueueOperations.click();
	}

	public void click_practiceQuesInque() {
		driver.navigate().back();
		PracticeQueInQue.click();
	}

	public void navigateBackqueue() {
		driver.navigate().to(QueueURL);
		
	}
	
		
	}



