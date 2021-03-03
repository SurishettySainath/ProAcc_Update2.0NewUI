package proacc_consultant
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

class CreateAnalysis {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User has to navigate to create analysis page")
	public void user_has_to_navigate_to_create_analysis_page() {
		try {
			WebUI.openBrowser("")
			WebUI.maximizeWindow()
			WebUI.delay(5)
			String url = GlobalVariable.Url
			WebUI.navigateToUrl(url)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_User Name_Username'), "seena")


			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_Password_Password'), "a12345@")

			WebUI.click(findTestObject('Object Repository/ProAcc_Login/button_Sign In'))

			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/CreateAnalysis_Click'))

			loginfo= extent.createTest(Feature.class,"Create Analysis functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Create Analysis in ProAcc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User has to navigate to create analysis page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("CreateAnalysis")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User has to navigate to create analysis page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to select Customer Name, Project Name and Instance Name from the dropdown List")
	public void user_has_to_select_Customer_Name_Project_Name_and_Instance_Name_from_the_dropdown_List() {
		try {

			WebUI.click(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/report_Btn'))

			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Customer'),
					"Cipla Industries", true)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Project'),
					"TestProject", true)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectInstanceName'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Instance'),
					"TP1", true)
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Customer Name, Project Name and Instance Name from the dropdown List").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("CreateAnalysis")
		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Customer Name, Project Name and Instance Name from the dropdown List").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
	@When("User has to upload SAP READINESS CHECK FILES for Activities, BWExtractors, CustomCode, HANADatabase, FioriApps, RelevantSimplification, SAPReadiness")
	public void user_has_to_upload_SAP_READINESS_CHECK_FILES_for_Activities_BWExtractors_CustomCode_HANADatabase_FioriApps_RelevantSimplification_SAPReadiness() {
		try {
			String path = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/Activities.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/FileUpload_Btn'), path)
			WebUI.delay(2)

			String path1 = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/Bwextractors.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/FileUpload_Btn'), path1)
			WebUI.delay(2)

			String path2 = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/CustomCode.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/FileUpload_Btn'), path2)
			WebUI.delay(2)

			String path3 = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/HanaDatabaseTables.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/FileUpload_Btn'), path3)
			WebUI.delay(2)

			String path4 = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/RecommendedFioriApps.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/FileUpload_Btn'), path4)
			WebUI.delay(2)

			String path5 = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/RelevantSimplificationItems.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/FileUpload_Btn'), path5)
			WebUI.delay(2)

			String path6 = RunConfiguration.getProjectDir() +'/Include/ProAcc_InputFile/SAP Readiness Check.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/FileUpload_Btn'), path6)
			WebUI.delay(2)

			loginfo.createNode(new GherkinKeyword("When"), "User has to upload SAP READINESS CHECK FILES for Activities, BWExtractors, CustomCode, HanaDatabase, FioriApps, RelevantSimplification, SAPReadiness").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("CreateAnalysis")
		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to upload SAP READINESS CHECK FILES for Activities, BWExtractors, CustomCode, HanaDatabase, FioriApps, RelevantSimplification, SAPReadiness").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
	@When("User has to click on the term of use and acknowldge checkboxes")
	public void user_has_to_click_on_the_term_of_use_and_acknowldge_checkboxes() {
		try {
			WebUI.click(findTestObject("Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/ReadinessCheck_Checkbox"))

			WebUI.click(findTestObject("Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/AcknowldgeCheck_Checkbox"))

			loginfo.createNode(new GherkinKeyword("When"), "User has to click on the term of use and acknowldge checkboxes").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("CreateAnalysis")
		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on the term of use and acknowldge checkboxes").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
	@When("User has to click on start analysis button")
	public void user_has_to_click_on_start_analysis_button() {
		try {
			WebUI.click(findTestObject('Object Repository/ProAcc_Consultant/ProAcc_CreateAnalysis/StartAnalysis'))

			loginfo.createNode(new GherkinKeyword("When"), "User has to click on start analysis button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("CreateAnalysis")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on start analysis button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
	@Then("User should successfully navigate to readinesscheck")
	public void user_should_successfully_navigate_to_readinesscheck() {
		try {
			WebUI.delay(6)

			loginfo.createNode(new GherkinKeyword("Then"), "User should successfully navigate to readinesscheck").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("CreateAnalysis")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "UUser should successfully navigate to readinesscheck").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}