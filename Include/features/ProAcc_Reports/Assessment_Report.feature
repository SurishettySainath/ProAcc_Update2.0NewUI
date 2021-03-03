#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sanjay Ghaligi                                                Reviewed By:
# Date : 24/02/2021                                                       Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name:Assessment Report Generation
# Feature Description: Generating Assessment Reports in PM Login
#------------------------------------------------------------------------------------
Feature: Assessment report Functionality in ProAcc

  @SmokeTest
  Scenario: Generating Assessment Report in ProAcc Application
    Given User should navigate to Reports page
    When  User should select the project,instance from the respective dropdown list
    Then  User should be able to see Comprehensive Assesssment and Readiness check Report, Landscape and System Management, Custom Code Analysis and License Optimization Reports

    