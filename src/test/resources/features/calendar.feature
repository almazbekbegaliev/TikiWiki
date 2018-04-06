Feature: Calendar Feature

  Scenario: Edit an event in Calendar
    Given User navigates to Calendar page
    When User clicks on Edit button
    Then User should be able to edit Calendar event

  #"<name>","<Description>","<Custom location","<Custom participants>","<Custom classificatoin>","<Custom language>","<Custom URL>","<Custom subscription list>","<Custom priority>","<Personla Calendar>","<Start day>","<Start of day>","<End of day>",
  Scenario: Create an event in Calendar
    Given User navigates to Admin Calendar page
    When User clicks on Create Calendar link
    Then User should be able to create new event

  Scenario: Import Calendar
    Given User navigate to Admin Calendars page
    When User clicks on Import link
    And Attaches CVS file to import
    Then Calendar event shoul be imported

  Scenario: Search for Calendar events
    Given User navigate to Admin Calendars page
    And clicks on Calendars tab
    When Enters search criteria to search box
    And clicks Find button
    Then Results should display
