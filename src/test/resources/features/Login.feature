Feature: Log in functionality

  Scenario: Verify that user log into web page as a HR user

    Given user log in with HR credentials
    Then verify that page title is "Portal"

    Scenario Outline: Verify that user cant login with invalid credentials
      Given user log in with invalid "<username>" and "<password>" credentials
      Then verify that error text appeared
      Examples:
      |username|password|
      |abc     |abc     |
      |abc     |        |
      |        |abc     |
      |        |        |