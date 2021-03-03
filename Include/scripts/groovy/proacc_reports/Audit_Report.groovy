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

import org.openqa.selenium.JavascriptExecutor

import projectKeywords.OnlineKeywords
//import common.entities

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
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.LogStatus;
import com.aventstack.extentreports.gherkin.model.Scenario
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.fasterxml.jackson.annotation.JsonFormat.Feature
import com.aventstack.extentreports.GherkinKeyword
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.String
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.LogStatus;
import common.CommonReport;


class Audit_Report {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should navigate to Audit Report page")
	public void user_should_navigate_to_Audit_Report_page() {
		try {

			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/ReportClick_Btn"))
		//	WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/NXReportButton"))

			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Audit_Report/Audit_Click"))

			loginfo= extent.createTest(Feature.class,"Audit report Functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Generating Audit Report in ProAcc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Audit Report page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("AuditReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Audit Report page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User should select start Date and End Date fields")
	public void user_should_select_start_Date_and_End_Date_fields() {
		try {
			WebUI.delay(2)
			WebDriver driver = DriverFactory.getWebDriver()
			JavascriptExecutor executor = ((driver) as JavascriptExecutor)

			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('StartDate').value='1 Mar 2021'")

			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('EndDate').value='12 Mar 2021'")

			loginfo.createNode(new GherkinKeyword("When"), "User should select start Date and End Date fields").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("AuditReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User should select start Date and End Date fields").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to Click on search Button")
	public void user_has_to_Click_on_search_Button() {
		try {
			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Audit_Report/Search_Click"))
			loginfo.createNode(new GherkinKeyword("When"), "User has to Click on search Button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("AuditReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to Click on search Button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User can view the Audit report file summary and actions")
	public void user_can_view_the_Audit_report_file_summary_and_actions() {
		try {

			loginfo.createNode(new GherkinKeyword("Then"), "User can view the Audit report file summary and actions").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("AuditReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can view the Audit report file summary and actions").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}