$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Reports/Audit_Report.feature");
formatter.feature({
  "name": "Audit report Functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Generating Audit Report in ProAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Audit Report page",
  "keyword": "Given "
});
formatter.match({
  "location": "Audit_Report.user_should_navigate_to_Audit_Report_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke method createNode() on null object\r\n\tat org.codehaus.groovy.runtime.NullObject.invokeMethod(NullObject.java:91)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.call(PogoMetaClassSite.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.NullCallSite.call(NullCallSite.java:34)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:136)\r\n\tat proacc_reports.Audit_Report.user_should_navigate_to_Audit_Report_page(Audit_Report.groovy:107)\r\n\tat ✽.User should navigate to Audit Report page(Include/features/ProAcc_Reports/Audit_Report.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should select start Date and End Date fields",
  "keyword": "When "
});
formatter.match({
  "location": "Audit_Report.user_should_select_start_Date_and_End_Date_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to Click on search Button",
  "keyword": "And "
});
formatter.match({
  "location": "Audit_Report.user_has_to_Click_on_search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view the Audit report file summary and actions",
  "keyword": "Then "
});
formatter.match({
  "location": "Audit_Report.user_can_view_the_Audit_report_file_summary_and_actions()"
});
formatter.result({
  "status": "skipped"
});
});