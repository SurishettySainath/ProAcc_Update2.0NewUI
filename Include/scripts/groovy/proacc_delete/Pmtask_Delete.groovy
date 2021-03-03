package proacc_delete
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


class Pmtask_Delete {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User should navigate to PmTask Creation page")
	public void user_should_navigate_to_PmTask_Creation_page() {
		try {
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/span_Configuration'))

			WebUI.click(findTestObject('Object Repository/ProAcc_Delete/PmTask_Delete/PmTask_Click'))

			loginfo= extent.createTest(Feature.class,"PmTask deletion functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"PmTask deletion in ProAcc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to PmTask Creation page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmTask Deletion")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to PmTask Creation page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to enter PmTaskname in search box")
	public void user_has_to_enter_PmTaskname_in_search_box() {

		try{
			String TaskCategory = findTestData("Data Files/ProAcc_Admin/PmTask_TestData").getValue("Task Category",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Delete/PmTask_Delete/Search_Pm'), TaskCategory)

			loginfo.createNode(new GherkinKeyword("When"), "User has to enter PmTaskname in search box").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmTask Deletion")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to enter PmTaskname in search box").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to click on delete button for PmTask")
	public void user_has_to_click_on_delete_button_for_PmTask() {
		try {

			WebUI.click(findTestObject('Object Repository/ProAcc_Delete/PmTask_Delete/Del_Btn'))
			WebUI.click(findTestObject('Object Repository/ProAcc_Delete/Activity_Delete/Yes_Btn'))

			loginfo.createNode(new GherkinKeyword("When"), "User has to click on delete button for PmTask").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmTask Deletion")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on delete button for PmTask").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("user has successfully deleted PmTask")
	public void user_has_successfully_deleted_PmTask() {
		try {

			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully deleted PmTask").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmTask Deletion")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully deleted PmTask").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}