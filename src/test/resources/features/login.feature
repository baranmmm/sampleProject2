Feature: Login Feature

  @wip
  Scenario: The user should be able to login with valid credentials
    Given the user goes to examinion home page
    When the user provides correct credentials
    Then the user should be able to login to the platform
