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

'Launches a new browser instance to begin the test.'
WebUI.openBrowser('')

'Maximizes the browser window so all page elements are fully visible.\n\n'
WebUI.maximizeWindow()

'Goes to the application’s login page at https://itemoptixv2qa.winlen.us/log.\n\n'
WebUI.navigateToUrl('https://itemoptixv2qa.winlen.us/login')

'Enters the username (CSATestUser) into the username field.\n\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Username_username'), 'CSATestUser')

'Clicks the Next button to move to the password screen.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Next'))

'Inputs the password into the password field.'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ItemOptix/input_Password_password'), 'tWxl1kWNWe5UF/Fu3hzFEQ==')

'Clicks the Login button to authenticate and log in.\n\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

'Navigated to Div MasterTagtest\r\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_mastertagtest'))

'select and open MastertagTest Account ID'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Configurations_w-8 h-8 cursor-pointer h_74c1d5'))

'Selects the Horticulture category in the configurations list.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Horticulture'))

'Confirms the selection by clicking Ok.\n\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Ok'))

'Navigates to the Tagging module.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Tagging'))

'Opens the site selection to view related options.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Orders_transition-transform duration-20_e88ee6'))

'Selects the IO_FARM_510 site entry from the list.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_IO_FARM_510'))

'Switches to the Tasks tab'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Tasks'))

'Opens the date-filter dropdown by clicking Last 90 days.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Last 90 days'))

'Chooses Last 7 days to filter tasks in the past week.\n\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 7 days_1'))

'Expands the Last 7 days dropdown arrow for additional options.\n\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Last 7 days_lucide lucide-chevron-down _c68dda'))

'Selects Last 30 days to view tasks from the past month.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 30 days_1'))

'Expands the Last 30 days dropdown arrow.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Last 30 days_lucide lucide-chevron-down_585b96'))

'Re-selects Last 90 days to reset the date filter.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 90 days'))

'Expands the Last 90 days dropdown arrow for more controls.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Last 90 days_lucide lucide-chevron-down_9f14ac'))

'Clicks Schedule Tasks to open the task-scheduling dialog.\n\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Schedule Tasks'))

'Clicks Create Task to start defining a new task.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Create Task'))

'Types the task name (prior) into the Name field.\n\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Name_w-full px-3 py-2 border-b border_53872a_1_2_3_4_5'), 
    'prior')

'Sets Priority to Normal in the priority dropdown.\n\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select PriorityNormalCritical'), 'MEDIUM', 
    true)

'Sets Task Type to Free Form in the task-type dropdown.\n\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select Task TypeCountingRestockTrack_f6a1e0'), 
    'Free Form', true)

'Clicks Next to proceed to the subsequent task-creation step.\n\n\n\n\n\n\n\n\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Next_1'))

'Enters “1” into the Validity Time field (sets task validity to 1 hour).\n\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Valid for (1-24 hrs)_validityTime'), '1')

'Clicks the Next button to review task details before creation.\n\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Next_1'))

'Clicks the Create button to finalize and submit the new task.\n\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Create'))

'Clicks Ok on the confirmation dialog to acknowledge successful creation.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Ok'))

'Closes the browser and ends the test session.\n\n\n\n\n\n\n\n\n\n'
WebUI.closeBrowser()

