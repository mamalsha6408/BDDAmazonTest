Feature: Test User SignIn module

  @signin
  Scenario: validate SignIn functionality with valid credentials
    Given user in amazon sign in page
    And user enter valid email
    When user click button continue
    And user enter password
    When user click button signIn
    Then user navigated to home page

#  Scenario: Validate SignIn functionality with invalid credentials
#
#  Scenario: Validate SignIn functionality with valid username and empty password
#
#  Scenario: Validate SignIn functionality with empty username and valid password
#
#  Scenario: Validate SignIn functionality with empty credentials