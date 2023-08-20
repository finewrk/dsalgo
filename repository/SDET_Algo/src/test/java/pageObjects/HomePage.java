package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.loggerLoad;
import utilities.configFileReader;
import utilities.driverFactory;

public class HomePage {
	public static WebDriver driver = driverFactory.getdriver();
	String HomeUrl = configFileReader.getHomePage();
	
	//dropdown
	@FindBy (xpath="//a[@href='#']")
	WebElement dropdown;
	
	@FindBy(xpath = "//a[text()='Arrays']")
	WebElement arrayselement;
	
	@FindBy(xpath = "//a[text()='Linked List']")
	WebElement linkedlistelement;
	
	@FindBy(xpath = "//a[text()='Stack']")
	WebElement stackelement;
	
	@FindBy(xpath = "//a[text()='Queue']")
	WebElement queueelement;
	
	@FindBy(xpath = "//a[text()='Tree']")
	WebElement treeelement;
	
	@FindBy(xpath = "//a[text()='Graph']")
	WebElement graphelement;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement alertelement;
//	@FindBy(xpath = "//*[text()='Get Started']") List<WebElement> DsgetStarted;
//	int getStartedCount = DsgetStarted.size();
	//module get started
	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement getstartBtn_datastructures;
	@FindBy (xpath="//a[@href='array']")WebElement getstartBtn_array;
	@FindBy (xpath="//a[@href='linked-list']")WebElement getstartBtn_linkedlist;
	@FindBy (xpath="//a[@href='stack']")WebElement getstartBtn_stack;
	@FindBy (xpath="//a[@href='queue']")WebElement getstartBtn_queue;
	@FindBy (xpath="//a[@href='tree']")WebElement getstartBtn_tree;
	@FindBy (xpath="//a[@href='graph']")WebElement getstartBtn_graph;
	

	@FindBy(linkText = "Sign in")
	WebElement signinlink;
	@FindBy (xpath="//a[@href='/register']")WebElement registerlink;
	public HomePage() {
		PageFactory.initElements(driver, this);	
	}
	
	public void dsalgoHome() {
		
		driver.get(HomeUrl);
	}

	public void getStartedHome(String ds) {

		switch(ds){
		case "Datastructures":
			loggerLoad.info("User clicks on DataStructures ");
			getstartBtn_datastructures.click();
			break;
		case "Arrays":
			loggerLoad.info("User clicks on Array ");
			getstartBtn_array.click();
			break;
		case "Linkedlist":
			loggerLoad.info("User clicks on LinkedList ");
			getstartBtn_linkedlist.click();
			break;
		case "Stack":
			loggerLoad.info("User clicks on Stack ");
			getstartBtn_stack.click();
			break;
		case "Queue":
			loggerLoad.info("User clicks on queue ");
			getstartBtn_queue.click();
			break;
		case "Tree":
			loggerLoad.info("User clicks on tree ");
			getstartBtn_tree.click();
			break;
		case "Graph":
			loggerLoad.info("User clicks on graph ");
			getstartBtn_graph.click();
			break;
		}
			
	}

	public String alert() {

		//alertmsg = alertelement.getText();
		return alertelement.getText();
	}

	public void dropDown(String string) {
		
		dropdown.click();
		PageFactory.initElements(driver, this);	
		switch(string) {
		case "Arrays":
			loggerLoad.info("User clicks on" +string);
			arrayselement.click();
			break;
		case "Linkedlist":
			loggerLoad.info("User clicks on" +string);
			linkedlistelement.click();
			break;
		case "Stack":
			loggerLoad.info("User clicks on" +string);
			stackelement.click();
			break;
		case "Queue":
			loggerLoad.info("User clicks on" +string);
			queueelement.click();
			break;	
		case "Tree":
			loggerLoad.info("User clicks on" +string);
			treeelement.click();
			break;
		case "Graph":
			loggerLoad.info("User clicks on" +string);
			graphelement.click();
			break;
		
		}
				
	}

	public void homeSignin() {
		
		signinlink.click();
		
	}

	public void homeregister() {
		driver.navigate().back();
		registerlink.click();		
	}

	public String loginTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String registertitle() {
		String title = driver.getTitle();
		return title;
	}
	
	

}
