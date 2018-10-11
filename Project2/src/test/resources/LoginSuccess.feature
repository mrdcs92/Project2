@LoginSuccess
Feature: Login Success

  Background: 
    Given The user is on the Caliber Login Page

  Scenario Outline: User Succeeds to Log In
    Given The user types in username "<username>"
    Given The user types in password "<password>"
    When The user clicks the login button
    Then The URL of the page is "https://dev-caliber.revature.tech/caliber/#/vp/home"

    Examples: 
      | username             | password         |
      | calibot@revature.com | *6Ak4-&kXnNTfTh6 |