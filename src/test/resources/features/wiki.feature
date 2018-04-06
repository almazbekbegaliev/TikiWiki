Feature: Wiki page

Scenario: Create new wiki page
Given User navigates to Create a Wiki Page
When User creates new Wiki Page
Then "Success" message should be shown
And User should be able to edit, see source, rename, see history, remove and assign permissions of new created page


Scenario: List Wiki Pages search
Given User navigates to Create a Wiki Page
When User clicks on List Wiki Page tab
And User searches for "Rock-and-Roll"
Then "Rock-and-Roll" results should display 

Scenario: Wiki page setting and features
Given User navigates to Create a Wiki Page
When User navigates to Wiki page settings and features
Then User should be able to choose basic or advanced settings
