Feature: Log in functionality
  Scenario: Verify that user log into web page as a HR user
    When user log in with HR credentials
    Then verify that page title is "Portal"