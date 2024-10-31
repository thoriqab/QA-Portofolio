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

WebUI.navigateToUrl(GlobalVariable.G_SiteURL)

WebUI.setText(findTestObject('Login_page/input_username'), 'amin')

WebUI.setEncryptedText(findTestObject('Login_page/input_password'), 'XTX4OnRbRqs=')

WebUI.click(findTestObject('Login_page/select_shift'))

WebUI.selectOptionByValue(findTestObject('Login_page/select_shift'), '2', false)

WebUI.click(findTestObject('Login_page/login_button'))

WebUI.getText(findTestObject('Login_page/alert_login1'))

WebUI.click(findTestObject('Login_page/button_'))

WebUI.click(findTestObject('Login_page/login_button'))

WebUI.getText(findTestObject('Login_page/alert_login1'))

WebUI.click(findTestObject('Login_page/button_'))

WebUI.click(findTestObject('Login_page/login_button'))

WebUI.getText(findTestObject('Login_page/alert_login1'))

WebUI.click(findTestObject('Login_page/button_'))

WebUI.click(findTestObject('Login_page/login_button'))

WebUI.getText(findTestObject('Login_page/alert_login'))

WebUI.click(findTestObject('Login_page/button_'))

WebUI.closeBrowser()

