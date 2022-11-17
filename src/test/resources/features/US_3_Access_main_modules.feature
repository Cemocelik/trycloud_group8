Feature: As a user, I should be accessing all the main modules of the app.

  @us3
  Scenario: Verify users accessing all the main modules of the app.
    Given user on the login page
    #When  user use username "<username>" and passcode "<password>"
    When the users log in with valid credentials
    Then Verify the user see the following modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |

#instead of Talk - shows spreed