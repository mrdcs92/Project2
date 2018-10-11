@PanelSearchBar
Feature: Panel - Search Bar

  Scenario Outline: 
    Given The user is on the Panel page
    When The user clicks on the Search Bar
    And Types in a value "<value>"
    And Hits the Enter button
    Then The search will execute

    Examples: 
      | value     |
      | test      |