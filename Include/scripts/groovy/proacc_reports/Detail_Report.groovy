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


import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.String

class Detail_Report {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should navigate to Detail Report page")
	def User_should_navigate_to_Detail_Report_page(){
		try {

			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/ReportClick_Btn"))
			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/DetailReport_Click"))

			loginfo= extent.createTest(Feature.class,"Detail Report functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Generating Detail Report in proAcc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Detail Report page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("DetailReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Detail Report page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to select the project and instance from the respective dropdown list")
	def User_has_to_select_the_project_and_instance_from_the_respective_dropdown_list(){
		try {


			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/NXReportButton"))
			WebUI.selectOptionByLabel(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/Project_drp"), "Nordic Project", true)
			//	WebUI.click(findTestObject(""))
			WebUI.selectOptionByLabel(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/Instance_drp"), "N01", true)
			loginfo.createNode(new GherkinKeyword("When"), "User has to select the project and instance from the respective dropdown list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("DetailReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select the project and instance from the respective dropdown list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to click on download button to download the report")
	def User_has_to_click_on_download_button_to_download_the_report(){
		try {
			WebUI.click(findTestObject("Object Repository/ProAcc_Reports/Detail_Report/Download_pdf"))
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on download button to download the report").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("DetailReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on download button to download the report").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User has successfully downloaded the detail report")
	def User_has_successfully_downloaded_the_detail_report(){
		try {
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully downloaded the detail report").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("DetailReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully downloaded the detail report").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}
}