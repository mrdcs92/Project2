Feature: Assessed Batch successful

  Background: 
    Given the user is on the assess batch page

  Scenario Outline: 
    When the user clicks on the year drop down menu
    And the user clicks on "<value>"
    Then the drop down menu's value changes to "<value>"

    Examples: 
      | value |
      |  2019 |
      |  2018 |
      |  2017 |
      |  2016 |

  Scenario: 
    When the user clicks on the trainor drop down menu
    And the user clicks on any trainor
    Then displayed trainor changes
