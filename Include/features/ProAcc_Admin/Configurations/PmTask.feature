#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																					    		Reviewed By:
# Date   :   30/10/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: PM-Task functionality
# Feature Description: Creating PM-Tasks over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: PM-Task functionality in ProAcc

  @SmokeTest
  Scenario: PM-Task Creation in Pro Acc Application
    Given User should be navigate to PM-Task page
    When User has to click on Add new PM button   
    And User has to fill the fields like Task category,task name
    And User has to click on save button for creating new task
    Then User can verify the created task in the search list

 