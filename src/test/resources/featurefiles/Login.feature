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

@DS3_login

Feature: login page 
  Scenario Outline: User on login page and login with inavalid and validinputs from Excel"<Sheetname>" and<RowNumber>

Given The user is on login page
When The user enter sheet"<Sheetname>" and <RowNumber>
Then click login button
Examples:
| Sheetname | RowNumber | 
| Sheet1    |         0 |
| Sheet1    |         1 |
| Sheet1    |         2 |
| Sheet1    |         3 |