Feature: Login feature

  Scenario Outline: Login with correct username and password
    Given I navigate to the login page
    And I enter "<Username>" and "<Password>"
    And I click login button
    Then I should see the user form

    Examples:
      | Username      | Password   |
      | nikhat Sabrin | 5518887558 |
      | rozy          | 34         |
      | sony          | 45         |
