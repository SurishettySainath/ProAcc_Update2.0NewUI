#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sanjay Ghaligi                                                Reviewed By:
# Date : 24/02/2021                                                       Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name:Detail Report Generation
# Feature Description: Generating Detail Reports in PM Login
#------------------------------------------------------------------------------------
Feature: Detail Report functionality in ProAcc

  @SmokeTest
  Scenario:  Generating Detail Report in proAcc Application
    Given User should navigate to Detail Report page
    When  User has to select the project and instance from the respective dropdown list
    And   User has to click on download button to download the report
    Then  User has successfully downloaded the detail report

   