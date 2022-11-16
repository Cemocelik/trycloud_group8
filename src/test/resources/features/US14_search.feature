Feature:  As a user, I should be able to search any item/ users from the homepage.

@us14
  Scenario: Verify users can search any files/folder/users from the search box.
    Given user on the dashboard page
    When the user clicks the magnifier icon on the right top
    And users search any existing file_folder_user name
    Then verify the app displays the expected result option
