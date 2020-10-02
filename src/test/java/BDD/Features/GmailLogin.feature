Feature: Gmail Login page

  Scenario: Validate gmail logion page when user and password both are valid

    Given User is in gmail login page
    When Enters valid user in their field
    And Click next button
    And Enters valid password in password field
    And Click on next button to login
    Then Verify user is on email profile page