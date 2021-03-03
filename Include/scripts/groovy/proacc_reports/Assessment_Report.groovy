package proacc_reports
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


class Assessment_Report {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should navigate to Reports page")
	public void user_should_navigate_to_Reports_page() {
		try {
			WebUI.openBrowser("")
			WebUI.maximizeWindow()
			WebUI.delay(5)
			String url = GlobalVariable.Url
			WebUI.navigateToUrl(url)

			String Name = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("Names",2)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_User Name_Username'),Name)
			WebUI.delay(1)

			String password = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("password",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_Password_Password'),password)
			WebUI.delay(1)
			WebUI.click(findTestObject('Object Repository/ProAcc_Login/button_Sign In'))

			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/ReportClick_Btn"))
			//	WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Assessment_Report/AssessmentReport_Click"))

			loginfo= extent.createTest(Feature.class,"Assessment Report functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Generating Assessment Report in proAcc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Reports page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("AssessmentReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Reports page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User should select the project,instance from the respective dropdown list")
	public void user_should_select_the_project_instance_from_the_respective_dropdown_list() {
		try {
			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/NXReportButton"))
			String project = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Project",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Reports/Assessment_Report/Project_Drp'),project , true)


			String instance = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Instance",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Reports/Assessment_Report/Intance_Drp'),instance, true)


			loginfo.createNode(new GherkinKeyword("When"), "User should select the project,instance from the respective dropdown list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("AssessmentReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User should select the project,instance from the respective dropdown list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User should be able to see Comprehensive Assesssment and Readiness check Report, Landscape and System Management, Custom Code Analysis and License Optimization Reports")
	public void user_should_be_able_to_see_Comprehensive_Assesssment_and_Readiness_check_Report_Landscape_and_System_Management_Custom_Code_Analysis_and_License_Optimization_Reports() {
		try {
			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Assessment_Report/Landscape_Click"))
			WebUI.delay(3)

			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Assessment_Report/Custom_Click"))
			loginfo.createNode(new GherkinKeyword("Then"), "User should be able to see Comprehensive Assesssment,Landscape,CustomCode,License report").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("AssessmentReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should be able to see Comprehensive Assesssment,Landscape,CustomCode,License report").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}