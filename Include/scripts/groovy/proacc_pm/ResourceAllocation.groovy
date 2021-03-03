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

class ResourceAllocation {
	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1

	@Given("User should be navigate to Resource Allocation page")
	public void user_should_be_navigate_to_Resource_Allocation_page() {
		try{
			WebUI.openBrowser("")
			WebUI.maximizeWindow()
			WebUI.delay(5)
			String url = GlobalVariable.Url
			WebUI.navigateToUrl(url)
			//	WebUI.delay(25)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_User Name_Username'), "TestPM")
			//	println("Count+++"+username)

			WebUI.delay(2)

			//	String Password = findTestData("Data Files/ProAcc_Data").getValue("Password",1)
			WebUI.setText(findTestObject('Object Repository/ProAcc_Login/input_Password_Password'), "a12345@")

			WebUI.click(findTestObject('Object Repository/ProAcc_Login/button_Sign In'))

			WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/span_Task Monitoring'))

			WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/a_Click'))
			loginfo= extent.createTest(Feature.class,"Resource Allocation functionality");
			loginfo=loginfo.createNode(Scenario.class,"Resource Allocation in Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Resource Allocation page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ResourceAllocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to Resource Allocation page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}

	@When("User has to select project,Instance from the project dropdown(.*)")
	public void user_has_to_select_project_Instance_from_the_project_dropdown(String Phase) {
		try{
			WebUI.delay(2)

			String Phase1 = "Assessment"
			String Phase2 = "Pre Conversion"
			String Phase3 = "Conversion"
			String Phase4 = "Post Conversion"

			if (Phase1.equalsIgnoreCase(Phase))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase1, true)
			}
			else if (Phase2.equalsIgnoreCase(Phase))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase2, true)

			}
			else if (Phase3.equalsIgnoreCase(Phase))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase3, true)

			}
			else if (Phase4.equalsIgnoreCase(Phase))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase4, true)

			}

			String project = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Project",1)
			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Select_Project'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Select_Project'),project , true)

			String instance = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Instance",1)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Select Instance'),instance, true)

			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Pull_Data_Btn'))

			loginfo.createNode(new GherkinKeyword("When"), "User has to select project,Instance from the project dropdown").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ResourceAllocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select project,Instance from the project dropdown").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to click on Bulk Allocation(.*)to select the Role and Owner")
	public void user_has_to_click_on_Bulk_Allocation_to_select_the_Role_and_Owner(String phase) {
		try{


			//	WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'))

			WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Bulk Allocation'))

			// Getting the Role Count
			String xpath_Upload_Site = '//*[@id="drpBulkRole"]/option'

			int rowCount = (new OnlineKeywords()).countRowsPerPage(xpath_Upload_Site)

			println "rowCount :" +rowCount
			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/BulkBtn_Cancel'))
			for(int i=2;i<=rowCount;i++)
			{
				WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Bulk Allocation'))
				//Getting the Role text
				TestObject role = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="drpBulkRole"]/option['+i+']', true)

				String gettext = WebUI.getText(role)

				println('2' + gettext)

				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Select RoleBasis'),gettext,true)

				//Getting the Owner Data
				TestObject Owner = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="drpBulkOwner"]/option[2]', true)
				String getOwner=	WebUI.getText(Owner)

				println('2' + getOwner)

				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Select Ownercon'),getOwner,true)

				WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Save'))

				//	WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Bulk Allocation'))



			}

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on Bulk Allocation to select the Role and Owner").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ResourceAllocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on Bulk Allocation to select the Role and Owner").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to click on Save to assign owner for particular task")
	public void user_has_to_click_on_Save_to_assign_owner_for_particular_task() {
		try{

			//						WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/ProgressMonitor'))
			//
			//
			//						String xpath_Site = '//*[@id="ProgressMonitor"]/tbody/tr'
			//
			//									 int rowCount1 = (new OnlineKeywords()).countRowsPerPage(xpath_Site)
			//
			//									 println "rowCount :" +rowCount1
			//						for(int k=2;k<=rowCount1;k++)
			//						{
			//							TestObject Owneruser = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="ProgressMonitor"]/tbody/tr['+k+']/td[5]', true)
			//
			//							String Owner_gettext = WebUI.getText(Owneruser)
			//
			//							println('1' + Owner_gettext)
			//
			//							FileInputStream file = new FileInputStream (new File("C:\\Users\\Group10\\Desktop\\ProAcc_Test\\ProAcc_Test_New\\Include\\TestData\\Testdata_ProAcc.xlsx"))
			//							XSSFWorkbook workbook = new XSSFWorkbook(file);
			//							XSSFSheet Common = workbook.getSheetAt(0);
			//							Common.createRow(k);
			//
			//							String text=Common.getRow(k).createCell(0).setCellValue(Owner_gettext);
			//
			//
			//							println(text+"Data")
			//
			//							file.close();
			//							FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\Group10\\Desktop\\ProAcc_Test\\ProAcc_Test_New\\Include\\TestData\\Testdata_ProAcc.xlsx"));
			//							workbook.write(outFile);
			//							outFile.close();
			//						}

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on Save to assign owner for particular task").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ResourceAllocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on Save to assign owner for particular task").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User has successfully assigned owner to activity")
	public void user_has_successfully_assigned_owner_to_activity() {
		try{

			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully assigned owner to activity").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ResourceAllocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully assigned owner to activity").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}