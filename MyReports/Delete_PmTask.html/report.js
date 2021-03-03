$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Deletion/PmTask_Delete.feature");
formatter.feature({
  "name": "PmTask deletion functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "PmTask deletion in ProAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to PmTask Creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "Pmtask_Delete.user_should_navigate_to_PmTask_Creation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter PmTaskname in search box",
  "keyword": "When "
});
formatter.match({
  "location": "Pmtask_Delete.user_has_to_enter_PmTaskname_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button for PmTask",
  "keyword": "And "
});
formatter.match({
  "location": "Pmtask_Delete.user_has_to_click_on_delete_button_for_PmTask()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted PmTask",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});