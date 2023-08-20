package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
//import io.cucumber.messages.types.Duration;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import utilities.configFileReader;
import utilities.driverFactory;

public class SignInPage {
	
	public static WebDriver driver = driverFactory.getdriver();
	
	String loginUrl = configFileReader.getSigninPage();
	String registerUrl = configFileReader.getRegisterPage();
	@FindBy(xpath="//*[@id='id_username']")static WebElement username;
	@FindBy(xpath="//*[@id='id_password']")static WebElement password;
	@FindBy(xpath="//input[@value='Login']")WebElement Loginbtn;
	@FindBy(xpath="//a[@href='/register']")WebElement registerbtn;
	@FindBy(xpath="//div[@role='alert']")WebElement alertmsg;
	//@FindBy(xpath="//a[@href='/logout']")WebElement sigoutbtn;
	@FindBy(linkText="Sign out")WebElement sigoutbtn;
	boolean isRequired = false;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void registerInSignIn() {
			
		registerbtn.click();
	}

	public void openRegisterurl() {
		
		driver.navigate().to(registerUrl);		
	}

	public void openLogin() {
		
		driver.navigate().to(loginUrl);
		
	}

	public String titleOfPage() {
		String title = driver.getTitle();
		return title;

	}

	public void clickloginbutton() {
		
		Loginbtn.click();
	}

	public Boolean BoolLogin(String uname, String pwd) {
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pwd);
		
		// To check empty fields , we need to check "required" field is on an attribute
		if (uname.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;",username);
			return isRequired;
		} else if (pwd.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;",password);
			return isRequired;
		}
		return isRequired;
		
	}

	public String messagewhenLogin() {
		
		//Loginbtn.click();
		String message = alertmsg.getText();
		return message;
	}

	public void signout() {
		//PageFactory.initElements(driver, this);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sigoutbtn.click();
	}

	public String alertmessage() {
		String message = alertmsg.getText();
		return message;	
		}

	

	public String actualerrormsg() {
		
    return username.getAttribute("validationMessage");
    
	}
	
}
