Feature: Calendar Feature

@Calendar
Scenario: Create an event in Calendar
Given User navigates to Admin Calendars page
When User creates "My Company Holidays Calendar"
Then "My Company Holidays Calendar" should in the calendar list

Scenario: Edit a Calendar
Given User navigates to Calendar page
When User edits calendar
Then Edited Calendar should be in the list
And User is logged out from App
#"<name>","<Description>","<Custom location","<Custom participants>","<Custom classificatoin>","<Custom language>","<Custom URL>","<Custom subscription list>","<Custom priority>","<Personla Calendar>","<Start day>","<Start of day>","<End of day>",

Scenario: Import Calendar
Given User navigates to Admin Calendars page
When User imports CSV file 
Then Calendar should be imported
And User is logged out from App

Scenario: Search for Calendar events
Given User navigates to Admin Calendars page
When User searches for "My Company Holidays Calendar"
Then "My Company Holidays Calendar" should be in the result list
And User is logged out from App
