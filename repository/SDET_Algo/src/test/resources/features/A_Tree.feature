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
@11
Feature: Evaluate Tree module
  I want to use this template for my feature file

 @tag1
 Scenario Outline: User is able to navigate Tree 
		Given User click on Get started button on Tree module
		When User click on Overview of Trees button
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
    
 @tag3
 Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Terminologies text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
	@tag4
	Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
  @tag5
  Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Type of Trees text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
    @tag6
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag7
   Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Tree Traversals text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
     @tag8
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
     
     @tag9
   Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Traversal Illustration text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
    @tag10
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag11
   Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Binary Trees text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
    @tag12
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag13
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Type of Binary Trees text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
    @tag14
     Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag15
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Implementation in Python text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
    @tag16
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag17
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Binary Tree Traversals text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
    @tag18
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag19
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Implementation of Binary Trees text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0| 
    
    @tag20
     Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag21
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Applications of Binary trees text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
    @tag22
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag23
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Binary Search trees text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
    @tag24
     Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag25
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Implementation Of BST text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|  
    
    @tag26
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag27
      Scenario: User validating Practice Questions Page and navigate back to home page
   Given  The user is in Implementation of BST page
   When  User click on practice questons in Implementation of BST
   Then  Navigate back to Implementation of BST page
   Then  Navigate back to Homepage 
    