@CRM-201
Feature:
  Background:
    Given   user log in with HR credentials


  @CRM-198
  Scenario Outline: Verify that User should be able to use Tasks functions on Activity Stream.

    When    the user navigates to "<TabType>" tab "<ModuleType>" module
    Then    page title contains "<Title>" or search filter contains "<SearchFilterName>"

    Examples:

      |TabType    |ModuleType |Title      |SearchFilterName   |
      |Tasks      |All        |My tasks   |In progress        |
      |Tasks      |Ongoing    |My tasks   |Role: Ongoing      |
      |Tasks      |Assisting  |My tasks   |Role: Assisting    |
      |Tasks      |Set by me  |My tasks   |Role: Set by me    |
      |Tasks      |Following  |My tasks   |Role: Following    |
      |Tasks      |Projects   |Projects   |In progress        |
      |Tasks      |Efficiency |Efficiency |Current month      |
      |Tasks      |Recycle Bin|Recycle Bin|Deleted this month |


  @CRM-200
  Scenario: Verify that User is able to see New task window

    When    the user navigates to "Tasks" tab "All" module
    And     the user clicks on New Task button
    Then    the url contains edit