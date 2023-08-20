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
@3
Feature: Register page Validation
  I want to use this template for my feature file

  @tag1
  Scenario: The user is presented with error message for empty fields below Username textbox
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error message "Please fill out this field." below Username textbox
    
  @tag2
   Scenario: The user is presented with error message for empty fields below Password textbox
    Given The user opens Register Page
    When The user clicks "Register" button after entering username with other fields empty
      | username       |
      | Numpy@sdet84_1 |
    Then It should display an error message "Please fill out this field." below Password textbox
    
   @tag3
   Scenario: The user is presented with error message for empty fields below confirm Password textbox
    Given The user opens Register Page
    When The user clicks "Register" button after entering "username" and "password" with Password Confirmation field empty
      | username       | password     |
      | Numpy@sdet84_1 | testpassword |
    Then It should display an error message "Please fill out this field." below Password Confirmation textbox
  
  @tag4
    Scenario: The user is presented with error message for invalid username
    Given The user opens Register Page
    When The user enters a "username" with characters other than Letters, digits and "@/./+/-/_"
      | username | password     | password confirmation |
      | &**&**&  | testpassword | testpassword          |
    Then It should display an error message "Please enter a valid username"
  @tag5
   Scenario: The user is presented with error message for password mismatch
    Given The user opens Register Page
    When The user clicks "Register" button after entering valid "username" and different passwords in "password" and "password confirmation" fields
      | username       | password     | password confirmation |
      | Numpy@sdet84_1 | testpassword | testpassword1         |
    Then It should display an error message "password_mismatch:The two password fields didn’t match."
   
   @tag6
   Scenario: The user is presented with error message for password with characters less than 8
    Given The user opens Register Page
    When The user enters a valid "username" and "password" with characters less than 8
      | username       | password | password confirmation |
      | Numpy@sdet84_1 | a1b2c3d  | a1b2c3d               |
    Then It should display an error message "Password should contain at least 8 characters"
    
   @tag7
   Scenario: The user is presented with error message for password with only numbers
    Given The user opens Register Page
    When The user enters a valid "username" and "password" with only numbers
      | username       | password | password confirmation |
      | Numpy@sdet84_1 | 12345678 |              12345678 |
    Then It should display an error message "Password can’t be entirely numeric."
    
   @tag8
  Scenario: The user is presented with error message for password too similar to your other personal information
    Given The user opens Register Page
    When The user enters a valid "username" and "password" similar to username
      | username       | password   | password confirmation |
      | Numpy@sdet84_1 | testsdet84 | testsdet84            |
    Then It should display an error message "password can’t be too similar to your other personal information."
   
   @tag9
   Scenario: The user is presented with error message for commonly used password
    Given The user opens Register Page
    When The user enters a valid "username" and commonly used password "password"
      | username       | password | password confirmation |
      | Numpy@sdet84_1 | Welcome1 | Welcome1              |
    Then It should display an error message "Password can’t be commonly used password"
   
   @tag10
    Scenario: The user is presented with error message for existing username
    Given The user opens Register Page
    When The user enters a valid existing "username" with "password" and "password confirmation"
      | username       | password  | password confirmation |
      | Numpy@sdet84_1 | RT56YUabc | RT56YUabc             |
    Then It should display an error message "Username already exists"
    @tag11
     Scenario: The user redirected to Homepage with valid details
    Given The user opens Register Page
    When The user enters a valid "username" and "password" and "password confirmation"
      | username       | password  | password confirmation |
      | Nump@sdet1031  | siseli11  | siseli11         |
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"
    
    #@tag12
    #Scenario Outline: User on signin page and login with valid credentials and verify sign out option
    #Given The user is on signin page
    #When The user enter valid "<username>" and "<password>"
    #Then click login button to verify
#
    #Examples: 
      #| username      | password  |
      #| Nump@sdet1012 | siseli11 |
    
   @tag13
	Scenario:  The user is able to signout from the registered page
    Given The user is in the Sign in page
    When The user clicks the "Sign Out" link
    Then The user should be redirected to the homepage with the message "Logged out successfully"