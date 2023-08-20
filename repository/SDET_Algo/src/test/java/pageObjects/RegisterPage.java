package pageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import utilities.configFileReader;
import utilities.driverFactory;
import utilities.loggerLoad;

public class RegisterPage {
 
	public static WebDriver driver = driverFactory.getdriver();
	String HomeUrl = configFileReader.getHomePage();
	String registerUrl = configFileReader.getRegisterPage();
	String loginUrl = configFileReader.getSigninPage();
	@FindBy(name="username") WebElement usrnametxt;
	@FindBy(name="password1") WebElement passwordtxt;	
	@FindBy(name="password2") WebElement passwordcnftxt;	
	@FindBy(xpath = "//input [@ type = 'submit']") WebElement registerbtn;	
	@FindBy(xpath="//div[@role='alert']") WebElement alertmsg;
	@FindBy(xpath = "//*[contains(text(),'Login')]") WebElement Loginbtn;
	@FindBy(linkText="Sign out")WebElement signoutBtn;
	public RegisterPage() {

		PageFactory.initElements(driver, this);
	}
	public void openRegisterurl() {
		
		driver.get(registerUrl);
	}

	public void clickRegisterBtn() {
		registerbtn.click();
		
	}
	public String getEmptyfieldErrormsgUser() {
		return usrnametxt.getAttribute("validationMessage");
	}
	public Boolean getEmptyRequiredUser() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		if (usrnametxt.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", usrnametxt);
		}
		//loggerLoad.info(isRequired);
		return isRequired;
	}
	public void validUserNameOnly(DataTable dataTable) {
		
		List<Map<String, String>> userdetails = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetails) {

			String userName = form.get("username");
			loggerLoad.info("The user enter username : " + userName);
			usrnametxt.sendKeys(userName);
		}

	}
	public Boolean getEmptyRequiredPwd() {
		boolean isRequired = false;
		
		if(passwordtxt.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", passwordtxt);
		}
		return isRequired;
	}
	public String getEmptyfieldErrormsgPwd() {
		// TODO Auto-generated method stub
		 return passwordtxt.getAttribute("validationMessage");
		// System.out.println(passwordtxt.getAttribute("validationMessage"));_
	}
	public void validPwd(DataTable dataTable) {
		// TODO Auto-generated method stub
		List<Map<String, String>> userdetails = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> form : userdetails) {
			String passWord = form.get("password");
			loggerLoad.info("The user enter password : " + passWord);
			passwordtxt.sendKeys(passWord);
			
		}	
	}
	//password confirmation
	public boolean getEmptyRequiredConfirmPwd() {
		// TODO Auto-generated method stub
		boolean isRequired = false;
		if(passwordcnftxt.getText().isBlank()) {
			JavascriptExecutor js_user =(JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", passwordcnftxt);
		}
		return isRequired;
	}
	public String getEmptyfieldErrormsgConfirmPwd() {
		// TODO Auto-generated method stub
		return passwordcnftxt.getAttribute("validationMessage");
	}
	public void validConfirmPwd(DataTable dataTable) {
		// TODO Auto-generated method stub
		List<Map<String, String>> userdetails = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> form: userdetails) {
			String confirmPassword = form.get("password confirmation");
			passwordcnftxt.sendKeys(confirmPassword);
		}
	}
	public String errormsgforInvalidusername() {
		// TODO Auto-generated method stub
		String msg = alertmsg.getText();
		return msg;
	}
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	public void openSiginurl() {
		driver.navigate().to(loginUrl);;
		PageFactory.initElements(driver, this);
	}
	public void clickLogin() {
		Loginbtn.click();
		
	}
	public void clickSignout() {
		
		signoutBtn.click();
		PageFactory.initElements(driver, this);
		driver.navigate();
	}
	public String getlogoutalertmsg() {
		String logoutalertmsg = alertmsg.getText();
		return logoutalertmsg;
	}
	
	
	
	
}
