Feature: login to autosync
  Scenario: check login functionality
    Given user is on login page of AS
    When user enters username and password of AS
    And clicks on login button of AS
    Then user is navigated to home page of AS
