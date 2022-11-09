@US6
Feature: As a user, I should be able to remove files from favorites and upload a file directly



  Scenario Outline: verify users to remove files to Favorites

    Given user on the dashboard page
    When  user use username "<username>" and passcode "<password>"
    When the user clicks the "Files" module
    When the users click action-icon from any file on the page to remove
    And  user choose the "Remove from favorites" option
    And user click the "Favorites" sub-module on the left side
    Then Verify that the file is removed from the Favorites sub-module’s table

    Examples:
      | username    | password    |
      | user8       | Userpass123 |
      | user38      | Userpass123 |
      | user68      | Userpass123 |
      | user98      | Userpass123 |


  Scenario Outline: verify users to upload a file from Files
    Given user on the dashboard page
    When  user use username "<username>" and passcode "<password>"
    When the user clicks the "Files" module
    When the user clicks the add icon on the top
    And users uploads file with the “upload file” option
    Then verify the file is displayed on the page

    Examples:
      | username    | password    |
      | user8       | Userpass123 |
      | user38      | Userpass123 |
      | user68      | Userpass123 |
      | user98      | Userpass123 |