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

@DS2_register

Feature: feature to test new user Registration
 Scenario Outline: user navigate to registration page 
  Given user click registration link   
  When user enter username,password,confirm password from given "<sheetname>" and <rowno> 
  Then user click register button with expected message
         
  Examples:
|sheetname |rowno |
|Sheet1    |0     |
|Sheet1    |1     |
|Sheet1    |2     |
|Sheet1    |3     |
|Sheet1    |4     |
|Sheet1    |5     |
|Sheet1    |6     |
|Sheet1    |7     |
|Sheet1    |8     |
|Sheet1    |9     |
|Sheet1    |10    |