
Feature: Register Functionality
	New user should be able to register
  
  Scenario: Check if new user can Register
    Given user is on homepage
    When user clicks on Profile button
    And user is navigated to register page
    And user provides email, username & password
    When user clicks on Register
    Then user should be able to login successfully