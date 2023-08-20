package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;
import utilities.configFileReader;
import utilities.driverFactory;
import utilities.ElementsUtils;

public class ArrayPage {

	public static WebDriver driver = driverFactory.getdriver();
	String HomeURL = configFileReader.getHomePage();
	String ArrayURL = configFileReader.getArrayURL();
	String ArraysUsingListURL = configFileReader.getArraysUsingListURL();
	String BasicOperationsURL = configFileReader.getBasicOperationsURL();
	String ApplicationofArray = configFileReader.getApplicationofArray();
	String practiceQuesURL = configFileReader.getpracticeQuesURL();
	String naviQuestionOneURL = configFileReader.getnaviQuestionOneURL();
	ElementsUtils elementUtil = new ElementsUtils();
	//String ArrayTryEditorURL = configFileReader.
	String ArrayinpythonURL = configFileReader.getArrayInPythonURL();
	@FindBy(xpath = "//a[@href='array']")WebElement getstarted_array;
	@FindBy (xpath="//a[@href='arrays-in-python']")WebElement arraysInPythonLink;
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement TryHereLink;
	@FindBy(linkText="Arrays Using List")WebElement Arraysusinglist;
	@FindBy(linkText="Basic Operations in Lists")WebElement BasicInList;
	@FindBy(linkText="Applications of Array")WebElement AppOfArray;
	@FindBy(linkText="Practice Questions")WebElement PracticeQues;
	@FindBy(linkText="Search the array")WebElement searchTheArray;
	@FindBy(xpath = "//form[@id='answer_form']/div//div[6]//span//span")WebElement txtclr;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement textbox;
	@FindBy (xpath="//input[@type ='submit']")WebElement submitButton;
	@FindBy(xpath = "//pre[@id='output']")WebElement outputText;
	@FindBy(linkText="Max Consecutive Ones")WebElement Question2;
	@FindBy(linkText="Find Numbers with Even Number of Digits")WebElement Question3;
	@FindBy(linkText="Squares of a Sorted Array")WebElement Question4;
	public ArrayPage() {
		PageFactory.initElements(driver, this);	
	}
	public void homeurl() {
		
		driver.get(HomeURL);	
	}
	public void clickgetstartedBtn_Array() {
		getstarted_array.click();
	}
	public void getArrayPage() {
		driver.navigate().to(ArrayURL);
	}
	public void click_ArraysInPython() {
		arraysInPythonLink.click();
		
	}
	public void arraysInPython_Url() {
		driver.navigate().to(ArrayinpythonURL);	
	}
	public void click_tryhereBtn() {
		
		TryHereLink.click();	
		//driver.navigate().to(ArrayTryEditorURL);	
		
	}
	public void click_ArraysUsingList() {
		driver.navigate().back();
		//elementUtil.WaitForElement(Arraysusinglist);
		Arraysusinglist.click();
		//driver.navigate().to(ArraysUsingListURL);
		//driver.
		
	}
	public void click_BasicOperations() {
		driver.navigate().back();
		//elementUtil.WaitForElement(BasicInList);
		BasicInList.click();
		//driver.navigate().to(BasicOperationsURL);
	}
	public void click_ApplicationofArray() {
		driver.navigate().back();
		AppOfArray.click();
		//driver.navigate().to(ApplicationofArray);
	}
	public void click_practiceQues() {
		driver.navigate().back();
		PracticeQues.click();
	}
	public void navigatePracticeQueURL() {
		driver.navigate().to(practiceQuesURL);
		
	}
	public void click_searchTheArray() {
		searchTheArray.click();
		
	}
	public void naviQuestionOne() {
		
		driver.navigate().to(naviQuestionOneURL);
		
	}
	
	public void txteditorclr() {
		String s = Keys.chord(Keys.CONTROL, "a");

		textbox.sendKeys(s);
		textbox.sendKeys(Keys.DELETE);
		
	}
	public void click_submitBtn() {
		
		submitButton.click();
		
	}
	
	public String getActualResult() {
		elementUtil.WaitForElement(outputText);
		return outputText.getText();
	}
	public void click_Question2() {
		driver.navigate().back();
		Question2.click();
	}
	public void click_Question3() {
		driver.navigate().back();
		Question3.click();
	}
	public void click_Question4() {
		
		driver.navigate().back();
		Question4.click();
		
	}
	
}
