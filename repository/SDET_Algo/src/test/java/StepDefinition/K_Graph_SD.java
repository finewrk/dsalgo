package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import utilities.loggerLoad;

public class K_Graph_SD {
	
	GraphPage graph = new GraphPage();
//tag1	
	@Given("User click on Get started button on Graph module")
	public void user_click_on_get_started_button_on_graph_module() {
	   loggerLoad.info("User click on Get started button in Graph module");
	   graph.click_getStarted_graph();
	}

	@When("User click on Graph button")
	public void user_click_on_graph_button() {
		loggerLoad.info("User click on Graph button");
		graph.click_graph();
	    
	}
//tag3
@Given("User click on Graph Representations text")
public void user_click_on_graph_representations_text() {
	loggerLoad.info("User click on Graph Representations text");
	graph.click_GraphReprsenation();
}
//tag4
@Given("The user is in Graph Representations page")
public void the_user_is_in_graph_representations_page() {
	loggerLoad.info("The user is in Graph Representations page");
	graph.click_GraphReprsenation();
	}

@When("User click on practice questons in Graph Representations page")
public void user_click_on_practice_questons_in_graph_representations_page() {
   loggerLoad.info("User click on practice questons in Graph Representations page");
   graph.click_graphpractice();
}

@Then("Navigate back to Graph Representations page")
public void navigate_back_to_graph_representations_page() {
    graph.navigateGraphRep();
}
//tag6
@Given("The user is on Homepage")
public void the_user_is_on_homepage() {
  loggerLoad.info("The user is on Homepage");
  graph.navigateToHome();
}

@When("The user clicks on sign out button")
public void the_user_clicks_on_sign_out_button() {
   loggerLoad.info("The user clicks on sign out button");
   graph.click_signoutOnHome();
   
}

@Then("user able to sigout and navigate to home page")
public void user_able_to_sigout_and_navigate_to_home_page() {
	loggerLoad.info("The user is on Homepage after sign out");
}



}
