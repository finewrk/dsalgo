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
@5DS_Array
Feature:Feature: Evaluate arrays module

    @arry
    Scenario: The user is able to navigate to a page having Arrays in Python Topic 
    Given User click on get started button on array module and navigate to array page
    When User click on Arrays in Python Topic and navigate to arrays in python page
   
    @arry
    Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Try here button on Arrays in Python page and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    
   
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
   
    @arry
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given User click on Try here button on Arrays in Python page and navigate to try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1| 
 @arry
    Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Arrays Using List topic  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
    
    @arry
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given User click on Arrays Using List topic 
    And click Try here button and navigate to try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1|
    
     @arry
    Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on basic Operations in Lists 
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
  
   @arry
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given User click on basic Operations in Lists 
   And click Try here button and navigate to try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1|
  
    
     @arry
    Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Applications of Array 
   And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result 
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
    
     @arry
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given User click on Applications of Array 
    And click Try here button and navigate to try edidor page 
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1|
   
   @arry
   Scenario Outline: User is able to navigate to tryeditor page and run valid python code
   Given User click on Practies Questions
   When User click on Question1 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
    
    @arry
   Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
   #Given User click on Practies Questions
   When User click on Question1 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1|
    
    @arry
     Scenario Outline: User is able to navigate to tryeditor page and run valid python code
  # Given User click on Practies Questions
   When User click on Question2 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
    
    @arry
      Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
  # Given User click on Practies Questions
   When User click on Question2 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1|
    
    @arry
    
      Scenario Outline: User is able to navigate to tryeditor page and run valid python code
  # Given User click on Practies Questions
   When User click on Question3 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
   
    @arry
    
       Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
  # Given User click on Practies Questions
   When User click on Question3 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1|
    
    @arry
    Scenario Outline: User is able to navigate to tryeditor page and run valid python code
  # Given User click on Practies Questions
   When User click on Question4 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         0|
    
    
    @arry
    Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
  # Given User click on Practies Questions
   When User click on Question4 its navigate to tryeditor page
   And User clear the tryeditor textbox
   When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And User click on run button
   Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet1    |         1|