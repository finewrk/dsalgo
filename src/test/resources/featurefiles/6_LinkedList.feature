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
@6DS_LinkedList
Feature: Evaluate Linkedlist Module
    @llist
	Scenario: User is Logged in to DSAlgo portal
	Given The user is on signIn Page of DSAlgo portal
	When user enter valid username "The_Big_Leauge" and password "User@0000"
	Then user click on login button
	
	@llist
	Scenario:  User Navigating to LinkedList Page
		Given The user is in the Home page after logged in
        When  The user selecting linkedlist item from the drop down menu
        Then  The user should be directed to Linked List Page
        And   The user clicks on "introduction" link 
        When  The user clicks "Try Here" button in the "introduction" page
	    Then  The user should be redirected to a page having an tryEditor with a Run button to test	
	    And   user will navigate back and returns to tryEditor to give invalid python code
	    Then  user will get alert message and accept it
	
	@llist
	Scenario Outline: user navigating to Introduction of LinkedlistPage and using Data from Excel to evaluate
    Given The user is in a try here page having  tryEditor with a Run button to test
    And   user clicks on tryHere button
    When  The user Enter valid python code in tryEditor from sheet "<sheetname>" and <rowno>
    And   user click on Run button
    Then  The user should be presented with the Run output

  Examples:
|sheetname |rowno |
|Sheet1    |0     |

  @llist
	Scenario Outline: user navigating to Introduction of LinkedlistPage and using Data from Excel to evaluate
    Given The user is in a try here page having  tryEditor with a Run button to test
    And   user clicks on tryHere button
    When  The user Enter invalid python code in tryEditor from sheet "<sheetname>" and <rowno>
    And   user click on Run button
    Then  The user should get Alert message

  Examples:
|sheetname |rowno |
|Sheet1    |1     |

  @llist
   Scenario Outline: User navigating to Creating a Linked list page
   Given The user is in Linked List page 
   When  The user clicks the "Creating" a Linked List button
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter valid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should be presented with the Run output 
   
   Examples:
|sheetname |rowno |
|Sheet1    |0     |

   @llist
   Scenario Outline: User navigating to Creating a Linked list page
   Given The user is in Linked List page 
   When  The user clicks the "Creating" a Linked List button
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter invalid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should get Alert message 
   
   Examples:
|sheetname |rowno |
|Sheet1    |1     |
	
   @llist
   Scenario Outline: User navigating to Types of Linked list page
   Given The user is in Linked List page 
   When  The user clicks the "Types of" Linked List hyperlink
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter valid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should be presented with the Run output 
   
   Examples:
|sheetname |rowno |
|Sheet1    |0     |

   @llist
   Scenario Outline: User navigating to Types of Linked list page
   Given The user is in Linked List page 
   When  The user clicks the "Types of" Linked List hyperlink
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter invalid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should get Alert message
   
   Examples:
|sheetname |rowno |
|Sheet1    |1     |

   @llist
   Scenario Outline: User navigating to Implement Linked list page
   Given The user is in Linked List page 
   When  The user clicks the "Implement Linked list" link
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter valid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should be presented with the Run output 
   
   Examples:
|sheetname |rowno |
|Sheet1    |0     |

   @llist
   Scenario Outline: User navigating to Implement Linked list page
   Given The user is in Linked List page 
   When  The user clicks the "Implement Linked List" link
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter invalid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should get Alert message
   
   Examples:
|sheetname |rowno |
|Sheet1    |1     |

@llist
   Scenario Outline: User navigating to Traversal of Linked list page
   Given The user is in Linked List page 
   When  The user clicks "Traversal Linked list" link
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter valid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should be presented with the Run output 
   
   Examples:
|sheetname |rowno |
|Sheet1    |0     |

   @llist
   Scenario Outline: User navigating to Traversal of Linked list page
   Given The user is in Linked List page 
   When  The user clicks "Traversal Linked list" link
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter invalid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should get Alert message
   
   Examples:
|sheetname |rowno |
|Sheet1    |1     |

@llist
   Scenario Outline: User navigating to Insertion of Linked list page
   Given The user is in Linked List page 
   When  The user clicks on "the Insertion Linked list link"
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter valid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should be presented with the Run output 
   
   Examples:
|sheetname |rowno |
|Sheet1    |0     |

   @llist
   Scenario Outline: User navigating to Insertion of Linked list page
   Given The user is in Linked List page 
   When  The user clicks on "the Insertion Linked List link"
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter invalid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should get Alert message
   
   Examples:
|sheetname |rowno |
|Sheet1    |1     |

@llist
   Scenario Outline: User navigating to Deletion of Linked list page
   Given The user is in Linked List page 
   When  The user clicks the "Deletion" link of "Linked list"
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter valid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should be presented with the Run output 
   
   Examples:
|sheetname |rowno |
|Sheet1    |0     |

   @llist
   Scenario Outline: User navigating to Deletion of Linked list page
   Given The user is in Linked List page 
   When  The user clicks the "Deletion" link of "Linked List"
   Then  The user should be redirected to tryEditor page with a Run button to test
   And   The user Enter invalid python code in tryEditor from sheet "<sheetname>" and <rowno>
   And   user click on Run button	
   Then  The user should get Alert message
   
   Examples:
|sheetname |rowno |
|Sheet1    |1     |

   @llist
   Scenario: User validating Practice Questions Page
   Given  The user is in Linked List page
   When   The user clicks on to the "parctice questions" link
   Then   The user should be directed to Practice Questions of Linked List Page