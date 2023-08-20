package pageObjects;

import org.openqa.selenium.support.PageFactory;

import utilities.configFileReader;
import utilities.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GraphPage {
	public static WebDriver driver = driverFactory.getdriver();

	String QueueURL = configFileReader.getqueueurl();
	@FindBy(xpath = "//a[@href='graph']")WebElement getstarted_graph;
	@FindBy(linkText="Graph")WebElement Graph;
	@FindBy(linkText="Graph Representations")WebElement GraphReprsenation;
	@FindBy(linkText="Practice Questions")WebElement graphpractice;
	@FindBy(linkText="Sign out")WebElement sigoutbtn;
	
	public GraphPage() {
		PageFactory.initElements(driver, this);	
	}
	public void click_getStarted_graph() {
		getstarted_graph.click();
		
	}
	public void click_graph() {
		
		Graph.click();
	}
	public void click_GraphReprsenation() {
		driver.navigate().back();
		GraphReprsenation.click();
	}
	public void click_graphpractice() {
		
		driver.navigate().back();
		graphpractice.click();
	}
	public void navigateGraphRep() {
		driver.navigate().to(QueueURL);
		
	}
	public void navigateToHome() {
		driver.navigate().back();
		
	}
	public void click_signoutOnHome() {
		sigoutbtn.click();
		
	}

}
