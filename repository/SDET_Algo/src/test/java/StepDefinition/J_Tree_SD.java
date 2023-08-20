package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.loggerLoad;
import pageObjects.TreePage;

public class J_Tree_SD {
	TreePage tree = new TreePage();
	@Given("User click on Get started button on Tree module")
	public void user_click_on_get_started_button_on_tree_module() {
		loggerLoad.info("User clicks on getstarted button on Tree module");
		tree.click_getstartedTree();
	}

	@When("User click on Overview of Trees button")
	public void user_click_on_overview_of_trees_button() {
		loggerLoad.info("User clicks on Overview of Trees button");
		tree.click_OverviewofTree();
	}
	//tag3
	@Given("User click on Terminologies text")
	public void user_click_on_terminologies_text() {
	   
		loggerLoad.info("User click on Terminologies text");
		tree.click_Terminologies();
	}
	//tag5
	@Given("User click on Type of Trees text")
	public void user_click_on_type_of_trees_text() {
		loggerLoad.info("User click on Type of Trees text");
		tree.click_TypeOfTrees();
	}
	//tag7
	@Given("User click on Tree Traversals text")
	public void user_click_on_tree_traversals_text() {
		loggerLoad.info("User click on Tree Traversals text");
		tree.click_TreeTraversals();
	}
	
	//tag9
	@Given("User click on Traversal Illustration text")
	public void user_click_on_traversal_illustration_text() {
		loggerLoad.info("User click on Traversal Illustration text");
		tree.click_TravelIllustrations();
	}
	
	//@tag11
	@Given("User click on Binary Trees text")
	public void user_click_on_binary_trees_text() {
		loggerLoad.info("User click on Binary Trees text");
		tree.click_BinaryTree();
	}
	//tag13
	@Given("User click on Type of Binary Trees text")
	public void user_click_on_type_of_binary_trees_text() {
		loggerLoad.info("User click on Type of Binary Trees text");
		tree.click_TypeOfBinaryTrees();
	}
	
	//tag15
	@Given("User click on Implementation in Python text")
	public void user_click_on_implementation_in_python_text() {
		loggerLoad.info("User click on Implementation in Python text");
		tree.click_ImplementationInPython();
	}
	//tag17
	@Given("User click on Binary Tree Traversals text")
	public void user_click_on_binary_tree_traversals_text() {
		loggerLoad.info("User click on Binary Tree Traversals text");
		tree.click_BinaryTreeTraversal();
	}

	//tag19
	@Given("User click on Implementation of Binary Trees text")
	public void user_click_on_implementation_of_binary_trees_text() {
		loggerLoad.info("User click on Implementation of Binary Trees text");
		tree.click_ImplementationOfBinaryTrees();
	}
	//tag21
	@Given("User click on Applications of Binary trees text")
	public void user_click_on_applications_of_binary_trees_text() {
		loggerLoad.info("User click on Applications of Binary trees text");
		tree.click_ApplicationsOfBinaryTrees();
	}
	//tag23
	@Given("User click on Binary Search trees text")
	public void user_click_on_binary_search_trees_text() {
		loggerLoad.info("User click on Binary Search trees text");
		tree.click_BinarySearchTrees();
	}
	//tag25
	@Given("User click on Implementation Of BST text")
	public void user_click_on_implementation_of_bst_text() {
		loggerLoad.info("User click on Implementation Of BST text");
		tree.click_ImplementationOfBst();
	}
	//tag27
	@Given("The user is in Implementation of BST page")
	public void the_user_is_in_implementation_of_bst_page() {
		loggerLoad.info("User click on Implementation Of BST text");
		tree.click_ImplementationOfBst();
	}

	@When("User click on practice questons in Implementation of BST")
	public void user_click_on_practice_questons_in_implementation_of_bst() {
		loggerLoad.info("User click on practice questons in Implementation of BST");
		tree.click_treepractice();
	}

	@Then("Navigate back to Implementation of BST page")
	public void navigate_back_to_implementation_of_bst_page() {
		loggerLoad.info("Navigate back to Implementation of BST page");
		tree.navigateImplementationOfBst();
	}





}
