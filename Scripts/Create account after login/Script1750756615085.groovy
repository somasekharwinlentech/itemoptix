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

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Username_username'), 'CSATestUser')

WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ItemOptix/input_Password_password'), 'tWxl1kWNWe5UF/Fu3hzFEQ==')

WebUI.click(findTestObject('Object Repository/Page_ItemOptix/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Create'))

WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Account Details'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__accountName'), Account Name)

WebUI.click(findTestObject('Object Repository/Page_itemOptix/input_Store Inventory Management_mr-3'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__accountGroup'), Account Group)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__organization'), Organization)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select a packageTrialPilotProduction'), 
    'trial', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select term15 Days30 Days'), '15', true)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__realm'), '')

WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__realm'))

WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__realm'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__country'), Country)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select a packageEssentialEssential, _f74aa2'), 
    'essential', true)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Customer Name_customerName'), Customer Name)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Customer Address_customerAddress'), Customer Address)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Customer Contact Number_customerConta_e05134'), Customer ContactNumber)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Customer Email_customerEmail'), Customer Email)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__realm'), '')

WebUI.rightClick(findTestObject('Object Repository/Page_itemOptix/input__realm'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__realm'), 'ItemOptixP2')

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__dbPrefix'), '')

WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__dbPrefix'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__dbPrefix'), 'mongodb://127.0.0.1:27017')

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_DB AuthSource_dbAuthSource'), '')

WebUI.click(findTestObject('Object Repository/Page_itemOptix/input_DB AuthSource_dbAuthSource'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_DB AuthSource_dbAuthSource'), '?authSource=admin')

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__keyCloakUrl'), '')

WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__keyCloakUrl'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input__keyCloakUrl'), 'https://iammaster.winlen.us')

WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Setup Details'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Store Count_storeCount'), Store Count)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select device typeAndroidiOS'), 'android', 
    true)

WebUI.rightClick(findTestObject('Object Repository/Page_itemOptix/input_RFID Handheld Model(s)_rfidHandheldModels'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_RFID Handheld Model(s)_rfidHandheldModels'), 'e.g., Zebra RFD40 Standard')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select authentication typeSimpleSAMLADFS'), 
    'simple', true)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Average Inventory Sizestore_avgInventorySize'), Average InventorySize)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Mobile Device Model(s)_mobileDeviceModels'), 'e.g., Zebra TC52')

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Number of Devices Per Store_devicesPerStore'), NoofDevicesperStore)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Active User Roles_activeUserRoles'), ActiveUserRoles)

WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Admin Details'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Checkpoint ERP Account ID_checkpointErpId'), Checkpoint ERP)

WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__sowSigned'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_itemOptix/select_Select account typeMASPARTNER'), 'mas', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Checkpoint Sales Channel_checkpointSa_8d8597'), 'win')

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_RFID Label Supplier_rfidLabelSupplier'), 'win')

WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__gdprCompliant'))

WebUI.click(findTestObject('Object Repository/Page_itemOptix/input__ndaSigned'))

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Request Created By_requestCreatedBy'), 'admin')

WebUI.setText(findTestObject('Object Repository/Page_itemOptix/input_Last Edited By_lastEditedBy'), Last EditedBy)

WebUI.click(findTestObject('Object Repository/Page_itemOptix/button_Create_1'))

WebUI.closeBrowser()

