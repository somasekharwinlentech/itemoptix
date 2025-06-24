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

WebUI.navigateToUrl('https://itemoptixv2qa.winlen.us/login')

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Username_username'), 'CSATestuser')

WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ItemOptix/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

WebUI.setText(findTestObject('Object Repository/Page_ItemOptix/input_Username_username (1)'), 'CSATestUser')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ItemOptix/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

WebUI.setText(findTestObject('Object Repository/Page_ItemOptix/input_Username_username (1)'), 'Csatestuser')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ItemOptix/input_Password_password'), 'tWxl1kWNWe5UF/Fu3hzFEQ==')

WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_CS'))

WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Logout'))

