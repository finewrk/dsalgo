package testrunner;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/featurefiles"},
		glue ={"stepdefinition","hooks"},
        monochrome=true,//console output
        
        plugin= {"pretty","html:target/cucumber.html", 
//		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		}
         ,tags="@DS1_launch or @DS2_register or @DS3_login")
        

public class TestRunner {
}


