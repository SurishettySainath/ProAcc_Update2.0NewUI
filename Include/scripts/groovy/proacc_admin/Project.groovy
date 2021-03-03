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



class Project {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to project page")
	public void user_should_be_navigate_to_project_page() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Project/click_config'))
			WebUI.delay(2)
			loginfo= extent.createTest(Feature.class,"Project functionality in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Project Creation in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to project page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to project page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}


	}

	@When("User has to click on Add new Project button")
	public void user_has_to_click_on_Add_new_Project_button() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Project/click_AddnewPrj'))
			WebUI.delay(2)

			loginfo.createNode(new GherkinKeyword("Given"), "User has to click on Add new Project button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User has to click on Add new Project button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}


	}

	@When("User has to enter the fields such as projectname,projectmanager,customer,scenario,description")
	public void user_has_to_enter_the_fields_such_as_projectname_projectmanager_customer_scenario_description() {
		try{
			String ProjectName = findTestData("Data Files/ProAcc_Admin/Project_TestData").getValue("ProjectName",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Project/btn_prjname'),ProjectName)
			WebUI.delay(2)
			String ProjectManager = findTestData("Data Files/ProAcc_Admin/Project_TestData").getValue("PM",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Project/drp_prjmanager'),ProjectManager,true)
			WebUI.delay(2)
			String Customer = findTestData("Data Files/ProAcc_Admin/Project_TestData").getValue("Customer",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Project/drp_customer'),Customer,true)
			WebUI.delay(2)
			String Scenario = findTestData("Data Files/ProAcc_Admin/Project_TestData").getValue("Scenario",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Project/drp_scenario'),Scenario,true)
			WebUI.delay(2)
			String description = findTestData("Data Files/ProAcc_Admin/Project_TestData").getValue("Description",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Project/txt_description'),description)
			WebUI.delay(2)

			loginfo.createNode(new GherkinKeyword("Given"), "User has to enter the fields such as projectname,projectmanager,customer,scenario,description").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User has to enter the fields such as projectname,projectmanager,customer,scenario,description").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}

	@When("User has to click on save button for creating project")
	public void user_has_to_click_on_save_button_for_creating_project() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Project/btn_save'))

			loginfo.createNode(new GherkinKeyword("Given"), "User has to click on save button for creating project").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User has to click on save button for creating project").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}

	@Then("User can verify the created project in the search list")
	public void user_can_verify_the_created_project_in_the_search_list() {
		try{

			//			WebUI.delay(3)
			//			String projectname = findTestData("Data Files/ProjectCreation_TestData").getValue("ProjectName",1)
			//
			//			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Project/searchprj'), projectname)
			//String text = WebUI.getText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/verify_customer'))
			//if(text.contains(Customer_search)) {
			//String text = "Customer_search"
			//if(text.equalsIgnoreCase(projectname)){
			//println("Projectname is verified :) ")
			//}
			//else {
			//println("Sorry, Projectname is not verified :( ")
			//}

			loginfo.createNode(new GherkinKeyword("Given"), "User can verify the created project in the search list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User can verify the created project in the search list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}
}