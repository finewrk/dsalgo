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
@7
Feature: Evaluate Linkedlist Module
  I want to use this template for my feature file

  @tag1
 Scenario Outline: User is able to navigate Linked List
			Given User click on Get started button on Linked List module
			When User click on Intoduction linktext
			And click Try here button and navigate to try edidor page
		 	When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|

  @tag2
   Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag4 
    Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Creating Linked List text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
    
    @tag5
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag6
    Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Types of Linked List text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
    
    @tag7
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag8
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Implement LinkedList in python text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
    
    @tag9
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag10
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Travesal text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
    
    @tag11
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag12
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Insertion text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
    
    @tag13
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag14
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Deletion text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
    
    @tag15
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag16
    Scenario: User validating Practice Questions Page and navigate back to home page
   Given  The user is in Deletion page page
   When  User click on practice questons in Deletion page
   Then  Navigate back to Practice Questions of Linked List Page
   Then  Navigate back to Homepage
   
  