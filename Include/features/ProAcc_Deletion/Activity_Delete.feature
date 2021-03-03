#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Activity deletion
# Feature Description: To add delete Activitys in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Activity deletion functionality in ProAcc

  @SmokeTest
  Scenario: Activity deletion in ProAcc Application
    Given User should navigate to Activity Creation page
    When User has to enter Activityname in search box
    And User has to click on delete button for Activity
    Then User has successfully deleted Activity

   