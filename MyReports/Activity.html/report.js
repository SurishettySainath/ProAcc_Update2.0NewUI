$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Admin/Configurations/Activity.feature");
formatter.feature({
  "name": "Activity Creation functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Activity Creation in Pro Acc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to Activity page",
  "keyword": "Given "
});
formatter.match({
  "location": "Activity.user_should_be_navigate_to_Activity_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Add Activity button",
  "keyword": "When "
});
formatter.match({
  "location": "Activity.user_has_to_click_on_Add_Activity_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Task,ApplicationArea,Phase,Role,BuildingBlock,Est Hrs",
  "keyword": "And "
});
formatter.match({
  "location": "Activity.user_has_to_fill_the_fields_like_Task_ApplicationArea_Phase_Role_BuildingBlock_Est_Hrs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on save button for creating new activity",
  "keyword": "And "
});
formatter.match({
  "location": "Activity.user_has_to_click_on_save_button_for_creating_new_activity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can verify the created activity in the search list",
  "keyword": "Then "
});
formatter.match({
  "location": "Activity.user_can_verify_the_created_activity_in_the_search_list()"
});
formatter.result({
  "status": "passed"
});
});