package testrunner;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/featurefiles"},
		glue ={"stepdefinition","hooks"},
        monochrome=true,//console output
        	/*	plugin = { "pretty", "html:target/CucumberReport/dsAlgoReport.html",
        				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",}*/
        plugin= {"pretty","html:target/cucumber.html", 
//		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		}
         ,tags="@1DS_launch or "
        		+ "@2DS_register or "
       		    + "@3DS_login   or "
       		    + "@4DS_DataStructure  or "  
       		    + "@5DS_Array or " 
        		+ "@6DS_LinkedList  or " 
      		    + "@7DS_Stack   or " 
       		    + "@8DS_Queue  or " 
     		    + "@9DS_Tree ") //or " 
         	 //   + "@99DS_graph") 
         		
        

public class TestRunner {
}


