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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.chrome.ChromeDriver;
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

import projectKeywords.OnlineKeywords


WebUI.openBrowser("")
WebUI.maximizeWindow()

 

String url = 'http://123.176.34.15:4041/PROACC2QA/'
WebUI.navigateToUrl(url)
WebUI.delay(20)
String xpath_Upload_Site = '  //*[@id="UserTable"]/tbody/tr/td/span[2]'
 
			 int rowCount = (new OnlineKeywords()).countRowsPerPage(xpath_Upload_Site)
			 println(rowCount)
			 
for(int i=1;i<=4;i++)
	{
		
String User = findTestData("Data Files/ProAcc_Admin/Users_TestData").getValue("Names",i)

							
for(i=1;i<=rowCount-1;i++)
{                                                                                   
    TestObject task1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="UserTable"]/tbody/tr['+i+']/td[1]/span', true)
     WebUI.delay(1)
     
String task=WebUI.getText(task1)
println(task)
if(User==task) {
    TestObject delete = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="UserTable"]/tbody/tr['+i+']/td[9]/span[2]', true)
    WebUI.click(delete)
			WebUI.click(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Pull_Data_Btn'))
    }
   
	}
	
	}