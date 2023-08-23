#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@9DS_Tree
Feature: user navigates to  Treepage and able to try Python code both valid and invalid datas
  

  @tree1
  Scenario: user select Tree module from dropdown
    Given user able to click on dropdown for tree
    
    When user select tree option
    
    And user select tree in python

  @tree2
  Scenario Outline: user try code in tree in python after clicked Try here button for validation
   Given user click on Try Here button in tree
    When user enter valid code in tree in python from given "<sheetname>" and <rowno>
    And user click run button in tree 
    Then user should see output in tree
    
	 Examples:
   	|sheetname |rowno |
		|Sheet1    |0     |
		
  #Scenario Outline: user try code in tree in python after clicked Try here button for invalidation
   #Given user click on Try Here button in tree
    #When user enter invalid code in tree in python from given "<sheetname>" and <rowno>
   # And user click run button in tree
   # Then user should get alert in tree
    
	 
	 
		
#	#practice questions
#	@tree5
#	Scenario: user select practice questions in tree
#	Given user select practice questions in tree
#	And navigate back to login page from tree