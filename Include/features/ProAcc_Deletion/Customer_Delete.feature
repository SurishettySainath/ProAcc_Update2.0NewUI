#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Customer deletion
# Feature Description: To add delete Customers in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Customer deletion functionality in ProAcc

  @SmokeTest
  Scenario: Customer deletion in ProAcc Application
    Given User should navigate to Customerlist page
    When User has to enter customername in search box
    And User has to click on delete button for customer
    Then User has successfully deleted customer

    