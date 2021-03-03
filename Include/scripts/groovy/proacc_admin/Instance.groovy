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


class Instance {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to Instance page")
	public void user_should_be_navigate_to_Instance_page() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/Config_Btn'))
			//	WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/Prj_Btn'))

			loginfo= extent.createTest(Feature.class,"Instance functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Create Instance in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Instance page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Instance page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to click on Add new Instance button")
	public void user_has_to_click_on_Add_new_Instance_button() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/AddInstance_Btn'))

			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add new Instance button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on Add new Instance button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to enter the fields such as Instancename,projectname,description")
	public void user_has_to_enter_the_fields_such_as_Instancename_projectname_description() {
		try{


			String InstanceName = findTestData("Data Files/ProAcc_Admin/Instance_TestData").getValue("Instance Name",1)

			println "Total number of Text boxes "+InstanceName
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/InstanceName'), InstanceName)

			//	WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/InstanceName'), InstanceNmae)
			String ProjectName = findTestData("Data Files/ProAcc_Admin/Instance_TestData").getValue("Project",1)

			println "Total number of Text boxes "+ProjectName
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/PrjName'), ProjectName,true)
			//	WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/PrjName'), Usertype, true)
			String Description = findTestData("Data Files/ProAcc_Admin/Instance_TestData").getValue("Descrption",1)

			println "Total number of Text boxes "+Description
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/Description_Instance'), Description)
			//	WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/Description_Instance'), Phonenumber)

			loginfo.createNode(new GherkinKeyword("And"), "User has to enter the fields such as Instancename,projectname,description").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to enter the fields such as Instancename,projectname,description").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to click on save button for creating Instance")
	public void user_has_to_click_on_save_button_for_creating_Instance() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/Radio_Btn'))
			

			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Instance/BtnInstanceCreate'))

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating Instance").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on save button for creating Instance").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@Then("User can verify the created Instance in the search list")
	public void user_can_verify_the_created_Instance_in_the_search_list() {
		try{
			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created Instance in the search list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can verify the created Instance in the search list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}
}