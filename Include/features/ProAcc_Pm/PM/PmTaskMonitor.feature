#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath Surishetty						  																					    		Reviewed By:
# Date   :   11/11/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name:Task Monitoring functionality
# Feature Description: Task Monitoring over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Task Monitoring functionality in ProAcc

  @SmokeTest
  Scenario: PmTaskMonitor in Pro Acc Application
    Given User should be navigate to PM Task Monitor page
    When User has to select project name from the Projects dropdown list
    And User has to click on edit button to Update the PM Task
    And User can edit Status,Planned and Actual Date fields
    Then User has successfully updated the pm task
    
