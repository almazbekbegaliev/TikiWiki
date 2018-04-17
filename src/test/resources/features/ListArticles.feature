@SmokeTest @Regression
Feature: Actions on List Articles page
  User should be able to Search for Article,
  Select multiple aritcles and perform action on them.

  Background: Logged In To the Tiki Wiki
    Given User is logged into Tiki Wiki

  #Positive
  @automate
  Scenario Outline: Search Functionality of List Articles page
    And User opens Articles Home
    When User searchs for article "<title>"
    Then User validates search result "<searchResult>"
    And User is logged out from App

    Examples: 
      | title               | searchResult        |
      | This Day In History | This Day In History |
      | Todays News         | Todays News         |
      | Favorite Recipe     | Favorite Recipe     |

  #Negative Test
  Scenario Outline: Search Functionality of List Articles page
    And User opens Articles Home
    When User searchs for article "<title>"
    Then User validates negative search result "<searchResult>"
    And User is logged out from App

    Examples: 
      | title  | searchResult      |
      | dsggdh | No records found. |
      |    456 | No records found. |
