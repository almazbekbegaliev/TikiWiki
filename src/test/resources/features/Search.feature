Feature: Search funcionality

Scenario Outline: Search for pages
	Given User logged into Tiki Wiki
	When User searches for <"pages">
	Then pages which contains searched page should come up
	
	Examples:
	|pages|
	|Wiki|
	|RockNRoll|
	|Typing Dead|
	