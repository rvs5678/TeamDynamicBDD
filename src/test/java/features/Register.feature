
Feature: Register Functionality
	New user should be able to register
  
  Scenario: Check if new user can Register
    Given user is in homepage of application
    And user clicks on the Profile button
    When user is navigated to Profile page
    And user provides email, username & password
    When user clicks on Register
    Then user should be able to register successfully