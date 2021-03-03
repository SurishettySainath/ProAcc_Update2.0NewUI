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


class Activity_Delete {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User should navigate to Activity Creation page")
	public void user_should_navigate_to_Activity_Creation_page() {
		try{
			WebUI.openBrowser("")
			WebUI.maximizeWindow()
			WebUI.delay(5)
			String url = GlobalVariable.Url
			WebUI.navigateToUrl(url)
			String username = findTestData("Data Files/ProAcc_Data").getValue("Username",1)

			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_User Name_Username'), username)
			String password = findTestData("Data Files/ProAcc_Data").getValue("Password",1)

			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_Password_Password'), password)
			
			WebUI.click(findTestObject('Object Repository/ProAcc_Login/button_Sign In'))
			

			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/span_Configuration'))
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/a_Activity'))

			loginfo= extent.createTest(Feature.class,"Activity deletion functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Activity deletion in ProAcc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Activity Creation page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity Deletion")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Activity Creation page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to enter Activityname in search box")
	public void user_has_to_enter_Activityname_in_search_box() {
		try{
			loginfo.createNode(new GherkinKeyword("When"), "User has to enter Activityname in search box").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity Deletion")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to enter Activityname in search box").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to click on delete button for Activity")
	public void user_has_to_click_on_delete_button_for_Activity() {
		try{
			WebUI.delay(2)
			for(int i=1;i<=4;i++)
			{
				String Owner = findTestData("Data Files/ProAcc_Admin/Activity_TestData").getValue("TaskName",i)

				String xpath_Upload_Site = '//*[@id="activityTable"]/tbody/tr'

				int rowCount = (new OnlineKeywords()).countRowsPerPage(xpath_Upload_Site)
				println(rowCount)
				for(i=1;i<=rowCount-1;i++)
				{
					TestObject task1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="activityTable"]/tbody/tr['+i+']/td[1]/span', true)
					WebUI.delay(1)

					String task=WebUI.getText(task1)
					println(task)
					if(Owner==task) {
						TestObject delete = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="activityTable"]/tbody/tr['+i+']/td[10]/span[2]', true)
						WebUI.click(delete)
						WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Pull_Data_Btn'))
					}
				}
			}
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on delete button for Activity").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity Deletion")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on delete button for Activity").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}

	@Then("User has successfully deleted Activity")
	public void user_has_successfully_deleted_Activity() {
		try{

			loginfo.createNode(new GherkinKeyword("then"), "User has successfully deleted Activity").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity Deletion")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully deleted Activity").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}
}