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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://123.176.34.15:4041/PROACC2QA/')

WebUI.delay(35)

            String Phase1 = "Assessment"
			String Phase2 = "Pre Conversion"
			String Phase3 = "Conversion"
			String Phase4 = "Post-Conversion"
			
		//	println ("Test"+phase)

			if (Phase1.equalsIgnoreCase("Aent"))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase1, true)
				WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Bulk Allocation'))
				
			}
			else if (Phase2.equalsIgnoreCase("Pre Conversion"))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase2, true)
				WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Bulk Allocation'))
				

			}
			else if (Phase3.equalsIgnoreCase("Prsion"))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase3, true)
				WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Bulk Allocation'))
				

			}
			else if (Phase4.equalsIgnoreCase("nversion"))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ProAcc_Pm/ProAcc_ResourceAllocation/PhaseName'),Phase4, true)
				WebUI.click(findTestObject('ProAcc_Pm/ProAcc_ResourceAllocation/button_Bulk Allocation'))
				

			}
WebUI.closeBrowser()

