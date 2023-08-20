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
@4
Feature: Validating Sign in page
  I want to use this template for my feature file

  @tag1
   Scenario: Verifying Register link
    Given The user is on signin page
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page

	@tag2
    Scenario Outline: User on login page and login with the fields empty "<username>" and "<password>"
    Given The user is on Sign in page
    When The user enter invalid "<username>" and "<password>"
    Then click login button to verify
    Examples:
      | username | password |
      |      		 |          |
      | user     |          |
      |          | passowrd |
 	
	@tag3
    Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and <RowNumber>
    Given The user is on Login page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button

    Examples: 
      |Sheetname|RowNumber|
      |Sheet1   |0        |
      |Sheet1   |1        |
      |Sheet1   |2        |
      |Sheet1   |3        |
      
	@tag4
     Scenario: Verifying signout link
    Given The user is on signin page with valid username "nump@SDET120" and password "sesili12"
    When The user click signout button
    Then The user redirected to homepage
    
  @tag5
  Scenario: Signin to Navigate through modules
  Given The user clicks sign in button
  And enter valid username "nump@SDET120" and password "sesili12"
  When The user clicks login button