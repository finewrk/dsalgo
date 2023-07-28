package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	public static WebDriver driver;
	

/**
 * @author vijayabharathi
 * @purpose : This is a method which will accept WebElement and perform click action
 * @category Unit TestCase
 * @exception Exception
 * @DateCretaed :
 * @dateModified : 
 * @param element
 * @return boolean
 */
	public static boolean webClick(WebElement element) {
		
		try {
			
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
			
			if(ele.isDisplayed()) {
				if(ele.isEnabled()) {
				
				try {
					
				//ele.click();
				
				Actions action = new Actions(driver);
				action.moveToElement(ele).perform();;
				action.click(ele).perform();
//				reporting line will go here
				
				return true;
				}
				catch(Exception e) {
					//JavascriptExecutor(driver) = 
				}
					
				}
				else {
					throw new Exception("Element is not enabled");
				}
			}
			else {
				throw new Exception("Element is not displayed");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		WebElement ele = driver.findElement(By.xpath("null"));
		ele.click();
		Utilities.webClick(ele);
	}
}












