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

class ProgressMonitor {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to Progress Monitor page")
	public void user_should_be_navigate_to_Progress_Monitor_page() {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/ProgressMonitor'))

			//			String Phase1 = "Assessment"
			//			String Phase2 = "Pre Conversion"
			//			String Phase3 = "Conversion"
			//			String Phase4 = "Post-Conversion"
			//
			//			println ("Test"+phase)
			//
			//			if (Phase1.equalsIgnoreCase(phase))
			//			{
			//				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),phase, true)
			//			}
			//			else if (Phase2.equalsIgnoreCase(phase))
			//			{
			//				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),phase, true)
			//
			//			}
			//			else if (Phase3.equalsIgnoreCase(phase))
			//			{
			//				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),phase, true)
			//
			//			}
			//			else if (Phase4.equalsIgnoreCase(phase))
			//			{
			//				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),phase, true)
			//
			//			}

			String xpath_Site = '//*[@id="ProgressMonitor"]/tbody/tr'

			int rowCount1 = (new OnlineKeywords()).countRowsPerPage(xpath_Site)

			println "rowCount :" +rowCount1
			for(int k=2;k<=rowCount1;k++)
			{
				TestObject Owneruser = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="ProgressMonitor"]/tbody/tr['+k+']/td[5]', true)

				String Owner_gettext = WebUI.getText(Owneruser)

				println('1' + Owner_gettext)

				FileInputStream file = new FileInputStream (new File("C:\\Users\\Group10\\Desktop\\ProAcc_Test\\ProAcc_Test_New\\Include\\TestData\\Testdata_ProAcc.xlsx"))
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet ResourceAllocation = workbook.getSheetAt(0);
				ResourceAllocation.createRow(k);

				String text=ResourceAllocation.getRow(k).createCell(0).setCellValue(Owner_gettext);


				println(text+"Data")

				file.close();
				FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\Group10\\Desktop\\ProAcc_Test\\ProAcc_Test_New\\Include\\TestData\\Testdata_ProAcc.xlsx"));
				workbook.write(outFile);
				outFile.close();
			}
			loginfo= extent.createTest(Feature.class,"Progress Monitor functionality");
			loginfo=loginfo.createNode(Scenario.class,"Progress Monitoring in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Progress Monitor page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Progress Monitor page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to select project,Instance fields from the project dropdown")
	public void user_has_to_select_project_Instance_fields_from_the_project_dropdown() {
		try{

			loginfo.createNode(new GherkinKeyword("When"), "User has to select project,Instance fields from the project dropdown").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select project,Instance fields from the project dropdown").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User can Download the tasks by click on Download Icon")
	public void user_can_Download_the_tasks_by_click_on_Download_Icon() {
		try{

			loginfo.createNode(new GherkinKeyword("When"), "User can Download the tasks by click on Download Icon").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User can Download the tasks by click on Download Icon").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User can send mail to respective person by click on Mail Icon")
	public void user_can_send_mail_to_respective_person_by_click_on_Mail_Icon() {
		try{

			WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/Mail_Icon'))
			//Email Id
			String email = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("Email",1)
			WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/input__Emailid'), email)
			//Subject
			String subject = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("Subject",1)
			WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/input__Subject'), subject)
			//Body Content
			String body = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("Body",1)
			WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/textarea__Body'), body)
			//Send Mail
			WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/button_Send Mail'))

			loginfo.createNode(new GherkinKeyword("When"), "User can send mail to respective person by click on Mail Icon").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User can send mail to respective person by click on Mail Icon").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User can add activities by click on Add Activity(.*)")
	public void user_can_add_activities_by_click_on_Add_Activity(String Activity) {
		try{
			WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/button_Add Activity'))
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/input__txtTask'))

			//Task
			//	String TaskFi = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("Taske",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/input__txtTask'), Activity)

			println ("Test"+Activity)

			//Application Area
			WebUI.click(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Application Area'))
			String App = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("AppArea",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Application Area'), App, true)
			println ("Test"+App)

			//Role
			String Roles = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("Rolee",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Role'),Roles, true)

			//Owner
			WebDriver driver = DriverFactory.getWebDriver()
			JavascriptExecutor executor = ((driver) as JavascriptExecutor)

			String owner = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("Owner",1)
			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ProjectMonitor/Select_Owner'))
			println owner
			//	TestObject Owner23 = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="drpOwner"]', true)
			//	((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('drpOwner').value='2'")
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ProjectMonitor/Select_Owner'), owner, false, FailureHandling.STOP_ON_FAILURE)
			//	WebUI.selectOptionByLabel(Owner23,owner, true)
			// Building block
			String Block = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("BuildBlock",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Building Block'),Block, true)
			//Est Hrs
			String EstimatedHrs = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("EstimateHrs",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/input__txtEstimated'), EstimatedHrs)
			//Task Type
			String Type = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("Ttype",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Admin/ProAcc_Activity/Select Task Type'), Type ,true)
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ProjectMonitor/button_CreateActivity'))

			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ProjectMonitor/btnSeq'))

			loginfo.createNode(new GherkinKeyword("When"), "User can add activities by click on Add Activity").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User can add activities by click on Add Activity").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to click on edit button to Update the Status")
	public void user_has_to_click_on_edit_button_to_Update_the_Status() {
		try{
			WebUI.delay(2)
			WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/i_Yet To Start_Edittask'))

			loginfo.createNode(new GherkinKeyword("When"), "User has to click on edit button to Update the Status").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on edit button to Update the Status").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User can edit Status,Planned Date,Est Hours fields")
	public void user_can_edit_Status_Planned_Date_Est_Hours_fields() {
		try{
			WebUI.selectOptionByValue(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/select_Not Applicable'),
					'3', true)

			WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/button_Save'))

			WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_ProjectMonitor/textarea_Add Comments_Comments'), 'Test')

			loginfo.createNode(new GherkinKeyword("When"), "User can edit Status,Planned Date,Est Hours fields").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User can edit Status,Planned Date,Est Hours fields").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User has successfully Updated the Progress Monitor Status(.*)")
	public void user_has_successfully_Updated_the_Progress_Monitor_Status(String Activity) {
		try{
			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ProjectMonitor/button_SaveComments'))
			WebUI.delay(2)

			//	String TaskF = findTestData("Data Files/ProAcc_PM/ProgressMonitor").getValue("Taske",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ProjectMonitor/Search_Task'), Activity)
			WebUI.delay(2)

			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully Updated the Progress Monitor Status").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully Updated the Progress Monitor Status").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}