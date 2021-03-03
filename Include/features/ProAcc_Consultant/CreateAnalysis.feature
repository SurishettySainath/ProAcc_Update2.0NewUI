#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Kamal
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Crate analysis
# Feature Description: To add the details for creat analysis
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Create Analysis functionality in ProAcc

 
  @SmokeTest
  Scenario: Create Analysis in ProAcc Application
    Given User has to navigate to create analysis page
    When User has to select Customer Name, Project Name and Instance Name from the dropdown List
    And User has to upload SAP READINESS CHECK FILES for Activities, BWExtractors, CustomCode, HANADatabase, FioriApps, RelevantSimplification, SAPReadiness
    And User has to click on the term of use and acknowldge checkboxes
    And User has to click on start analysis button
    Then User should successfully navigate to readinesscheck
