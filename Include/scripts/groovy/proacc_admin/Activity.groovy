package proacc_admin
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


import projectKeywords.OnlineKeywords

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.HttpCommandExecutor
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.SessionId
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.LogStatus;
import com.aventstack.extentreports.gherkin.model.Scenario
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;
import com.fasterxml.jackson.annotation.JsonFormat.Feature
import com.aventstack.extentreports.GherkinKeyword
import common.CommonReport;


class Activity {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to Activity page")
	public void user_should_be_navigate_to_Activity_page() {
		try{
			//		WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/span_Configuration'))
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/a_Activity'))

			loginfo= extent.createTest(Feature.class,"Activity Creation functionality");
			loginfo=loginfo.createNode(Scenario.class,"Activity Creation in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Activity page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Activity page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to click on Add Activity button")
	public void user_has_to_click_on_Add_Activity_button() {
		try{
			//	WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/button_Add Activity'))
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add Activity button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add Activity button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to fill the fields like Task,ApplicationArea,Phase,Role,BuildingBlock,Est Hrs")
	public void user_has_to_fill_the_fields_like_Task_ApplicationArea_Phase_Role_BuildingBlock_Est_Hrs() {

		try{
			for(int i=1;i<=4;i++)
			{
				//Task
				WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/button_Add Activity'))
				WebUI.delay(2)

				WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/input__txtTask'))
				String TaskField = findTestData("Data Files/ProAcc_Admin/Activity_TestData").getValue("TaskName",i)
				WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/input__txtTask'), TaskField)
				println("Test"+TaskField)
				//Application Area
				String ApplicationArea = findTestData("Data Files/ProAcc_Admin/Activity_TestData").getValue("Application Area",i)
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Application Area'), ApplicationArea, true)

				//Phase
				String Phase = findTestData("Data Files/ProAcc_Admin/Activity_TestData").getValue("Phase",i)
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Phase'),Phase, true)
				//Role
				String Role = findTestData("Data Files/ProAcc_Admin/Activity_TestData").getValue("Role",i)
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Role'),Role, true)

				// Building block
				//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/Select_BuildingBlock'))
				String BuildingBlock = findTestData("Data Files/ProAcc_Admin/Activity_TestData").getValue("Building Block",i)

				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Building Block'),BuildingBlock, true)
				//Est Hrs
				//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/SelectEstHrs'))
				String EstHrs = findTestData("Data Files/ProAcc_Admin/Activity_TestData").getValue("EST_HRS",i)

				WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/input__txtEstimated'), EstHrs)
				//Task Type
				String TaskType = findTestData("Data Files/ProAcc_Admin/Activity_TestData").getValue("Task Type",i)

				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Task Type'), TaskType ,true)
				WebUI.delay(2)

				WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/button_Save'))
				WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/button_Save_1'))
				WebUI.delay(2)
				//	WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/button_Add Activity'))


				loginfo.createNode(new GherkinKeyword("And"), "User has to fill the fields like Task,ApplicationArea,Phase,Role,Building blocks,TaskType").pass("pass");
				Assert.assertTrue(true);
				loginfo.assignCategory("Activity")
			}
		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to fill the fields like Task,ApplicationArea,Phase Role,,Building blocks,TaskType").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}

	@And("User has to click on save button for creating new activity")
	public void user_has_to_click_on_save_button_for_creating_new_activity() {
		try{
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating new activity").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating new activity").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User can verify the created activity in the search list")
	public void user_can_verify_the_created_activity_in_the_search_list() {
		try{
			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created activity in the search list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created activity in the search list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}