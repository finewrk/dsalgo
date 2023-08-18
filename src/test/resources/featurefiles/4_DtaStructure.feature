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
@4DS_DataStructure
Feature: Evaluate Data stuructures Introduction
  
  @dstruct
  Scenario Outline: User is able to navigate Data Structures Introduction
	Given User click on Get started button in data Structures module
	When User click on Time Complexity button
	And click Try here button and navigate to try edidor page
 	When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
   
   @dstruct
   Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given click Try here button and navigate to try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1|
    
    @dstruct
    Scenario: User is able to navigate to practice questions
    Given User click on practice questons
    And Navigate back to data stuctures introduction page