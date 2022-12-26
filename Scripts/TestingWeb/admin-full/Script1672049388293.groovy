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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/button_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/div_-- Select -- Role'))

WebUI.click(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/div_Admin-role'))

WebUI.click(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/div_-- Select --Status'))

WebUI.click(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/div_Enabled-stat'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/div_Orange  Test'))

WebUI.click(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    'nino1234')

WebUI.click(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'))

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    'cQbiH8MMfim05xs3A0IMsw==')

WebUI.click(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'))

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 
    'cQbiH8MMfim05xs3A0IMsw==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/button_Save'))

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/p_Successfully Saved'), 'Successfully Saved')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus_1'), 
    'nino1234')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/i_Actions_oxd-icon bi-check oxd-checkbox-in_fe61ad'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/admin-new/Page_OrangeHRM/p_Successfully Deleted'), 'Successfully Deleted')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/span_akash hsn'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

