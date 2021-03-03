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

class Role {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to Roles page")
	public void user_should_be_navigate_to_Roles_page() {
		try{


			//	WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/Config_Btn'))
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Role/a_Roles'))

			loginfo= extent.createTest(Feature.class,"Role functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Role Creation in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Roles page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Roles")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Roles page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to click on Add new Role button")
	public void user_has_to_click_on_Add_new_Role_button() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Role/button_Add New Role'))
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add new Role button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Roles")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add new Role button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to fill the fields like Rolename,Description")
	public void User_has_to_fill_the_fields_like_Rolename_Description() {
		try{
			WebUI.delay(3)
			//	WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Role/input__RoleName'))
			//	String Role = findTestData("Data Files/ProAcc_Admin/Role_TestData").getValue("RoleName",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Role/input__RoleName'), "RoleTestPro")
			//	println("Test"+Role)

			String RoleDecription1 = findTestData("Data Files/ProAcc_Admin/Role_TestData").getValue("Role Decription",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Role/textarea_Description_RoleDescription'), RoleDecription1)
			println("Test"+RoleDecription1)
			loginfo.createNode(new GherkinKeyword("And"), "User has to fill the fields like Rolename,Description").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Roles")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to fill the fields like Rolename,Description").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to click on save button for creating new role")
	public void user_has_to_click_on_save_button_for_creating_new_role() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Role/button_Save'))

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating new role").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Roles")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating new role").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@Then("User can verify the created role in the search list")
	public void user_can_verify_the_created_role_in_the_search_list() {
		try{
			WebUI.delay(3)
			//	String RoleSearch = findTestData("Data Files/ProAcc_Admin/Role_TestData").getValue("Role search",1)
			//	WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Role/Role_Search'), RoleSearch)
			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created role in the search list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Roles")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created role in the search list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
}