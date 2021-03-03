#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: PmTask deletion
# Feature Description: To add delete PmTasks in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: PmTask deletion functionality in ProAcc

  @SmokeTest
  Scenario: PmTask deletion in ProAcc Application
    Given User should navigate to PmTask Creation page
    When User has to enter PmTaskname in search box
    And User has to click on delete button for PmTask
    Then User has successfully deleted PmTask

   