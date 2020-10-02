Feature: User Details API

  Scenario: User Details API for ALL user

    Given An API to handle user details for given user
    When User Requests for id 1 in the payload
    Then Verify the success Message as 200 on http response
    Then Verify the FirstName is "George"