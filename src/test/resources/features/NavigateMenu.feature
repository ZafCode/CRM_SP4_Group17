1. User can send a message.
2. User can send a file.
3. User can create an event.
4. User can create a poll.
5 User can create a task.
6. User can send an appreciation.
7. User can create an announcement.
8. User can see workflow options.

https://qa.crmly.net/




Feature: As a user, I should be able to use quick navigate menu.(SP4)

  Scenario: Verify that user is able to send a message.
    Then the user clicks on the "MESSAGE" tab
    And the user enters valid data about the message
    And the user clicks the send button
    Then the sent message should appear in the Activity Stream page

  Scenario:Verify that user is able to send a file.
    Then the user clicks on the "MORE" tab
    And the user clicks "File" pop-up item
    And the user enters valid data about the file
    And the user clicks the send button
    Then the sent file should appear in the Activity Stream page

  Scenario: Verify that user is able to create an event.
    Then the user clicks on the "EVENT" tab
    And the user enters valid data about the event
    And the user clicks the send button
    Then the created event should appear in the Activity Stream page

  Scenario:Verify that user is able to create a poll.
    Then the user clicks on the "POLL" tab
    And the user enters valid data about the poll
    And the user clicks the send button
    Then the created poll should appear in the Activity Stream page

  Scenario:Verify that user is able to create a task.
    Then the user clicks on the "TASK" tab
    And the user enters valid data about the task
    And the user clicks the send button
    Then the created task should appear in the Activity Stream page

  Scenario:Verify that user is able to create an appreciation.
    Then the user clicks on the "MORE" tab
    And the user clicks "Appreciation" pop-up item
    And the user enters valid data about the appreciation
    And the user clicks the send button
    Then the created appreciation should appear in the Activity Stream page

  Scenario:Verify that user is able to create an announcement.
    Then the user clicks on the "MORE" tab
    And the user clicks "Announcement" pop-up item
    And the user enters valid data about the announcement
    And the user clicks the send button
    Then the created announcement should appear in the Activity Stream page

  Scenario:Verify that user is able to see workflow options.
    Then the user clicks on the "MORE" tab
    And the user clicks "Workflow" pop-up item
    Then the workflow options should appear in the page
