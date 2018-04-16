Feature: Trackers

Background:
Given I login to TikiWiki
When I go to List Trackers

Scenario:  Search Files
And I search for "asdasd"
Then verify link is found

Scenario: Sort Files
And I sort by Created
Then I verify it is sorted from latest date to oldest
And I sort by Created
Then I verify it is sorted from oldest to latest date
And User is logged out from App