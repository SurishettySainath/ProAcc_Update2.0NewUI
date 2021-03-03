$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Admin/UserSettings/User.feature");
formatter.feature({
  "name": "User functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Creation in Pro Acc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to Create User page",
  "keyword": "Given "
});
formatter.match({
  "location": "Users.user_should_be_navigate_to_Create_User_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Add User button",
  "keyword": "When "
});
formatter.match({
  "location": "Users.user_has_to_click_on_Add_User_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields such as name,loginid,password,email,usertype",
  "keyword": "And "
});
formatter.match({
  "location": "Users.user_has_to_fill_the_fields_such_as_name_loginid_password_email_usertype()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on save button for creating new user",
  "keyword": "And "
});
formatter.match({
  "location": "Users.user_has_to_click_on_save_button_for_creating_new_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can verify the created user in the search list",
  "keyword": "Then "
});
formatter.match({
  "location": "Users.user_can_verify_the_created_user_in_the_search_list()"
});
formatter.result({
  "status": "passed"
});
});