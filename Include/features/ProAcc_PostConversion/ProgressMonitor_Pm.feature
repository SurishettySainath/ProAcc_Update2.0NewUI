#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath Surishetty						  																					    		Reviewed By:
# Date   :   03/02/2021                                                                       Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Progress Monitor functionality
# Feature Description: Progress Monitor over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Post Conversion Progress Monitor functionality

   @SmokeTest
  Scenario Outline: Post Conversion Progress Monitoring in Pro Acc Application
    Given User should be navigate to Progress Monitor page
    When User has to select project,Instance fields from the project dropdown
    And User can Download the tasks by click on Download Icon
    And User can send mail to respective person by click on Mail Icon
    And User can add activities by click on Add Activity<Activity>
    And User has to click on edit button to Update the Status
    And User can edit Status,Planned Date,Est Hours fields
    Then User has successfully Updated the Progress Monitor Status<Activity>
    
    Examples:
                |Activity|
                |goks_Post|
    
