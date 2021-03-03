#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																					    		Reviewed By:
# Date   :   30/10/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Create User functionality
# Feature Description: Creating User over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: User functionality in ProAcc

  @SmokeTest
  Scenario: User Creation in Pro Acc Application
    Given User should be navigate to Create User page
    When User has to click on Add User button   
    And User has to fill the fields such as name,loginid,password,email,usertype
    And User has to click on save button for creating new user
    Then User can verify the created user in the search list

   