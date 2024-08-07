Feature: Test User SignUp Module

  @signup
  Scenario: validate user signup with valid details

    Given the user is in amazon user signUp page
    When the user enter valid name
    And the user enter valid email
    And the user enter valid password
    And the user re enter valid password
    And the user click continue button
    Then the user should navigated to next page
