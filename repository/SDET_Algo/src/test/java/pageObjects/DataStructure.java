package pageObjects;

//import java.time.Duration;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ElementsUtils;
import utilities.configFileReader;
import utilities.driverFactory;
import org.openqa.selenium.interactions.Actions;

public class DataStructure {
	public static WebDriver driver = driverFactory.getdriver();
	String DsIntroPage = configFileReader.DataStructuresIntroduction();
	String TimeComplexityPage =configFileReader.TimeComplexity();
	String tryEditorPage = configFileReader.tryEditorURL();
	String HomeURL = configFileReader.getHomePage();
	ElementsUtils elementUtil = new ElementsUtils();
	Actions action = new Actions(driver);
	//@FindBy(xpath="//a[text()='Get Started']")WebElement getstarted;
	@FindBy(xpath = "//a[@href='data-structures-introduction']")WebElement getstarted;
	@FindBy(xpath = "//a[text()='Time Complexity']")WebElement TimeComlexity;
	//@FindBy(xpath = "//a[text()='Try here>>>']")WebElement TryhereBtn;
	@FindBy(xpath="//a[@href ='/tryEditor']")WebElement TryhereBtn;
	@FindBy(xpath ="//button[text()='Run']")WebElement runBtn;
	//@FindBy(xpath ="//form[@id='answer_form']/div/div/div/textarea ")WebElement tryEditor;
	@FindBy(xpath="//pre [@ class = ' CodeMirror-line ']")WebElement tryEditor;
	@FindBy(xpath = "//pre[@id='output']")WebElement outputText;
	@FindBy(xpath = "//*[@id=\"content\"]/a") WebElement practiesQuestions;
	boolean isRequired = false;

	public DataStructure() {
		PageFactory.initElements(driver, this);	
	}

	public void clickgetstartedBtn() {
		getstarted.click();
		//driver.get(DsIntroPage);		
	}

	public void selectTimecomplexity() {
		
		TimeComlexity.click();
		//driver.navigate().to(TimeComplexityPage);
		
	}

	public void clicktryhereBtn() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		TryhereBtn.click();	
		//driver.navigate().to(tryEditorPage);
	}

	//enter the python code using the getCodeFromExcel method from ElementsUtils
	public void enterPythonCode(String sheetName, Integer rowNumber) throws Exception {	
		
		String code = elementUtil.getCodeFromExcel(sheetName, rowNumber);
		elementUtil.enterCode(code, tryEditor);
				}
    public void clear() {
				
    	tryEditor.clear();
	}

	
//	public String runOutput() {
//		
//		String output = outputText.getText();
//		System.out.println("output");
//		return output;
//	}

	public void clickRunBtn() {
		
		runBtn.click();		
	}
	public String getExpectedResult(String sheetName, Integer rowNumber) throws Exception {
		 String expectedResult = elementUtil.getResultfromExcel(sheetName, rowNumber);
		 return expectedResult;
		
	}
	public String getActualResult() {
		elementUtil.WaitForElement(outputText);
		return outputText.getText();
	}
	public String getAlertErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
	}

	public void practicequestions() {
		driver.navigate().back();
		practiesQuestions.click();
	}

	public void navigatebackToHome() {
		
		driver.navigate().to(HomeURL);
	}

	public void tryeditorPage() {
		
		driver.navigate().to(tryEditorPage);
		
	}

}
