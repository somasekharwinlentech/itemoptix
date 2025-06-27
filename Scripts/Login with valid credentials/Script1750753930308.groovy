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

'Launches a new browser instance to begin the test.\n'
WebUI.openBrowser('')

'Navigates to the application’s login page at https://itemoptixv2qa.winlen.us/login.\n'
WebUI.navigateToUrl('https://itemoptixv2qa.winlen.us/login')

'Maximizes the browser window for full visibility of all elements.\n\r\n'
WebUI.maximizeWindow()

'Enters the username (“CSATestUser”) into the username input field.\n'
WebUI.setText(findTestObject('Object Repository/input_Username_username'), 'CSATestUser')

'Clicks the Next button to advance to the password entry screen.\n'
WebUI.click(findTestObject('Object Repository/button_Next'))

'Inputs the  password into the password field.'
WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), 'tWxl1kWNWe5UF/Fu3hzFEQ==')

'Clicks the Login button to authenticate and sign in.\n'
WebUI.click(findTestObject('Object Repository/input_Password_login'))

'Clicks the CS menu item to navigate to the  module.\n'
WebUI.click(findTestObject('Object Repository/div_CS'))

'Clicks the Logout button to sign out of the application.\n'
WebUI.click(findTestObject('Object Repository/div_Logout'))

'Closes all browser windows and ends the test session.\n\n\n\n\n\n\n\n\n\n'
WebUI.closeBrowser()

