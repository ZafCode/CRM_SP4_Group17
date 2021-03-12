@wip
Feature:
  Background:
    Given   user log in with HR credentials
    Given user is on the filter and search field

    #Scenario:Verify that, user can select the date
      #When user choice "Current day" from Date dropdown
      #Then "Current day" should be displayed on Date dropdown area

    #Scenario:Verify that, user can select one or more type
      #When user choice "Announcements" from Type
      #Then "Announcements" should be displayed on Type area

    Scenario: Verify that, user can search by Author
      When user search by Author "hr3@cybertekschool.com"
      Then user should be displayed "hr3@cybertekschool.com" related content

    Scenario: Verify that, user can search by To
      When user search by To "All employees"
      Then user should be displayed to "All employees" related content

    Scenario: Verify that, user can add field
      When select "Tag" on the Add field area
      Then user should be displayed "Tag" box on the Filter and Search area

    Scenario: Verify that, user can search by Filter MY ACTIVITY
      When select MY ACTIVITY on the Filter and Search area
      Then user should be displayed MY ACTIVITY related content

    Scenario: Verify that, user can save a filter
      Given user should click on Save Filter button
      When user puts into filter name box a "New Filter"
      Then user should be able to save the new filter