#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																					    		Reviewed By:
# Date   :   30/10/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name:Instance functionality
# Feature Description: Creating Instance over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Instance functionality in ProAcc

  @SmokeTest
  Scenario: Create Instance in Pro Acc Application
    Given User should be navigate to Instance page
    When User has to click on Add new Instance button
    And User has to enter the fields such as Instancename,projectname,description
    And User has to click on save button for creating Instance
    Then User can verify the created Instance in the search list
