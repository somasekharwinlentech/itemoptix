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

'Maximizes the browser window for full visibility.\n'
WebUI.maximizeWindow()

'Navigates to the ItemOptix login page at https://itemoptixv2qa.winlen.us/login.\n'
WebUI.navigateToUrl('https://itemoptixv2qa.winlen.us/login')

'Enters the username (“CSATestUser”) into the username field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Username_username'), 'CSATestUser')

'Clicks Next to advance to the password entry screen.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Next'))

'Inputs the password into the password field'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ItemOptix/input_Password_password'), 'tWxl1kWNWe5UF/Fu3hzFEQ==')

'Clicks Login to authenticate and sign in.\n'
WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

'Clicks Account Management to navigate to the account list.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Account Management'))

'Activates the grid’s column selector by clicking the “Drag here to set column labels” prompt.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Drag here to set column labels_ag-icon_9d49b7'))

'Clicks the loading overlay to dismiss it and ensure the grid is ready.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Loading.                               _5f308a'))

'Filters the grid by typing “master” into the column filter field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Loading_ag-57-input'), 'master')

'Selects the filtered “mastertagtest_1_2” account from the list.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_mastertagtest_1_2'))

'Clicks inside the grid rectangle to confirm the selection.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/rect'))

'Chooses the Horticulture category in the configuration.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Horticulture'))

'Acknowledges the “portal is facing some issues” alert message.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_The portal is facing some issues, pleas_5fdfcd'))

'Clicks Ok on the alert dialog to close it.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Ok'))

'Opens the Orders section to access order-related reports.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Orders_transition-transform duration-20_e88ee6'))

'Selects the IO_FARM_510 farm entry.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_IO_FARM_510'))

'Switches to the Counting tab to view inventory counts.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Counting'))

'Opens the Cycle Count History view.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Cycle Count History'))

'Filters the history to show only counts from Today.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Today'))

'Chooses Last 7 days in the date filter.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 7 days'))

'Confirms selection of the Last 7 days range.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Last 7 days'))

'Chooses Last 30 days in the date filter.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 30 days'))

'Confirms selection of the Last 30 days range.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 30 days_1'))

'Chooses Last 90 days in the date filter.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 90 days'))

'Clicks Display Count History to generate the report.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Display Count History'))

'Expands the Last 90 days dropdown for alternate date presets.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Last 90 days_lucide lucide-chevron-down_9f14ac'))

'Switches the filter back to Last 7 days.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 7 days_1'))

'Clicks Counts In Progress to view ongoing counts.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Counts In Progress'))

'Returns to the Counting tab.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Counting'))

'Refreshes the Count History view.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Display Count History'))

'Re-opens the Cycle Count History view for '
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Cycle Count History'))

'Clicks the Clear Filters icon to reset all applied filters.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Clear Filters_w-6 h-6 text-gray-500 fil_118da8'))

'Clicks Download as Excel to export the count history report.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Download as Excel'))

'Clicks outside the panel to close any open overlays.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/path'))

'Toggles the Cycle Count ID column on/off in the grid.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_CCID_w-10 h-6 border-2 border-teal-600 _a5d1cc'))

'Toggles the Count Cycle Type column on/off.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_CC Type_absolute w-4 h-4 border-2 borde_a712d9'))

'Toggles the Location column on/off.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Location_absolute w-4 h-4 border-2 bord_137dcb'))

'Toggles the Status column on/off.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Status_absolute w-4 h-4 border-2 border_7e5390'))

'Toggles the SKU Accuracy column on/off.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_SKU Accuracy_absolute w-4 h-4 border-2 _8d3ba4'))

'Toggles the Sellable Counted column on/off.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Sellable Counted_absolute w-4 h-4 borde_7695ea'))

'Toggles the Non-Sellable Counted column on/off.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Non Sellable Count_absolute w-4 h-4 bor_c4ab6e'))

'Toggles the Filter Name column on/off.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Filter Name_w-10 h-6 border-2 border-te_75159e'))

'Closes the column-selection panel.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Attribute Selection_lucide lucide-x h-5 w-5'))

'Closes all browser windows and ends the test session.\n\n\n\n\n\n\n\n\n\n'
WebUI.closeBrowser()

