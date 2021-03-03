#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sanjay Ghaligi                                                Reviewed By:
# Date : 24/02/2021                                                       Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name:Audit Report Generation
# Feature Description: Generating Audit Reports in PM Login
#------------------------------------------------------------------------------------
Feature: Audit report Functionality in ProAcc

  @SmokeTest
  Scenario: Generating Audit Report in ProAcc Application
    Given User should navigate to Audit Report page
    When  User should select start Date and End Date fields
    And  User has to Click on search Button 
    Then User can view the Audit report file summary and actions

    