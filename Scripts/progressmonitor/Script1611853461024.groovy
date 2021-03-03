import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
//import java.lang.String.equalsIgnoreCase
WebUI.openBrowser('')
//
WebUI.navigateToUrl('http://123.176.34.15:4041/PROACC2QA/')
 
WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_User Name_Username'), "testcustomer")
WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_Password_Password'), "a12345@")
WebUI.click(findTestObject('Object Repository/ProAcc_Login/button_Sign In'))

WebUI.delay(10)
//TestObject Title = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@class="card-title"]', true)
// String getTitle=	WebUI.getText(Title)
//
// println('2' + getTitle)
// 
// String Phase1 = "Consultant"
// String Phase2 = "Customer"
//
// if (Phase1.equals(getTitle))
// {
//	 WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Customer'),"Cipla Industries", true)
// }
// else if (Phase2.equals(getTitle))
// {
//	 WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Customer'),"Cipla Industries", true)
//
// }

 TestObject Title2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@class="card-title"]', true)
 String text = WebUI.getText(Title2)
 if(text.contains("Consultant")) {
WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Customer'),"Cipla Industries", true)
 } 
  else if (text.contains("Customer")) {
//WebUI.click("Customer")
WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Project'),"TestProject", true)
 }



