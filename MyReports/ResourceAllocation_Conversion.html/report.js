$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Conversion/ResourceAllocation_Con.feature");
formatter.feature({
  "name": "Conversion Resource Allocation functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Resource Allocation in Pro Acc Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to Resource Allocation page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select project,Instance from the project dropdown\u003cphase\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on Bulk Allocation to select the Role and Owner",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click on Save to assign owner for particular task",
  "keyword": "And "
});
formatter.step({
  "name": "User has successfully assigned owner to activity",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "phase"
      ]
    },
    {
      "cells": [
        "Conversion"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Resource Allocation in Pro Acc Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to Resource Allocation page",
  "keyword": "Given "
});
formatter.match({
  "location": "ResourceAllocation.user_should_be_navigate_to_Resource_Allocation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select project,Instance from the project dropdownConversion",
  "keyword": "When "
});
formatter.match({
  "location": "ResourceAllocation.user_has_to_select_project_Instance_from_the_project_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Bulk Allocation to select the Role and Owner",
  "keyword": "And "
});
formatter.match({
  "location": "ResourceAllocation.user_has_to_click_on_Bulk_Allocation_to_select_the_Role_and_Owner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Save to assign owner for particular task",
  "keyword": "And "
});
formatter.match({
  "location": "ResourceAllocation.user_has_to_click_on_Save_to_assign_owner_for_particular_task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully assigned owner to activity",
  "keyword": "Then "
});
formatter.match({
  "location": "ResourceAllocation.user_has_successfully_assigned_owner_to_activity()"
});
formatter.result({
  "status": "passed"
});
});