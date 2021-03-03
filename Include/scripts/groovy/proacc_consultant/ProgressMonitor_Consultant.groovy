package proacc_consultant
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.aventstack.extentreports.ExtentReports
import com.aventstack.extentreports.ExtentTest
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
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
import org.openqa.selenium.JavascriptExecutor

import projectKeywords.OnlineKeywords
//import common.entities

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
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.LogStatus;
import com.aventstack.extentreports.gherkin.model.Scenario
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.fasterxml.jackson.annotation.JsonFormat.Feature
import com.aventstack.extentreports.GherkinKeyword
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.String
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.LogStatus;
import common.CommonReport;


class AssessmentMonitor_Consultant {
	ExtentTest test;
	// ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""


	@Given("User should navigate to ProAcc Consultant login page")
	public void User_should_navigate_to_ProAcc_Consultant_login_page() {
		try{


			loginfo= extent.createTest(Feature.class,"Progress Monitor functionality for Consultant in ProAcc");
			loginfo=loginfo.createNode(Scenario.class,"Progress Monitor for Consultant in ProAcc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to ProAcc Consultant login page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor for Consultant")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to ProAcc Consultant login page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}

	@When("User should select Consultant Customername,Project Name,Consultant Instance Name,phase(.*)")

	public void User_should_select_Consultant_Customername_Project_Name_Consultant_Instance_Name_phase(String Phases) {

		try{
			WebUI.delay(5)
			int rowCount = findTestData("Data Files/ProAcc_InputData").getRowNumbers()
			println "rowCount ################################:" + rowCount

			//Assessment monitor
			for (int k=2;k<=rowCount;k++) {

				println("####################################"+k)
				String  textBoxCount12 = findTestData("Data Files/ProAcc_InputData").getValue("Username",k)

				println "Total number of Text boxes "+textBoxCount12

				WebUI.openBrowser('')
				WebUI.maximizeWindow()
				WebUI.navigateToUrl('http://123.176.34.15:4041/ProAcc2QA')

				//	WebUI.setText(findTestObject('Object Repository/Trash1/Page_Promantus ProAcc Login/input_Login_Username'), textBoxCount12)
				WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_User Name_Username'), textBoxCount12)

				//		WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_User Name_Username'),"testcustomer")

				WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_Password_Password'), "a12345@")

				WebUI.click(findTestObject('Object Repository/ProAcc_Login/button_Sign In'))

				WebUI.delay(2)
				TestObject Title = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@class="card-title"]', true)
				String getTitle=	WebUI.getText(Title)

				println('2' + getTitle)

				String Phase11 = "Consultant"
				String Phase22 = "Customer"

				if (Phase11.equals(getTitle))
				{
					TestObject Consultant = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="sidebar-collapse"]/ul/li[4]/a/span', true)
					String getConsultant=	WebUI.click(Consultant)
				}
				else if (Phase22.equals(getTitle))
				{
					TestObject Customer = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="sidebar-collapse"]/ul/li[3]/a/span', true)
					String getCustomer=	WebUI.click(Customer)

				}

				//		WebUI.click(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/TaskMonitor_Click'))

				WebUI.click(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/report_Btn'))

				//Assessment scripts follows


				String Phase1 = "Assessment"
				String Phase2 = "Pre Conversion"
				String Phase3 = "Conversion"
				String Phase4 = "Post Conversion"

				if (Phase1.equalsIgnoreCase(Phases))
				{
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase1, true)
				}
				else if (Phase2.equalsIgnoreCase(Phases))
				{
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase2, true)

				}
				else if (Phase3.equalsIgnoreCase(Phases))
				{
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase3, true)

				}
				else if (Phase4.equalsIgnoreCase(Phases))
				{
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase4, true)

				}

				WebUI.delay(2)
				//	WebUI.click(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/report_Btn'))



				//				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Customer'),
				//						"Cipla Industries", true)
				//				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Project'),
				//						"TestProject", true)
				TestObject Title2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@class="card-title"]', true)
				String text = WebUI.getText(Title2)
				if(text.contains("Consultant")) {
					//	WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Customer'),"Cipla Industries", true)
					String Customer13 = findTestData("Data Files/ProAcc_Admin/Customer_TestData").getValue("Name",1)
					println("Test"+Customer13)
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Customer'),Customer13, true)

					String project = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Project",1)
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Project'),project , true)

					String instance1 = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Instance",1)
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Instance'),instance1, true)


				}
				else if (text.contains("Customer")) {

					String project = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Project",1)
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Project'),project , true)
					//		WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Project'),"TestProject", true)
					String instance1 = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Instance",1)
					WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Instance'),instance1, true)

				}

				//	String project = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Project",1)
				//	WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Project'),project , true)

				//	String instance1 = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Instance",1)
				//	WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Instance'),instance1, true)

				//	WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Select_Instance'),"TP1", true)

				WebUI.delay(2)
				//k=k-1;

				//pencil Click
				println(k)
				println("Click Test")
				WebUI.click(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/edit'))

				//		((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('//*[@id='Edittask' and @style='cursor:pointer;']).click()")

				// // new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/Edit_Button'))

				println("Start Date")
				//planed start date
				WebUI.delay(2)
				WebDriver driver = DriverFactory.getWebDriver()
				JavascriptExecutor executor = ((driver) as JavascriptExecutor)


				//	((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('//*[@id='Edittask' and @style='cursor:pointer';']).click()")

				executor.executeScript("document.getElementById('Actual_StartDate').value='10 Mar 2021'");

				WebUI.delay(3)

				//planed end date
				((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('Actual_EndDate').value='12 Mar 2021'")
				//status
				WebUI.delay(1)
				((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('drpStatus').value='1'")
				WebUI.delay(1)
				//Actual hrs
				((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('ActHours').value='24:00'")
				//comments
				WebUI.delay(1)
				new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Progress_Save_Btn'))


				executor.executeScript("document.getElementById('Comments').value='Consultant Done'");
				//Save button
				WebUI.delay(1)
				//	((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('//*[@id='btnComments']').click()")


				new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/Progress_Save_Btn'))
				WebUI.delay(3)
				WebUI.delay(2)

				new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/ProAcc_Consultant/ProgressMonitor/User_Click'))

				new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/ProAcc_Login/Logout'))

			}
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Consultant Project Name and Consultant Instance Name from the dropdown for consultant Assessment Monitor").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor for Consultant")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Consultant Project Name and Consultant Instance Name from the dropdown for consultant Assessment Monitor").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
	@Then("User should successfully complete pm Monitor task")
	public void User_should_successfully_complete_pm_Monitor_task() {
		try {

			loginfo.createNode(new GherkinKeyword("Given"), "User has successfully completed pm Monitor task").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Progress Monitor for Consultant")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User has successfully completed pm Monitor task").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}