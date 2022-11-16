Feature: As a user, I should be able to remove files from the favorites and upload a file directly.


@smoke
  Scenario: Verify user can add the folder
    Given the user should be at the dashboard page
    When the user clicks the Files module
    And the user clicks the add icon on the top
    And user clicks New Folder
    And user writes a folder name "My Folder"
    When the user clicks the submit icon
    Then verify the folder is displayed on the page


  Scenario:  Verify users can upload a file inside a folder
    Given user on the dashboard page
    When the user clicks the Files module
    And user choose a folder from the page
    And user clicks the add icon on the top
    When the user uploads a file with the upload file option
    Then Verify the file is displayed on the page



