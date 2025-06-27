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

'Launches a new browser session.\r\n\r\n'
WebUI.openBrowser('')

'Goes to the ItemOptix login page at https://itemoptixv2qa.winlen.us/login.\n'
WebUI.navigateToUrl('https://itemoptixv2qa.winlen.us/login')

'Maximizes the browser window for full visibility.\n'
WebUI.maximizeWindow()

'Focuses and clicks the username input field.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/input_Username_username'))

'Enters the username (CSATestUser) into the username field.\n'
WebUI.setText(findTestObject('Object Repository/New Folder/Page_itemOptix/input_Username_username'), 'CSATestUser')

'Clicks Next to advance to the password screen.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Next'))

' inputs the stored password.'
WebUI.setEncryptedText(findTestObject('Object Repository/New Folder/Page_ItemOptix/input_Password_password'), 'tWxl1kWNWe5UF/Fu3hzFEQ==')

'Clicks Login to authenticate and sign in.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_ItemOptix/input_Password_login'))

'Opens the main “i3io” navigation menu.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/div_l3io'))

'Selects Sites to manage site configurations.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Sites'))

'Clicks Upload to begin the product-upload process.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Upload'))

'Opens the Setup section for onboarding configurations.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Setup'))

'Views the organizational Hierarchy.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Hierarchy'))

'Expands the View option within Hierarchy.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_View'))

'Navigates to Users to manage user accounts.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Users'))

'Clicks Create to add a new user.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Create'))

'Clicks the Create User icon to open the user-creation form.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/svg_Create User_lucide lucide-x'))

'Opens Uploads to review past uploads.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Uploads'))

'Navigates to Roles to assign permissions.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Roles'))

'Goes to Products to manage catalog items.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Products'))

'Clicks Upload within Products to add new items.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Upload'))

'Views the newly uploaded products.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_View_1'))

'Opens Stock Targets to configure restock thresholds.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Stock Targets'))

'Navigates to Configurations for system settings.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Configurations'))

'Opens App Config to adjust application parameters.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_App Config'))

'Clicks Report Config to customize report options.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Report Config'))

'Opens the Task Scheduler to set up automated jobs.\n'
WebUI.click(findTestObject('Object Repository/New Folder/Page_itemOptix/button_Task Scheduler'))

'Closes the browser and ends the test session.\n\n\n\n\n\n\n\n\n\n'
WebUI.closeBrowser()

