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
import com.kms.katalon.core.configuration.RunConfiguration

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

WebUI.openBrowser("")
WebUI.maximizeWindow()
WebUI.delay(5)
WebUI.navigateToUrl("http://123.176.34.15:4041/PROACC2QA/")
WebUI.delay(30)

   //TestObject Role = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="drpBulkRole"]/option', true)
 //			println "Role"+Role
 	TestObject Role = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/BulkOption_Count'))
   println "Role"+ Role

 for(int i=1;i<=Role;i++)
 {
	 //	i=2;i<=Bulkrolecount;i++

	 WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Bulk Allocation'))

	 String role = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Roles",i)
	 WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Select RoleBasis'),role, true)

	 //Include Directly //*[@id="drpBulkOwner"]/option[2]

	 String owner = findTestData("Data Files/ProAcc_PM/ResourceAllocation_TestData").getValue("Owner",i)
	 WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/Select Ownercon'),owner, true)

	 WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Save'))

 }