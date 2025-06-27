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

'Inputs the password into the password field.\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ItemOptix/input_Password_password'), 'tWxl1kWNWe5UF/Fu3hzFEQ==')

'Clicks Login to authenticate and sign in.\n'
WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

'Opens the MasterTagTest account from the main menu.\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_mastertagtest'))

'Clicks the Configurations (gear) icon to open the configuration menu.\n\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Configurations_w-8 h-8 cursor-pointer h_74c1d5'))

'Selects the Horticulture category in the configuration list.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Horticulture'))

'Confirms the Horticulture selection by clicking Ok.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Ok'))

'Navigates to the Tagging module.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Tagging'))

'Opens the sites submenu to view related options\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Orders_transition-transform duration-20_e88ee6'))

'Selects the IO_FARM_510  site farm entry from the list.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_IO_FARM_510'))

'Expands the All filter dropdown to show all tagging categories.\r\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_All_lucide lucide-chevron-down h-4 w-4 _229285'))

'Checks the All checkbox to include every category in the report.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_All_lucide lucide-check w-5 h-4 rounded_908e97'))

'Opens the Inventory filter to narrow results to inventory tags.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/label_Inventory'))

'Applies the Inventory filter selection.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/label_Inventory'))

'Opens the Display settings to configure what’s shown in the report.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/label_Display'))

'Expands the Items Tagged node in the tree view.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Items Tagged_ag-icon ag-icon-tree-closed'))

'Expands the Apr, 2025 subtree under Items Tagged.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Apr, 2025_ag-icon ag-icon-tree-closed'))

'Selects Apr 1, 2025 to filter tags by that specific date.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Apr 1, 2025'))

'Toggles the Apr, 2025 node (collapse/expand) to refresh the view.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Apr, 2025_ag-icon ag-icon-tree-open'))

'Re-expands the Items Tagged node to ensure visibility.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Items Tagged_ag-icon ag-icon-tree-open'))

'Selects Apr, 2025 again to confirm the date filter.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Apr, 2025'))

'Chooses Receiving_Area_510_1 from the Locations dropdown to filter by that area.\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_All LocationsReceiving_Area_510_1510_e5b529'), 
    'Receiving_Area_510_1', true)

'Chooses 510_Assembly from the Locations dropdown to include assembly tags.\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_All LocationsReceiving_Area_510_1510_e5b529'), 
    '510_Assembly', true)

'Clicks Show Card View to switch the tagging report into card layout.\n\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Show Card View'))

'Switches the tagging report from card view into table view.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Show Table View'))

'Selects All in the Locations dropdown to include every area in the report.\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_All LocationsReceiving_Area_510_1510_e5b529'), 
    'all', true)

'Expands the Last 90 days date-filter menu.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Last 90 days_lucide lucide-chevron-down_9f14ac'))

'Chooses the Last 30 days preset in the date filter.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 30 days'))

'Confirms selection of the Last 30 days date range.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Last 30 days'))

'Chooses the Last 7 days preset in the date filter.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Last 7 days'))

'Confirms selection of the Last 7 days date range.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/span_Last 7 days'))

'Opens the custom date-range picker.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Custom Range'))

'Selects day 20 as the start date in the custom range.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_20'))

'Selects day 21 as the end date in the custom range.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_21'))

'Applies the custom date range to filter the report.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Apply'))

'Clicks outside the calendar to close the date-picker overlay.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/path'))

'Clicks Download as Excel to export the report data.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Download as Excel'))

'Clears all currently applied filters from the report.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Clear Filters_p-1.5 rounded-md hover_8f74d8'))

'Opens the column-selection panel to choose which columns to display.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Select the necessary column header for _75e041'))

'Toggles the SKU column on.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_SKU_absolute w-4 h-4 border-2 border-te_ca6cda'))

'Toggles the Product Name column on.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Product Name_absolute w-4 h-4 border-2 _55c55a'))

'Toggles the Number of Items column on.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_No Of Items_absolute w-4 h-4 border-2 b_ffb8ad'))

'Toggles the Tag Type column on.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Tag Type_absolute w-4 h-4 border-2 bord_44ef3e'))

'Toggles the Location column on.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Location_absolute w-4 h-4 border-2 bord_137dcb'))

'Toggles the User column on.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_User_absolute w-4 h-4 border-2 border-t_c34837'))

'Closes the column-selection panel.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/svg_Attribute Selection_lucide lucide-x h-5 w-5'))

'Closes the browser and ends the test session.\n\n\n\n\n\n\n\n\n\n'
WebUI.closeBrowser()

