#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																					    		Reviewed By:
# Date   :   30/10/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Create Customer functionality
# Feature Description: Creating Customer over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Customer functionality in ProAcc

  @SmokeTest
  Scenario: Customer Creation in Pro Acc Application
    Given User should be navigate to customer page
    When User has to click on Add Customer button
    And User has to fill the fields like Industrysector,ContactName,emailid,phone
    And User has to click on save button for creating customer
    Then User can verify the created customer in the search list
