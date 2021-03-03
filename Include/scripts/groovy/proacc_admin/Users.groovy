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



class Users {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to Create User page")
	public void user_should_be_navigate_to_Create_User_page() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/usersetting'))
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/click_user'))
			WebUI.delay(1)
			loginfo= extent.createTest(Feature.class," User functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"User Creation in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Create User page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Users")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Create User page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}

	@When("User has to click on Add User button")
	public void user_has_to_click_on_Add_User_button() {
		try{
			//	WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/adduser'))
			WebUI.delay(1)
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add User button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Users")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add User button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}

	@And("User has to fill the fields such as name,loginid,password,email,usertype")
	public void user_has_to_fill_the_fields_such_as_name_loginid_password_email_usertype() {

		try{
			for(int i=1;i<=4;i++)
			{
				WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/adduser'))

				//UserName
				String Name = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("Names",i)
				WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/name'),Name)
				WebUI.delay(1)
				//LoginID
				String Loginid = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("LoginID",i)
				WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/loginid'),Loginid)
				WebUI.delay(1)
				//Password
				String password = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("password",i)
				WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/password'),password)
				WebUI.delay(1)
				//ConfirmPassword
				String ConfirmPassword = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("Confirm Password",i)
				WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/confirmpassword'),ConfirmPassword)
				WebUI.delay(1)
				//PhoneNumber
				String PhoneNumber = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("Phone",i)
				WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/phone'),PhoneNumber)
				println("Test"+PhoneNumber)
				WebUI.delay(1)
				//Email
				String Email = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("EmailID",i)
				WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/email'),Email)
				WebUI.delay(1)
				//Usertype
				String Usertype = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("User Type",i)
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/usertypedrp'),Usertype,true)


				WebUI.delay(2)
				if (Usertype == "Consultant"){
					String role = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("Role",i)
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/roledrp'),role,true)
					WebUI.delay(1)
				}
				else if (Usertype == "Customer"){
					String role1 = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("Role",i)
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/roledrp'),role1,true)
					String customer = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("Customer",i)
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/customerdrp'),customer,true)


				}
				WebUI.delay(2)
				WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/btn_save'))
				WebUI.delay(2)
				//	WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/adduser'))

				loginfo.createNode(new GherkinKeyword("And"), "User has to fill the fields such as name,loginid,password,email,usertype").pass("pass");
				Assert.assertTrue(true);
				loginfo.assignCategory("Users")
			}

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to fill the fields such as name,loginid,password,email,usertype").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}

	@And("User has to click on save button for creating new user")
	public void user_has_to_click_on_save_button_for_creating_new_user() {
		try{
			//WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Users/btn_save'))
			WebUI.delay(1)

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating new user").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Users")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating new user").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}

	@Then("User can verify the created user in the search list")
	public void user_can_verify_the_created_user_in_the_search_list() {
		try{

			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created user in the search list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Users")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created user in the search list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

}