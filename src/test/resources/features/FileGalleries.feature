@SmokeTest @Regression
Feature: List Galleries

Background:
Given I login to TikiWiki
When I go to List Galleries

Scenario:  Search Files
And I search for "bug tracking icon"
Then verify link is found

Scenario: Sort Files
And I sort by Created/Uploaled
Then I verify it is sorted from latest date to oldest
And I sort by Created/Uploaded 
Then I verify it is sorted from oldest to latest date
And User is logged out from App