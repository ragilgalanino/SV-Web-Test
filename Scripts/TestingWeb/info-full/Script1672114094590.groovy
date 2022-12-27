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

WebUI.setText(findTestObject('Object Repository/info/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/info/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/info/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('info/Page_OrangeHRM/My Info'))

WebUI.delay(0.5)

WebUI.verifyElementText(findTestObject('info/Page_OrangeHRM/h6_Personal Details'), 'Personal Details')

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/info/Page_OrangeHRM/input_Employee Full Name_firstName'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/info/Page_OrangeHRM/input_Employee Full Name_firstName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/info/Page_OrangeHRM/input_Employee Full Name_firstName'), 'nino')

WebUI.sendKeys(findTestObject('Object Repository/info/Page_OrangeHRM/input_Employee Full Name_middleName'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/info/Page_OrangeHRM/input_Employee Full Name_middleName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/info/Page_OrangeHRM/input_Employee Full Name_middleName'), 'jons')

WebUI.sendKeys(findTestObject('Object Repository/info/Page_OrangeHRM/input_Employee Full Name_lastName'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/info/Page_OrangeHRM/input_Employee Full Name_lastName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/info/Page_OrangeHRM/input_Employee Full Name_lastName'), 'ranti')

WebUI.click(findTestObject('info/Page_OrangeHRM/nickname'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/nickname'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/nickname'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/nickname'), 'Ranti In The Sky')

WebUI.click(findTestObject('info/Page_OrangeHRM/field-employ'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/field-employ'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/field-employ'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/field-employ'), '7799')

WebUI.click(findTestObject('info/Page_OrangeHRM/pther-id_field'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/pther-id_field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/pther-id_field'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/pther-id_field'), '9977')

WebUI.click(findTestObject('info/Page_OrangeHRM/DriverL'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/DriverL'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/DriverL'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/DriverL'), '14045')

WebUI.click(findTestObject('info/Page_OrangeHRM/kalender'))

WebUI.click(findTestObject('info/Page_OrangeHRM/tanggal15'))

WebUI.click(findTestObject('info/Page_OrangeHRM/ssn_number'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/ssn_number'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/ssn_number'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/ssn_number'), '5555')

WebUI.click(findTestObject('info/Page_OrangeHRM/sin_number'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/sin_number'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/sin_number'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/sin_number'), '7777')

WebUI.click(findTestObject('info/Page_OrangeHRM/negara'))

WebUI.click(findTestObject('info/Page_OrangeHRM/div_Indonesian'))

WebUI.click(findTestObject('info/Page_OrangeHRM/status'))

WebUI.click(findTestObject('info/Page_OrangeHRM/div_Single'))

WebUI.click(findTestObject('info/Page_OrangeHRM/ultah'))

WebUI.click(findTestObject('info/Page_OrangeHRM/tahun-ultah'))

WebUI.click(findTestObject('info/Page_OrangeHRM/li_1990'))

WebUI.click(findTestObject('info/Page_OrangeHRM/bulan-ultah'))

WebUI.click(findTestObject('info/Page_OrangeHRM/li_April'))

WebUI.click(findTestObject('info/Page_OrangeHRM/div_14'))

WebUI.scrollToPosition(500, 500)

WebUI.click(findTestObject('info/Page_OrangeHRM/gender'))

WebUI.click(findTestObject('info/Page_OrangeHRM/military'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/military'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/military'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/military'), 'None')

WebUI.click(findTestObject('Object Repository/info/Page_OrangeHRM/i_Yes_oxd-icon bi-check oxd-checkbox-input-icon'))

WebUI.click(findTestObject('Object Repository/info/Page_OrangeHRM/button_Save'))

WebUI.verifyElementText(findTestObject('info/Page_OrangeHRM/p_Successfully_Updated_info'), 'Successfully Updated')

WebUI.click(findTestObject('info/Page_OrangeHRM/goldar'))

WebUI.click(findTestObject('info/Page_OrangeHRM/div_O'))

WebUI.click(findTestObject('info/Page_OrangeHRM/save-goldar'))

WebUI.verifyElementText(findTestObject('info/Page_OrangeHRM/p_Successfully_Saved_goldar'), 'Successfully Saved')

WebUI.click(findTestObject('info/Page_OrangeHRM/add-att'))

//WebUI.click(findTestObject('info/Page_OrangeHRM/div_Browse'))
//WebUI.uploadFile(findTestObject('info/Page_OrangeHRM/div_Browse'), 'D:\\test.txt')
//WebUI.delay(3)
WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('info/Page_OrangeHRM/a_Contact Details'))

WebUI.click(findTestObject('info/Page_OrangeHRM/street1'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/street1'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/street1'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/street1'), 'jl. jadi terus')

WebUI.click(findTestObject('info/Page_OrangeHRM/Street2'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/Street2'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/Street2'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/Street2'), 'RT RW')

WebUI.click(findTestObject('info/Page_OrangeHRM/kota'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/kota'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/kota'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/kota'), 'Manchester United')

WebUI.click(findTestObject('info/Page_OrangeHRM/state'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/state'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/state'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/state'), 'Bojong Sari')

WebUI.click(findTestObject('info/Page_OrangeHRM/kodepos'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/kodepos'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/kodepos'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/kodepos'), '1978')

WebUI.click(findTestObject('info/Page_OrangeHRM/panahnegara'))

WebUI.click(findTestObject('info/Page_OrangeHRM/negara_indo'))

WebUI.click(findTestObject('info/Page_OrangeHRM/no_rumah'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/no_rumah'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/no_rumah'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/no_rumah'), '0888877766')

WebUI.click(findTestObject('info/Page_OrangeHRM/no_hp'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/no_hp'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/no_hp'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/no_hp'), '0888888888')

WebUI.click(findTestObject('info/Page_OrangeHRM/no_kantor'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/no_kantor'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/no_kantor'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/no_kantor'), '112-898-7612')

WebUI.scrollToPosition(999999, 999999)

WebUI.click(findTestObject('info/Page_OrangeHRM/email_kantor'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/email_kantor'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/email_kantor'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/email_kantor'), 'Ranti@gmail.com')

WebUI.click(findTestObject('info/Page_OrangeHRM/email_lain'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/email_lain'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('info/Page_OrangeHRM/email_lain'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('info/Page_OrangeHRM/email_lain'), 'rantiInTheSky@yahoo.com')

WebUI.click(findTestObject('info/Page_OrangeHRM/button_Save_kontak'))

WebUI.click(findTestObject('info/Page_OrangeHRM/button_Save_kontak'))

