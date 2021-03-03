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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://123.176.34.15:4041/PROACC2QA/')

WebUI.setText(findTestObject('null'), 
    'sainath')

WebUI.setEncryptedText(findTestObject('null'), 
    '/BEG0lmIiA4=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/span_PM'))

WebUI.click(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/a_Click'))

WebUI.selectOptionByValue(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/select_Select Project'), 
    '361fb8ad-cad0-45ca-af08-d4bb5230feeb', true)

WebUI.click(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/i_Yet To Start_EditPMtask'))

WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/input_EST Hours HHMM_txtEst'), 
    '2:00')

WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/input_Actual Hours HHMM_txtAct'), 
    '2:00')

WebUI.selectOptionByValue(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/select_CompletedWork In ProgressNot Applica_e58779'), 
    '1', true)

WebUI.setText(findTestObject('ProAcc_Pm/ProAcc_PmTaskMonitor/input_Comments_txtPMTaskComments'), 
    'Test')

