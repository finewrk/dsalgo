package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.configFileReader;
import utilities.driverFactory;

public class TreePage {
	public static WebDriver driver = driverFactory.getdriver();
	String treeURL = configFileReader.getTreeURL();
	@FindBy(xpath = "//a[@href='tree']")WebElement getstarted_Tree;
	@FindBy(linkText="Overview of Trees")WebElement OverviewofTrees;
	@FindBy(linkText="Terminologies")WebElement Terminologies;
	@FindBy(linkText="Types of Trees")WebElement TypesofTrees;
	@FindBy(linkText="Tree Traversals")WebElement TreeTraversals;
	@FindBy(linkText="Traversals-Illustration")WebElement TraversalsIllustration;
	@FindBy(linkText="Binary Trees")WebElement BinaryTrees;
	@FindBy(linkText="Types of Binary Trees")WebElement TypesofBinaryTrees;
	@FindBy(linkText="Implementation in Python")WebElement ImplementationinPython;
	@FindBy(linkText="Binary Tree Traversals")WebElement BinaryTreeTraversal;
	@FindBy(linkText="Implementation of Binary Trees")WebElement ImplementationOfBinaryTrees;
	@FindBy(linkText="Applications of Binary trees")WebElement ApplicationsOfBinaryTrees;
	@FindBy(linkText="Binary Search Trees")WebElement BinarySearchTrees;
	@FindBy(linkText="Implementation Of BST")WebElement ImplementationOfBST;
	@FindBy(linkText="Practice Questions")WebElement treepractice;
	public TreePage() {
		PageFactory.initElements(driver, this);	
	}
	public void click_getstartedTree() {
		getstarted_Tree.click();
	}
	public void click_OverviewofTree() {
		OverviewofTrees.click();
		
	}
	public void click_Terminologies() {
		driver.navigate().back();
		Terminologies.click();
	}
	public void click_TypeOfTrees() {
		driver.navigate().back();
		TypesofTrees.click();	
	}
	public void click_TreeTraversals() {
		driver.navigate().back();
		TreeTraversals.click();
	}
	public void click_TravelIllustrations() {
		driver.navigate().back();
		TraversalsIllustration.click();
	}
	public void click_BinaryTree() {
		driver.navigate().back();
		BinaryTrees.click();
	}
	public void click_TypeOfBinaryTrees() {
		driver.navigate().back();
		TypesofBinaryTrees.click();
	}
	public void click_ImplementationInPython() {
		driver.navigate().back();
		ImplementationinPython.click();
	}
	public void click_BinaryTreeTraversal() {
		driver.navigate().back();
		BinaryTreeTraversal.click();
	}
	public void click_ImplementationOfBinaryTrees() {
	
		driver.navigate().back();
		ImplementationOfBinaryTrees.click();
	}
	public void click_ApplicationsOfBinaryTrees() {
		driver.navigate().back();
		ApplicationsOfBinaryTrees.click();
	}
	public void click_BinarySearchTrees() {
		driver.navigate().back();
		BinarySearchTrees.click();
	}
	public void click_ImplementationOfBst() {
		driver.navigate().back();
		ImplementationOfBST.click();
	}
	public void click_treepractice() {
		
		driver.navigate().back();
		treepractice.click();
	}
	public void navigateImplementationOfBst() {
	 
		driver.navigate().back();
		
	}
	

}
