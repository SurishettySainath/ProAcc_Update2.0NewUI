$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Deletion/Activity_Delete.feature");
formatter.feature({
  "name": "Activity deletion functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Activity deletion in ProAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Activity Creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "Activity_Delete.user_should_navigate_to_Activity_Creation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter Activityname in search box",
  "keyword": "When "
});
formatter.match({
  "location": "Activity_Delete.user_has_to_enter_Activityname_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button for Activity",
  "keyword": "And "
});
formatter.match({
  "location": "Activity_Delete.user_has_to_click_on_delete_button_for_Activity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted Activity",
  "keyword": "Then "
});
formatter.match({
  "location": "Activity_Delete.user_has_successfully_deleted_Activity()"
});
formatter.result({
  "status": "passed"
});
});