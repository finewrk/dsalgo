package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;
import utilities.loggerLoad;

public class G_LinkedList_SD {
	
	LinkedListPage linkedList = new LinkedListPage();
	
	@Given("User click on Get started button on Linked List module")
	public void user_click_on_get_started_button_on_linked_list_module() {
		 loggerLoad.info("User clicks on getstarted button on Linked List module");
		 linkedList.clickgetstartedBtn_LinkedList();	}

	@When("User click on Intoduction linktext")
	public void user_click_on_intoduction_linktext() {
	    loggerLoad.info("User clicks on Intoduction linktext");
	    linkedList.click_Intro_linkedList();
	}
	//tag4
	@Given("User click on Creating Linked List text")
	public void user_click_on_creating_linked_list_text() {
		 loggerLoad.info("User clicks on Creating Linked List text");
		 linkedList.click_CreatingLinked_List();
	}
	//tag6
	@Given("User click on Types of Linked List text")
	public void user_click_on_types_of_linked_list_text() {
		 loggerLoad.info("User click on Types of Linked List text");
		 linkedList.click_TypeOfLinkedList();

	}
	//tag8
	@Given("User click on Implement LinkedList in python text")
	public void user_click_on_implement_linked_list_in_python_text() {
	   	 loggerLoad.info("User click on Implement LinkedList in python text");
		 linkedList.click_ImplementLinkedList();
	}
	//tag10
	@Given("User click on Travesal text")
	public void user_click_on_travesal_text() {
		loggerLoad.info("User click on Implement Travesal text");
		linkedList.click_travesal();
	}
	//tag12
	@Given("User click on Insertion text")
	public void user_click_on_insertion_text() {	    
		loggerLoad.info("User click on Implement Insertion text");
		linkedList.click_Insertion();
	}
	//tag14
	@Given("User click on Deletion text")
	public void user_click_on_deletion_text() {
		loggerLoad.info("User click on Implement Deletion text");
		linkedList.click_Deletion();
	}

	//tag16
	@Given("The user is in Deletion page page")
	public void the_user_is_in_deletion_page_page() {
		loggerLoad.info("User click on Implement Deletion text");
		linkedList.click_Deletion();
	}

	@When("User click on practice questons in Deletion page")
	public void user_click_on_practice_questons_in_deletion_page() {
		loggerLoad.info("User click on practice questons in Deletion page");
		linkedList.click_practiceQuesinDele();
				 
	}

	@Then("Navigate back to Practice Questions of Linked List Page")
	public void navigate_back_to_practice_questions_of_linked_list_page() {
		loggerLoad.info("Navigate back to Practice Questions of Linked List Page");
		linkedList.navigatebacktolinkedlist();
	}

	@Then("Navigate back to Homepage")
	public void navigate_back_to_homepage() {
		loggerLoad.info("Navigate back to HomePage");
		linkedList.navigatebacktoHome();
	}

}