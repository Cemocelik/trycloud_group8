@us-4
Feature: As a user, I should be able to access to Files module.

  Background:
    Given user is on the dashboard page
    When user clicks "Files" module

  Scenario: Verify users can access to Files module
    Then verify the page title is "Files - Trycloud QA.".

  Scenario: Verify users can select all the uploaded files from the page
    And user click the top-left checkbox of the table
    Then verify all the files are selected

