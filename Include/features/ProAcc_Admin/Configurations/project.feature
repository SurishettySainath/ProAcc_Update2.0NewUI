#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																					    		Reviewed By:
# Date   :   30/10/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Create Project functionality
# Feature Description: Creating Project over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Project functionality in ProAcc

  @SmokeTest
  Scenario: Project Creation in Pro Acc Application
    Given User should be navigate to project page
    When User has to click on Add new Project button
    And User has to enter the fields such as projectname,projectmanager,customer,scenario,description
    And User has to click on save button for creating project
    Then User can verify the created project in the search list
