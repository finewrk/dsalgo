package Hooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.driverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.configFileReader;
import utilities.loggerLoad;

public class Hooks {
	private static WebDriver driver;
	private static driverFactory driverfactory;
	static Scenario scenario;
	
	@BeforeAll
	public static void before() throws Throwable {
		//Get browser Type from config file
		loggerLoad.info("Loading Config file");
		configFileReader.readConfig();
		String browser = configFileReader.getBrowserType();
		
		//Initialize driver from driver factory
		driverfactory = new driverFactory();
		driver = driverfactory.initializeDrivers(browser);
		loggerLoad.info("Initializing driver for : "+browser);
		driver.get(configFileReader.getUrl());
	}

	@Before
	public void scenario(Scenario scenario) {
		loggerLoad.info("===============================================================================================");
		loggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
		loggerLoad.info("-----------------------------------------------------------------------------------------------");
		
	}
	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			loggerLoad.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("Myscreenshot",
					new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		
		}

}
}

