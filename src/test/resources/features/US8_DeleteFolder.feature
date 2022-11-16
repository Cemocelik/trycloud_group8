Feature: As a user, I should be able to delete a file/folder.
@wip
  Scenario Outline: Verify users delete a file/folder
    Given user enter username "<username>" and passcode "<password>"
    When user on the dashboard page
    Then hen the user clicks the "Files" module
    And user click action-icon  from any file on the page
    And user choose the "Delete f" option
    When the user clicks the "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page.
    Examples:
      | username | password    |
      | user8    | Userpass123 |
      | user38   | Userpass123 |
      | user68   | Userpass123 |
      | user98   | Userpass123 |