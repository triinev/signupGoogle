Feature: Sign up for a Google account
  Scenario: Create a Google account
    Given I launch Firefox browser for Google
    When I open Google sign up page
    Then I enter user data and press next button
    And Close browser