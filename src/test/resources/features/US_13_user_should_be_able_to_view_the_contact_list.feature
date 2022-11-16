@us13
Feature: As a user, I should be able to view the contact list
  User Story 13: As a user, I should be able to view the contact list

  Background:(Pre-condition: there should be at least 2 contact names are displayed
  On the contact list so that view list function can be tested)


  Scenario Outline: verify users can see all the contact names on the contact list
    Given user use username "<username>" and passcode "<password>"
    Given user on the dashboard page
    When the user clicks the contacts module
    Then verify the contact names are in the list
    Examples:
      | username    | password    |
      | user8       | Userpass123 |
      | user38      | Userpass123 |
      | user68      | Userpass123 |
      | user98      | Userpass123 |
