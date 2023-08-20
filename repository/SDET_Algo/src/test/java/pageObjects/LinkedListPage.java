package pageObjects;

import org.openqa.selenium.support.PageFactory;

import utilities.configFileReader;
import utilities.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedListPage {
	
	public static WebDriver driver = driverFactory.getdriver();
	String LinkesListURL = configFileReader.getLinkedListURL();
	String HomeURL = configFileReader.getHomePage();
	@FindBy(xpath = "//a[@href='linked-list']")WebElement getstarted_LinkedList;
	@FindBy(linkText="Introduction")WebElement linkIntro;
	@FindBy(linkText="Creating Linked LIst")WebElement creatingLinkedList;
	@FindBy(linkText="Types of Linked List")WebElement TypesOfLinkedlist;
	@FindBy(linkText="Implement Linked List in Python")WebElement ImplementLinkedlist;
	@FindBy(linkText="Traversal")WebElement Traversal;
	@FindBy(linkText="Insertion")WebElement Insertion;
	@FindBy(linkText="Deletion")WebElement Deletion;
	@FindBy(linkText="Practice Questions")WebElement practiceQuestioninDeletion;
	public LinkedListPage() {
		PageFactory.initElements(driver, this);	
	}

	public void clickgetstartedBtn_LinkedList() {
		
		getstarted_LinkedList.click();
	}

	public void click_Intro_linkedList() {
		
		linkIntro.click();
	}

	public void click_CreatingLinked_List() {
		driver.navigate().back();
		creatingLinkedList.click();
	}

	public void click_TypeOfLinkedList() {
		driver.navigate().back();
		TypesOfLinkedlist.click();
		
	}

	public void click_ImplementLinkedList() {
		driver.navigate().back();
		ImplementLinkedlist.click();
	}

	public void click_travesal() {
		driver.navigate().back();
		Traversal.click();
	}

	public void click_Insertion() {
		driver.navigate().back();
		Insertion.click();	
	}

	public void click_Deletion() {
		driver.navigate().back();
		Deletion.click();			
	}

	public void click_practiceQuesinDele() {
		
		driver.navigate().back();
		practiceQuestioninDeletion.click();
	}

	public void navigatebacktolinkedlist() {
		driver.navigate().to(LinkesListURL);
		
	}

	public void navigatebacktoHome() {
	
		driver.navigate().to(HomeURL);
		
	}
	

}
