package allHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import DriverFactory.driverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Utility.LoggerLoad;
	public class Hooks {
		@Before 
		
	    public static void setUp() {
			
			driverFactory.getdriver();
			//driverFactory.setUpDriver();
	     
	    
	    }

	    @After
	    public static void tearDown(Scenario scenario) {
	 
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driverFactory.getdriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
	         
	      //  Driversetup.tearDown();
	}
	}