@regression
Feature: Homepage Test
  As a User, I want to test a few functionalities on the homepage.

  Scenario: User should navigate to Electric Fleets page
    Given User is on homepage
    When User accepts cookies
    And User clicks on Electric Fleets tab from the top menu tabs
    Then User should navigate to the Electric Fleets page and verify header text successfully

  Scenario: User should navigate to Second-life batteries page
    Given User is on homepage
    When User accepts cookies
    And User clicks on Second-life batteries tab from the top menu tabs
    Then User should navigate to the Second-life batteries page and verify header text successfully