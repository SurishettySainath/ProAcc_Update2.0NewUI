#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath Surishetty						  																					    		Reviewed By:
# Date   :   11/11/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name:Resource Allocation functionality
# Feature Description: Resource Allocation over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Resource Allocation functionality

  @SmokeTest
  Scenario Outline: Resource Allocation in Pro Acc Application
    Given User should be navigate to Resource Allocation page
    When User has to select project,Instance from the project dropdown<Phase>
    And User has to click on Bulk Allocation to select the Role and Owner
    And User has to click on Save to assign owner for particular task
    Then User has successfully assigned owner to activity
    
    Examples: 
      | phase      |
      | Assessment |
