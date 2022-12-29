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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Negative/Page_OrangeHRM/span_Required_login'), 'Required')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Negative/Page_OrangeHRM/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Negative/Page_OrangeHRM/span_Required_pass'), 'Required')

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Negative/Page_OrangeHRM/input_Username_username'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Negative/Page_OrangeHRM/input_Username_username'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Negative/Page_OrangeHRM/input_Password_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Negative/Page_OrangeHRM/span_Required_login'), 'Required')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Negative/Page_OrangeHRM/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Username_username'), 'Salah')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Negative/Page_OrangeHRM/p_Invalid credentials'), 'Invalid credentials')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.click(findTestObject('Negative/Page_OrangeHRM/input_Password_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/admin-new/Page_OrangeHRM/input_Password_password'), 
    '0fPupERWD/I=')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Negative/Page_OrangeHRM/p_Invalid credentials'), 'Invalid credentials')

WebUI.takeScreenshot()
