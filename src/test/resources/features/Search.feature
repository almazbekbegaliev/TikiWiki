@SmokeTest @Regression
Feature: Search functionality
@JJ
Scenario Outline: Search for pages
	Given User is logged into Tiki Wiki
	When User searches for "<pages>"
	Then pages which contains searched page should come up "<pages>"
	And User is logged out from App
	
	Examples:
	|pages|
	|Wiki|
	|Typing Dead|
	