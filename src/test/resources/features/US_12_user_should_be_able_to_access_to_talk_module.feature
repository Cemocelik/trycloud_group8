@us12 @wip
Feature: As a user, I should be able to access to Talk module

  Scenario Outline: verify user access to Talk module
    Given user use username "<username>" and passcode "<password>"
    Given user on the dashboard page
    When the user clicks the "Talk" module
    Then verify the page title is "Talk - Trycloud QA"
    Examples:
      | username    | password    |
      | user8       | Userpass123 |
      | user38      | Userpass123 |
      | user68      | Userpass123 |
      | user98      | Userpass123 |