Feature: Assessed Batch successful

  Background: 
    Given the user is on the assess batch page

  Scenario Outline: 
    When the user clicks on the year drop down menu
    And the user clicks on "<value>"
    Then the drop down menu's value changes to "<value>"

    Examples: 
      | value |
      |  2016 |
      |  2017 |
      |  2019 |
