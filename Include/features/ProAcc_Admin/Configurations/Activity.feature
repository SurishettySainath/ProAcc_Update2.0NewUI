#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																					    		Reviewed By:
# Date   :   30/10/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Activity Creation functionality
# Feature Description: Creating activities over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Activity Creation functionality

  @SmokeTest
  Scenario: Activity Creation in Pro Acc Application
    Given User should be navigate to Activity page
    When User has to click on Add Activity button   
    And User has to fill the fields like Task,ApplicationArea,Phase,Role,BuildingBlock,Est Hrs
    And User has to click on save button for creating new activity
    Then User can verify the created activity in the search list

   