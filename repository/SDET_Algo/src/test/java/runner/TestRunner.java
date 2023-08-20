package runner;

import org.testng.annotations.DataProvider;

//import com.beust.jcommander.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty","html:target/dsAlgoReport.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, // reporting purpose
monochrome = false, // console output
tags = "", // tags from feature file
features = { "src/test/resources/features" }, // location of feature files
glue = { "StepDefinition", "Hooks" }) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {
	//@Parameters({"browser","url"})
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
	
		return super.scenarios();
		}

}

