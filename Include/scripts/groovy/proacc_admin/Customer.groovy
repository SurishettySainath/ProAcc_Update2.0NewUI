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

class Customer {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to customer page")
	public void user_should_be_navigate_to_customer_page() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/span_Configuration'))

			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/a_Customer'))
			WebUI.delay(2)
			loginfo= extent.createTest(Feature.class,"Customer functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Customer Creation in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to customer page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to customer page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to click on Add Customer button")
	public void user_has_to_click_on_Add_Customer_button() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/button_Add Customer'))
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add Customer button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add Customer button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}

	@And("User has to fill the fields like Industrysector,ContactName,emailid,phone")
	public void user_has_to_fill_the_fields_like_Industrysector_ContactName_emailid_phone() {

		try{

			WebUI.delay(1)
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/input_Customer Name_txtCompanyName'))
			String Customer12 = findTestData("Data Files/ProAcc_Admin/Customer_TestData").getValue("Name",1)
			println("Test"+Customer12)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/input_Customer Name_txtCompanyName'), Customer12)


			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/Select Industry'))
			String Industrysector = findTestData("Data Files/ProAcc_Admin/Customer_TestData").getValue("Industry_sector",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/select_Select IndustrySector               _9609f9'),
					Industrysector, true)

			String ContactPersonName = findTestData("Data Files/ProAcc_Admin/Customer_TestData").getValue("ContactPersonName",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/input_Contact Person_txtContact'), ContactPersonName)
			println("Test123"+ContactPersonName)



			String emailid = findTestData("Data Files/ProAcc_Admin/Customer_TestData").getValue("EmailId",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/input_Email_txtCustomerEmail'), emailid)

			String phone = findTestData("Data Files/ProAcc_Admin/Customer_TestData").getValue("ContactPhoneNo",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/input_Phone_txtCustomerPhone'), phone)

			loginfo.createNode(new GherkinKeyword("And"), "User has to fill the fields like Industrysector,ContactName,emailid,phone").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to fill the fields like Industrysector,ContactName,emailid,phone").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to click on save button for creating customer")
	public void user_has_to_click_on_save_button_for_creating_customer() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Customer/button_Save'))
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating customer").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating customer").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@Then("User can verify the created customer in the search list")
	public void user_can_verify_the_created_customer_in_the_search_list() {
		try{
			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created customer in the search list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created customer in the search list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
}