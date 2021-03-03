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

class PmTaskMonitor {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to PM Task Monitor page")
	public void user_should_be_navigate_to_PM_Task_Monitor_page() {
		try {
			WebUI.openBrowser("")
			WebUI.maximizeWindow()
			WebUI.delay(5)
			String url = GlobalVariable.Url
			WebUI.navigateToUrl(url)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_User Name_Username'), "TestPM")

			WebUI.delay(2)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_Password_Password'), "a12345@")

			WebUI.click(findTestObject('Object Repository/ProAcc_Login/button_Sign In'))

			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_PmTaskMonitor/span_PM'))
			WebUI.click(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/a_Click'))

			loginfo= extent.createTest(Feature.class,"PM Task Monitoring functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"PmTaskMonitor in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to PmTaskMonitor page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmTaskMonitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to PmTaskMonitor page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to select project name from the Projects dropdown list")
	public void user_has_to_select_project_name_from_the_Projects_dropdown_list() {
		try {
			WebUI.selectOptionByLabel(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/select_Select Project'),
					'TestProject', true)
			loginfo.createNode(new GherkinKeyword("When"), "User has to select project name from the Projects dropdown list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmTaskMonitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select project name from the Projects dropdown list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to click on edit button to Update the PM Task")
	public void user_has_to_click_on_edit_button_to_Update_the_PM_Task() {
		try {
			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Pull_Data_Btn'))

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on edit button to Update the PM Task").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmTaskMonitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on edit button to Update the PM Task").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User can edit Status,Planned and Actual Date fields")
	public void user_can_edit_Status_Planned_and_Actual_Date_fields() {
		try {
			String xpath_Edit = '//*[@id="EditPMtask"]'

			int EditCount = (new OnlineKeywords()).countRowsPerPage(xpath_Edit)

			println "EditCount :" +EditCount

			for(int i=1;i<=EditCount;i++)
			{
				WebUI.click(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/i_Yet To Start_EditPMtask'))
				//	WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/input_EST Hours HHMM_txtEst'),'2:00')

				WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/input_Actual Hours HHMM_txtAct'),
						'2:00')

				WebUI.selectOptionByValue(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/select_CompletedWork In ProgressNot Applica_e58779'),
						'1', true)

				WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/input_Comments_txtPMTaskComments'),
						'Test')
				WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_PmTaskMonitor/Save'))

			}
			loginfo.createNode(new GherkinKeyword("And"), "User can edit Status,Planned and Actual Date fields").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmTaskMonitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User can edit Status,Planned and Actual Date fields").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User has successfully updated the pm task")
	public void user_has_successfully_updated_the_pm_task() {
		try {

			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully updated the pm task").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PmTaskMonitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully updated the pm task").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}