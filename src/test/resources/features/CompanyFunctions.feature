@m
Feature: Company Functionality
  Background:
    Given user log in with HR credentials

  Scenario: Displaying News Window
    When the user navigates to "Company" tab "Official Information" module
    And the user clicks on News button
    Then the user should display News window

  Scenario: Displaying Add News Window
    When the user navigates to "Company" tab "Official Information" module
    And the user clicks on Add News button
    Then the user should display Add News window

  Scenario: Displaying Official Information Window
    When the user navigates to "Company" tab "Official Information" module
    Then the user should display Official Information window

  Scenario: Displaying Our Life Window
    When the user navigates to "Company" tab "Our Life" module
    Then the user should display Our Life window

  Scenario: Displaying About Company Window
    When the user navigates to "Company" tab "About Company" module
    Then the user should display About Company window

  Scenario: Displaying Album and Photos Page
    When the user navigates to "Company" tab "Photo Gallery" module
    Then the user should display Photo Gallery Page

  Scenario: Displaying Video Player Window
    When the user navigates to "Company" tab "Video" module
    Then the user should display Video Player window

  Scenario: Displaying news under Business News(RSS) menu
    When the user navigates to "Company" tab "Business News (RSS)" module
    Then the user should display news under Business News(RSS) menu