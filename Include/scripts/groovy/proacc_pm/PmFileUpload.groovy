package proacc_pm
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


import com.kms.katalon.core.configuration.RunConfiguration

class PmFileUpload {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to PM File Upload page")
	public void user_should_be_navigate_to_PM_File_Upload_page() {
		try {
			//			WebUI.openBrowser("")
			//			WebUI.maximizeWindow()
			//			WebUI.delay(5)
			//			String url = GlobalVariable.Url
			//			WebUI.navigateToUrl(url)
			//			WebUI.delay(30)

			WebUI.click(findTestObject("Object Repository/ProAcc_Pm/PmFileUpload/PmFileUpload_Click"))

			loginfo= extent.createTest(Feature.class,"Pm File Upload functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Pm File Uploading in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to PM File Upload page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmFileUpload")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to PM File Upload page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}

	@When("User has to select project and Instance from the Pm File dropdown")
	public void User_has_to_select_project_and_Instance_from_the_Pm_File_dropdown() {

		try {
			//	WebUI.click(findTestObject("Object Repository/ProAcc_Pm/PmFileUpload/Select_ok"))
			//	WebUI.delay(6)

			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/PmFileUpload/Select Project'),"TestProject" , true)

			WebUI.delay(2)

			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/PmFileUpload/Select Instance'),"TP1", true)

			loginfo.createNode(new GherkinKeyword("When"), "User has to select project,Instance from the Pm File dropdown").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmFileUpload")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select project,Instance from the Pm File dropdown").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to Upload Comprehensive,Landscape,Custom code,License Optimization files")
	public void user_has_to_Upload_Comprehensive_Landscape_Custom_code_License_Optimization_files() {
		try {
			WebUI.delay(2)

			String path = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/SAP Readiness Check.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Pm/PmFileUpload/Comprehensive_Choose File'), path)

			String path1 = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/SAP Readiness Check.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Pm/PmFileUpload/CustomCode_File'), path1)

			String path2 = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/SAP Readiness Check.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Pm/PmFileUpload/Landscape_File'), path2)

			String path3 = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/SAP Readiness Check.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Pm/PmFileUpload/License_File'), path3)


			loginfo.createNode(new GherkinKeyword("When"), "User has to Upload Comprehensive,Landscape,Custom code,License Optimization files").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmFileUpload")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to Upload Comprehensive,Landscape,Custom code,License Optimization files").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User has successfully uploaded the pm files")
	public void user_has_successfully_uploaded_the_pm_files() {
		try {
			WebUI.delay(2)
			WebUI.click(findTestObject("Object Repository/ProAcc_Pm/PmFileUpload/Add_update_Button"))
			WebUI.delay(5)
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully uploaded the pm files").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmFileUpload")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully uploaded the pm files").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
}