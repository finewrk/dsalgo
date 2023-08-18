package stepdefinition;

 
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.DataStructurePage;

public class DtaStructure_SD {
	
	WebDriver driver = DriverFactory.getDriver();
	DataStructurePage dspage =new DataStructurePage(driver);
	
	@Given("User click on Get started button in data Structures module")
	public void user_click_on_get_started_button_in_data_structures_module()  {
		//try {
			//Thread.sleep(2000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
		dspage.clickGetStarted();
	}

	@When("User click on Time Complexity button")
	public void user_click_on_time_complexity_button()  {
		//try {
			//Thread.sleep(2000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		dspage.selectTimecomplexity();
	}

	@Given("User click on practice questons")
	public void user_click_on_practice_questons() {
		dspage.practicequestions();
	}

	@Given("Navigate back to data stuctures introduction page")
	public void navigate_back_to_data_stuctures_introduction_page() {
		driver.navigate().back();
	}

}


