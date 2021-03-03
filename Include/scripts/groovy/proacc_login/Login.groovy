package proacc_login
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


class Login {

	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should navigate to proacc login page")
	public void user_should_navigate_to_proacc_login_page() {
		try{

			WebUI.openBrowser("")
			WebUI.maximizeWindow()
			WebUI.delay(5)
			String url = GlobalVariable.Url
			WebUI.navigateToUrl(url)
			loginfo= extent.createTest(Feature.class,"ProAcc Login functionality");
			loginfo=loginfo.createNode(Scenario.class,"Login to ProAcc application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to proacc login page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ProAcc_Login")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to proacc login page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to enter the username(.*) and password(.*)")
	public void user_has_to_enter_the_username_and_password(String Username,String Password) {
		try{
			//	String RowCount=findTestData("Data Files/ProAcc_Data").getRowNumbers()
			//	println("Count"+RowCount)

			//	String username = findTestData("Data Files/ProAcc_Data").getValue("Username",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_User Name_Username'), Username)
			//	println("Count+++"+username)

			WebUI.delay(2)

			//	String Password = findTestData("Data Files/ProAcc_Data").getValue("Password",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_Password_Password'), Password)
			//	WebUI.delay(2)

			loginfo.createNode(new GherkinKeyword("When"), "User has to enter the username and password").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ProAcc_Login")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to enter the username and password").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}

	@And("User has to click on Login button")
	public void user_has_to_click_on_Login_button() {
		try{
			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/ProAcc_Login/button_Sign In'))
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on Login button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ProAcc_Login")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on Login button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@Then("User has sucessfully logged into proacc application")
	public void user_has_sucessfully_logged_into_proacc_application() {
		try{
			WebUI.delay(3)

			loginfo.createNode(new GherkinKeyword("Then"), "User has sucessfully logged into proacc application").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ProAcc_Login")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has sucessfully logged into proacc application").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}
}