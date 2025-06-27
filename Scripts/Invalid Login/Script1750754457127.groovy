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

'Maximizes the browser window for full visibility of all elements.\n'
WebUI.maximizeWindow()

'Enters the username (“CSATestUser”) into the username input field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Username_username'), 'CSATestuser')

'Clicks the Next button to advance to the password entry screen.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Next'))

'Inputs the invalid password into the password field.'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ItemOptix/input_Password_password'), 'aeHFOx8jV/A=')

'Clicks the Login button to attempt sign-in with the first invalid credentials.\n'
WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

'Clicks the Login button again to re-submit and verify the error handling.\n'
WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

'Clears and re-enters the same username (CSATestUser) for a second attempt.'
WebUI.setText(findTestObject('Object Repository/Page_ItemOptix/input_Username_username (1)'), 'CSATestUser')

'Re-inputs the invalid password into the password field.\n\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ItemOptix/input_Password_password'), 'aeHFOx8jV/A=')

'Clicks Login to submit the credentials again.\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

'Clicks Login a second time to ensure the login action is triggered.\n'
WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

'Enters a different invalid username (Csatester) to test an incorrect-username scenario.\n'
WebUI.setText(findTestObject('Object Repository/Page_ItemOptix/input_Username_username (1)'), 'Csatester')

'Closes the browser and ends the test session.\n\n\n\n\n\n\n\n\n'
WebUI.closeBrowser()

