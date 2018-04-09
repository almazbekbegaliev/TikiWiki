
Feature: Creating New Article using Excel File
  User should be able to Create new Article

  Background: Logged In To the Tiki Wiki
    Given User is logged into Tiki Wiki
    And User Goes to New Article page
@new
  Scenario: Create New Article: Content
    When User creates a new article by content "./src/test/resources/testData/articles.xlsx" "Sheet1"
    Then Article should be displayed on the list
    And User is logged out from App

  Scenario Outline: Create New Article: Classification
    When User creates a new article "<title>" "<topic>" "<type>" "<category>" "<tags>"
    Then Article should be displayed on the list
    And User is logged out from App

    Examples: 
      | title       | topic    | type       | category | tags      |
      | Orange      | The Best | Event      | Week 2     | @hi       |
      | Rock'N Roll | The Best | Classified | Week 1     | @cybertek |
      | Hey         | None     | Article    | Week 3     | @noTage   |
