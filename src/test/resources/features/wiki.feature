Feature: Wiki page

Scenario: Create new wiki page
Given User navigates to Create a Wiki Page
When User enters search criteria in search box
And Clicks on Create Page button
Then User should see search results

Scenario: List Wiki Pages search
Given User navigates to Create a Wiki Page
When User clicks on List Wiki Page tab
And Enters search criteria
And Chooses category from dropdown
And Enters displayed rows number
And Clicks of Find button
Then Search result should display