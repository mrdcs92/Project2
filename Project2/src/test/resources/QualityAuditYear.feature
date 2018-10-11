@QualityAuditYear
Feature: Quality Audit - Year Dropdown

  Background: 
    Given The user is on the Quality Audit Page

  Scenario Outline: User changes the year
    When The user clicks the Year tab
    And The user clicks on a "<year>"
    Then The tag should change to "<year>"

    Examples: 
      | year |
      | 2017 |
      | 2018 |
      | 2019 |
