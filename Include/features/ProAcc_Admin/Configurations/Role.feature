#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																					    		Reviewed By:
# Date   :   30/10/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Role Creation functionality
# Feature Description: Creating Roles over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Role functionality in ProAcc

  @SmokeTest
  Scenario: Role Creation in Pro Acc Application
    Given User should be navigate to Roles page
    When User has to click on Add new Role button
    And User has to fill the fields like Rolename,Description
    And User has to click on save button for creating new role
    Then User can verify the created role in the search list

   