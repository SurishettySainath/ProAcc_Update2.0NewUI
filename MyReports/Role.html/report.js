$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Admin/Configurations/Role.feature");
formatter.feature({
  "name": "Role functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Role Creation in Pro Acc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to Roles page",
  "keyword": "Given "
});
formatter.match({
  "location": "Role.user_should_be_navigate_to_Roles_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Add new Role button",
  "keyword": "When "
});
formatter.match({
  "location": "Role.user_has_to_click_on_Add_new_Role_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Rolename,Description",
  "keyword": "And "
});
formatter.match({
  "location": "Role.User_has_to_fill_the_fields_like_Rolename_Description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on save button for creating new role",
  "keyword": "And "
});
formatter.match({
  "location": "Role.user_has_to_click_on_save_button_for_creating_new_role()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can verify the created role in the search list",
  "keyword": "Then "
});
formatter.match({
  "location": "Role.user_can_verify_the_created_role_in_the_search_list()"
});
formatter.result({
  "status": "passed"
});
});