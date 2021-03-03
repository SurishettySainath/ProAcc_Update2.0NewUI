$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Deletion/Instance_Delete.feature");
formatter.feature({
  "name": "Instance deletion functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Instance deletion in ProAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Instance Creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "Instance_Delete.user_should_navigate_to_Instance_Creation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter Instancename in search box",
  "keyword": "When "
});
formatter.match({
  "location": "Instance_Delete.user_has_to_enter_Instancename_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button for Insatnce",
  "keyword": "And "
});
formatter.match({
  "location": "Instance_Delete.user_has_to_click_on_delete_button_for_Insatnce()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted Instance",
  "keyword": "Then "
});
formatter.match({
  "location": "Instance_Delete.user_has_successfully_deleted_Instance()"
});
formatter.result({
  "status": "passed"
});
});