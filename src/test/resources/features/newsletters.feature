Feature: Newsletters page
  Background: Logged In To the Tiki Wiki
    Given User is logged into Tiki Wiki
@newsletter
  Scenario Outline: Create Admin newsletters
    Given User navigates to Admin newsletters
    When User creates newsletter using "<name>" "<description>" "<checkBoxes>" "<numOfDays>" "<articleTypes>"
    Then "<name>" "<articleType>" should be created

    Examples: 
      | name                | description        		| checkBoxes                               	| numOfDays 	| articleTypes |
      | Automation news        | News in the industry | Users can subsribe any email adress        |           3 | Classified     |
      | Artificial Inteligence | Progress             | Allow clipping of articles into newsletter |           1 | Article        |
      | Testers Convention     | Chicago testing fest | Do not send newletter if clip is empty     |           5 | Event          |

  Scenario: Send newsletters
    Given User navigates to send newsletters page
    When User sends newsletter using "<subject>", "<newsletter>", "<html>", "<dataTxt>", "<clip>", "<replyToEmail>", "<sendFromEmail>"
