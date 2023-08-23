package hooks;


//Block of code that run before or after each scenario .Hooks allows us to better manage the code workflow and helps us to reduce the code redundancy.


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.DriverFactory;
//import utilities.LoggerLoad;
public class AddHooks  {
		@Before 
		
	    public static void setUp() throws Throwable  {
			
			
			DriverFactory.getDriver();
			DriverFactory.setUpDriver();
			ConfigReader.loadConfig();
	     
	    
	    }

	    @After
	    public static void tearDown(Scenario scenario) {
	 
	        if(scenario.isFailed()) {
//	            final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
//	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
	         
	    //    DriverFactory.tearDown();
	}
	}


