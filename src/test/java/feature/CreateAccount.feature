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
@tag
Feature: Checking functionality of Create Account page

  @tag1
  Scenario: Create Account with valid data
    Given User must be on url "https://www.amazon.ca/signup"
    When Enter valid name
    And Enter valid email or mobile
    And Enter valid password
    And Enter same password again
    And Click on verify email or mobile
    Then User must be navigated to verification window
    @tag2
    Scenario: Create Account by leaving name empty
    Given User must be on url "https://www.amazon.ca/signup"
    When Name field is left empty
    And Enter valid email or mobile
    And Enter valid password
    And Enter same password again
    And Click on verify email or mobile
    Then User must be navigated to verification window
    @tag3
    Scenario: Create Account with invalid email or mobile
    Given User must be on url "https://www.amazon.ca/signup"
    When Enter valid name
    And Enter invalid email or mobile
    And Enter valid password
    And Enter same password again
    And Click on verify email or mobile
    Then User must be navigated to verification window
    @tag4
    Scenario: Create Account with invalid password
    Given User must be on url "https://www.amazon.ca/signup"
    When Enter valid name
    And Enter valid email or mobile
    And Enter invalid password
    And Enter same password again
    And Click on verify email or mobile
    Then User must be navigated to verification window
    @tag5
    Scenario: Create Account by entering wrong password in password again
    Given User must be on url "https://www.amazon.ca/signup"
    When Enter valid name
    And Enter valid email or mobile
    And Enter invalid password
    And Enter wrong password again
    And Click on verify email or mobile
    Then User must be navigated to verification window
    
    
    
    
   
  