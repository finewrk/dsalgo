package utilities;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public static WebDriver getChromeDriver() {
		
		//System.setProperty("webdriver.chrome.driver", "");
		
		ChromeOptions chromeOptions = new ChromeOptions();

		// This will make Selenium WebDriver to wait for the entire page is loaded.
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		//This capability checks whether an expired (or) invalid TLS Certificate is used while navigating during a session
		chromeOptions.setAcceptInsecureCerts(true);
		
		//Specifies when to interrupt an executing script in a current browsing context. The default timeout 30,000 ms
		chromeOptions.setScriptTimeout(Duration.ofSeconds(30));
		
		//Specifies the time interval in which web page needs to be loaded in a current browsing context. The default timeout 300,000 ms
		chromeOptions.setPageLoadTimeout(Duration.ofMillis(30000));
		
		//This specifies the time to wait for the implicit element location strategy when locating elements. The default timeout 0 ms
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(10));
	
		//Adding chrome extensions with webdriver
		//chromeOptions.addExtensions(new File("/path/to/extension.crx"));
		
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--incognito");
		chromeOptions.addArguments("--headless"); //invisble mode of execution
		//more capabilities at https://sites.google.com/a/chromium.org/chromedriver/capabilities
		
		//WebDriver driver = new ChromeDriver(chromeOptions);
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		return driver;
		
	}
	
	public static WebDriver getEdgedriver() {
		
		return driver;
	}
	
	public static void main(String[] args) {
		
		DriverFactory.getChromeDriver();
	}

}
