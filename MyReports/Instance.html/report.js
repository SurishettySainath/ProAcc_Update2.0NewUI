$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Admin/Configurations/Instance.feature");
formatter.feature({
  "name": "Instance functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create Instance in Pro Acc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to Instance page",
  "keyword": "Given "
});
formatter.match({
  "location": "Instance.user_should_be_navigate_to_Instance_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Add new Instance button",
  "keyword": "When "
});
formatter.match({
  "location": "Instance.user_has_to_click_on_Add_new_Instance_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the fields such as Instancename,projectname,description",
  "keyword": "And "
});
formatter.match({
  "location": "Instance.user_has_to_enter_the_fields_such_as_Instancename_projectname_description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on save button for creating Instance",
  "keyword": "And "
});
formatter.match({
  "location": "Instance.user_has_to_click_on_save_button_for_creating_Instance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can verify the created Instance in the search list",
  "keyword": "Then "
});
formatter.match({
  "location": "Instance.user_can_verify_the_created_Instance_in_the_search_list()"
});
formatter.result({
  "status": "passed"
});
});