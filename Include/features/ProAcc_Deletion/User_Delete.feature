#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: User deletion
# Feature Description: To add delete Users in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: User deletion functionality for ProAcc

  @SmokeTest
  Scenario: User deletion in ProAcc Application
    Given User should navigate to Userlist page
    When User has to enter username in search box
    And User has to click on delete button
    Then User has successfully deleted particular user

   