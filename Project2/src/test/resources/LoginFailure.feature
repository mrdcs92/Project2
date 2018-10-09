Feature: Login Failure

  Background: 
    Given The user is on the Caliber Login Page

  Scenario Outline: User Fails to Log In
    Given The user types in username "<username>"
    Given The user types in password "<password>"
    When The user clicks the login button
    Then The URL of the page is "https://dev-caliber.revature.tech/"

    Examples: 
      | username             | password         |
      |                      |                  |
      |                      | *6Ak4-&kXnNTfTh6 |
      | calibot@revature.com |                  |
      | username             | password         |
      | calibot@revature.com | password         |
      | username             | *6Ak4-&kXnNTfTh6 |
