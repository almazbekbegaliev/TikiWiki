
Feature: Articles Home Page Functionalities
  User Should be able to see articles,
  Edit, Print and Remove an article.
  

  Background: Logged In To the Tiki Wiki
    Given User is logged into Tiki Wiki
@AJ
  Scenario: Articles in Articles Home
    And User opens Articles home
    Then User should be able to see articles
     And User is logged out from App
@AJ
  Scenario: Removing an Article
    And User opens Articles Home
    Then User removes article "aaa"
    And Removed article shouldn't be on the list of Articles
     And User is logged out from App

  Scenario Outline: Editing an Aritcle
    And User opens Articles Home Page
    Then User Should be able to edit any article "<title>" "<heading>" "<body>"
    And User is logged out from App

    Examples: 
      | title                 | heading      | body                                 |
      | Life is Beautiful     | and Colorful | You just have to enoy it             |
      | Be at the right place | right time   | and Everything is gonna be all right |
      |                       | No title     |                                      |
