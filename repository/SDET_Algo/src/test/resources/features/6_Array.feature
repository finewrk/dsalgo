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
@6
Feature: Evaluate arrays module
  I want to use this template for my feature file

  @tag1
  Scenario: Evaluate Array Module
    Given User is on Home page 
    When User clicks on array module
    Then User Navigated to Arrays Page

  @tag2
Scenario: Evaluate Arrays in Python link
    Given User is on Arrays Page
    When User clicks on array in Python link
    Then User Navigated to Arrays in Python Page

  @tag3
Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Try here button on Arrays in Python page and navigate to try editor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
     Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         2|
@tag4
  Scenario Outline: User is able to navigate to tryeditor page and run invalid  python code
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         3| 
  
  @tag5
  Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Arrays Using List topic  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         4|
  
  @tag6
   Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given User click on Arrays Using List topic 
    And click Try here button and navigate to try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         5|
    
   @tag7
   Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on basic Operations in Lists 
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         6|
    
    @tag8
     Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given User click on basic Operations in Lists 
   And click Try here button and navigate to try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         7|
    
    @tag9
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Applications of Array 
   And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result 
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         8|
    
    @tag10
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given User click on Applications of Array 
    And click Try here button and navigate to try edidor page 
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         9|
    
  @tag11
   Scenario Outline: User is able to navigate to tryeditor page and run valid python code
   Given User click on Practies Questions
   When User click on Question1 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |        10|
   @tag12 
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
   #Given User click on Practies Questions
   When User click on Question1 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |        11|
    
   @tag13
   Scenario Outline: User is able to navigate to tryeditor page and submit valid python code
   #Given User click on Practies Questions
   When User click on Question1 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on submit button
   Then The user should be presented with successful submission message

    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |        12|
    
    @tag14
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
  # Given User click on Practies Questions
   When User click on Question2 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
    
    @tag15
     Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
  # Given User click on Practies Questions
   When User click on Question2 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag16
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
  # Given User click on Practies Questions
   When User click on Question3 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
   
   @tag17
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
  # Given User click on Practies Questions
   When User click on Question3 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
    @tag18
    Scenario Outline: User is able to navigate to tryeditor page and run valid python code
  # Given User click on Practies Questions
   When User click on Question4 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0| 
    
    @tag19
     Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
  # Given User click on Practies Questions
   When User click on Question4 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should get alert message
   Then Navigate back to Home page
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|