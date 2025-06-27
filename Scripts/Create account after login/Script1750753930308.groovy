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

'Maximizes the browser window for full visibility of all elements.\n'
WebUI.maximizeWindow()

'Navigates to the application’s login page at https://itemoptixv2qa.winlen.us/login.\n'
WebUI.navigateToUrl('https://itemoptixv2qa.winlen.us/login')

'Enters the username (“CSATestUser”) into the username input field.\n'
WebUI.setText(findTestObject('Object Repository/Object Repository/input_Username_username'), 'CSATestUser')

'Clicks the Next button to advance to the password entry screen.\n'
WebUI.click(findTestObject('Object Repository/Object Repository/button_Next'))

'Inputs the password into the password field.'
WebUI.setEncryptedText(findTestObject('Object Repository/Object Repository/input_Password_password'), 'tWxl1kWNWe5UF/Fu3hzFEQ==')

'Clicks the Login button to authenticate and sign in.\n'
WebUI.click(findTestObject('Object Repository/Object Repository/input_Password_login'))

'Clicks Create to open the new-account form.\n'
WebUI.click(findTestObject('Page_itemOptix/button_Create'))

'Enters the new account’s name (e.g. “winwin”).\n\r\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__accountName'), 'winwin')

'Enters the account group identifier (e.g. “W”).\n\r\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__accountGroup'), 'W')

'Waits up to 10s for the “Store Inventory” checkbox to become clickable.\n'
WebUI.waitForElementClickable(findTestObject('Page_itemOptix/label_StoreInventory'), 10)

'Selects the Store Inventory checkbox'
WebUI.click(findTestObject('Page_itemOptix/label_StoreInventory'))

'Enters the organization name (e.g. “AFCDIGITAL”).\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__organization'), 'AFCDIGITAL')

'Enters the country (e.g. “INDIA”).\n\r\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__country'), 'INDIA')

'Chooses the Trial package from the dropdown.\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select a packageTrialPilotProduction'), 
    'trial', true)

'Chooses 30 days as the trial term.\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select term15 Days30 Days'), '30', true)

'Sends Enter to confirm the default realm field.\n'
WebUI.sendKeys(findTestObject('Object Repository/Page_itemOptix/input__realm'), Keys.chord(Keys.ENTER))

'Enters the realm identifier (e.g. “ItemOptixP2”).\n\r\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__realm'), 'ItemOptixP2')

'Enters the MongoDB connection URI (e.g. mongodb://127.0.0.1:27017).\n\r\n\t'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__dbPrefix'), 'mongodb://127.0.0.1:27017')

'Clears or initializes the AuthSource field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_DB AuthSource_dbAuthSource'), '')

'clicks the AuthSource field.'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/input_DB AuthSource_dbAuthSource'))

'Appends the ?authSource=admin parameter.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_DB AuthSource_dbAuthSource'), '?authSource=admin')

'Initializes the Keycloak URL field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__keyCloakUrl'), '')

'clicks the Keycloak URL field.'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__keyCloakUrl'))

'Enters the Keycloak base URL (e.g. https://iammaster.winlen.us).\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__keyCloakUrl'), 'https://iammaster.winlen.us')

'Switches to the Essential package plan.\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select a packageEssentialEssential, _f74aa2'), 
    'essential', true)

'Enters the customer’s name (e.g. “winlen”).\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Customer Name_customerName'), 'winlen')

'Enters the customer’s address (e.g. “hyd”).\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Customer Address_customerAddress'), 'hyd')

'Enters the customer’s contact number (e.g. “123456789”).\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Customer Contact Number_customerConta_e05134'), '123456789')

'Enters the customer’s email (e.g. “winlen@crux.com”).\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Customer Email_customerEmail'), 'winlen@crux.com')

'Clicks Setup Details to move to the store-setup section.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Setup Details'))

'Enters the number of stores to create (e.g. “1”).\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Store Count_storeCount'), '1')

'Chooses Android as the device type for the handheld.\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select device typeAndroidiOS'), 'android', 
    true)

'Clicks the RFID Handheld Model(s) field.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/input_RFID Handheld Model(s)_rfidHandheldModels'))

'Enters the RFID handheld model (e.g. “Zebra RFID40 Standard”).\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_RFID Handheld Model(s)_rfidHandheldModels'), 'Zebra RFD40 Standard')

'Selects Simple as the authentication type.\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select authentication typeSimpleSAMLADFS'), 
    'simple', true)

'Clicks the RFID Handheld Model(s) field to confirm the selection.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/input_RFID Handheld Model(s)_rfidHandheldModels'))

'Enters “22” into the Average Inventory Size field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Average Inventory Sizestore_avgInventorySize'), '22')

'Enters the Mobile Device Model (e.g., “Zebra TC52”).\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Mobile Device Model(s)_mobileDeviceModels'), 'e.g., Zebra TC52')

'Enters “1” as the Number of Devices Per Store.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Number of Devices Per Store_devicesPerStore'), '1')

'Enters “2” as the Active User Roles count.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Active User Roles_activeUserRoles'), '2')

'Clicks Admin Details to expand the admin-details section.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Admin Details'))

'Enters “crux” into the Checkpoint ERP Account ID field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Checkpoint ERP Account ID_checkpointErpId'), 'crux')

'Selects the Account Type (e.g., “mas”) from the dropdown.\n'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select account typeMASPARTNER'), 'mas', 
    true)

'Enters “1” into the RFID Label Supplier field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_RFID Label Supplier_rfidLabelSupplier'), '1')

'Clicks the Checkpoint ERP Account ID field again to confirm.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/div_Checkpoint ERP Account IDAccount Type S_f550c2'))

'Clicks the NDA Signed checkbox to mark the NDA as signed.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__ndaSigned'))

'Enters “admin” into the Request Created By field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Request Created By_requestCreatedBy'), 'admin')

'Enters “Admin” into the Last Edited By field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Last Edited By_lastEditedBy'), 'Admin')

'Enters “12” into the Checkpoint Sales Channel field.\n'
WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Checkpoint Sales Channel_checkpointSa_8d8597'), '12')

'Clicks the SOW Signed checkbox to mark the statement-of-work agreement.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__sowSigned'))

'Clicks the GDPR Compliant checkbox to mark GDPR compliance.\n'
WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__gdprCompliant'))

'Clicks Account Details to expand the account-details section.\r\n'
WebUI.click(findTestObject('Page_itemOptix/button_Account Details'))

WebUI.closeBrowser()

