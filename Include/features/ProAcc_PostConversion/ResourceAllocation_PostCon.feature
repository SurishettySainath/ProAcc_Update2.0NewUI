#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																					    		Reviewed By:
# Date   :   03/02/2021                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Post ConversionResource Allocation functionality
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Post Conversion Resource Allocation functionality
      
   @SmokeTest
  Scenario Outline: Resource Allocation in Pro Acc Application
    Given User should be navigate to Resource Allocation page
    When User has to select project,Instance from the project dropdown<Phase>
    And User has to click on Bulk Allocation to select the Role and Owner
    And User has to click on Save to assign owner for particular task
    Then User has successfully assigned owner to activity
    
    Examples: 
      | Phase      |
      | Post Conversion |
