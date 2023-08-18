package utilities;



import java.util.List;
import java.util.Map;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.cucumber.messages.types.Duration;

public class ElementsUtils {
	public static WebDriver driver = DriverFactory.getDriver();
	String excelfilepath = ConfigReader.getexcelfilepath();
	String code;
	String result;
	Actions action = new Actions(driver);
	
	//get python code from excel sheet
		public String getCodeFromExcel(String sheetName, Integer rowNumber) throws Exception {
			Loggers.info("User Enter the sheet details");
			ExcelReader reader = new ExcelReader();
			Loggers.info("Excel File Path in SD : " + excelfilepath);
			List<Map<String,String>> testData = reader.getData(excelfilepath, sheetName);
			 code = testData.get(rowNumber).get("pythoncode");
			 Loggers.info("User enters the Python Code from the excel sheet as " + code + " and the result be " +result );
			return code;
			
		}
		//enter the python code using actions(typing it on the screen)
		public void enterCode(String code, WebElement tryEditor) {
			//action.sendKeys(tryEditor,code).perform();
			action.sendKeys(tryEditor).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();
			action.sendKeys(tryEditor,code).perform();
		}
		
		//get the result from the excel sheet
		public String getResultfromExcel(String sheetName, int rowNumber) throws Exception {
			ExcelReader reader = new ExcelReader();
			List<Map<String, String>> testdata = reader.getData(excelfilepath, sheetName);
			result = testdata.get(rowNumber).get("result");
			Loggers.info("Expected result from Excel sheetname " + sheetName + " and " + rowNumber + " : " +result);
			return result;
		}
		public void WaitForElement(WebElement output) {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(output));


}
}