@home
Feature: Calendar Feature
  Background: Logged In To the Tiki Wiki
    Given User is logged into Tiki Wiki
    
	Scenario Outline: Create an event in Calendar
	Given User navigates to Admin Calendars page
	When User creates "<name>" "<title>" "<start>" "<end>" "<description>" "<location>"
	Then "<title>" should in the calendar list

Examples:
|			name			|	title		| 			start	| 		end		| 	description		|location |
|		Rock-and-Roll		|My Company Holidays Calendar|2018-04-16|2018-04-16|	Good thing		|Chicago, IL|
|		Rock-and-Roll		|My Company Calendar|2019-04-16|2019-04-18			|	Better thing	|Mayluu-Suu|

	Scenario: Edit a Calendar
	Given User navigates to Calendar page
	When User edits calendar
	Then Edited Calendar should be in the list
	#"<name>","<Description>","<Custom location","<Custom participants>","<Custom classificatoin>","<Custom language>","<Custom URL>","<Custom subscription list>","<Custom priority>","<Personla Calendar>","<Start day>","<Start of day>","<End of day>",

	Scenario: Import Calendar
	Given User navigates to Admin Calendars page
	When User imports CSV file 
	Then Calendar should be imported

	Scenario: Search for Calendar events
	Given User navigates to Admin Calendars page
	When User searches for "My Company Holidays Calendar"
	Then "My Company Holidays Calendar" should be in the result list

	