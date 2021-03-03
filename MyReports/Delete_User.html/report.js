$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Deletion/User_Delete.feature");
formatter.feature({
  "name": "User deletion functionality for ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User deletion in ProAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Userlist page",
  "keyword": "Given "
});
formatter.match({
  "location": "User_Delete.user_should_navigate_to_Userlist_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter username in search box",
  "keyword": "When "
});
formatter.match({
  "location": "User_Delete.user_has_to_enter_username_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button",
  "keyword": "And "
});
formatter.match({
  "location": "User_Delete.user_has_to_click_on_delete_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted particular user",
  "keyword": "Then "
});
formatter.match({
  "location": "User_Delete.user_has_successfully_deleted_particular_user()"
});
formatter.result({
  "status": "passed"
});
});