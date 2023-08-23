package utilities;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	

	private static WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	static ResourceBundle rb; // for reading properties file
	static String br; //to store browser name

	private static WebDriver getchromeDriver() {
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\crimaster\\Downloads\\chromedriver-win32\\chromedriver.exe");  
			driver=new ChromeDriver();

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	public static void openPage(String url) {
		getDriver().get(url);
	}
	public static String getdriverTitle() {
		return getDriver().getTitle();
	}
	public static void NavBack() {
		getDriver().navigate().back();
	}
	public static WebDriver getDriver() {
		return driver;
		//LoggerLoad.info("enter getdriver");
		//return tlDriver.get();
	}

	public static void setUpDriver() {
		if (getDriver()== null) {
//			LoggerLoad.info("Driver is NULL");
			getchromeDriver();
		}
		}

	public static void tearDown() {
		if(getDriver()!=null) {
//			LoggerLoad.info("enter teardown");
			getDriver().close();
			getDriver().quit();
			driver=null;
		}
		driver = null;
		
	}
}
