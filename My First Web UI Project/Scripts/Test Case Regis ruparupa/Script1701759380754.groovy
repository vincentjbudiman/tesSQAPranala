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

WebUI.navigateToUrl('https://www.ruparupa.com/auth/register')

WebUI.setText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_identifier'), '85966395855')

WebUI.sendKeys(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_identifier'), 
    Keys.chord(Keys.ENTER))

WebUI.mouseOver(findTestObject('Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/button_scroll'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/button_scroll'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input__main_square-check__3a3WX'))

WebUI.click(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/button_Lanjutkan'))

WebUI.setText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_name'), 'Vincent Jonathan Budiman')

WebUI.setText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_email'), 'vinbud777@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_password'), 
    'WB9ozVMLiiM+Pb99f3lJMA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_confirmPassword'), 
    'WB9ozVMLiiM+Pb99f3lJMA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_pin'), 
    'KnRvK4IJrqM=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_pinConfirm'), 
    'KnRvK4IJrqM=')

WebUI.sendKeys(findTestObject('Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_pinConfirm'), Keys.chord(Keys.ENTER))

WebUI.verifyEqual(WebUI.getUrl(), "https://www.ruparupa.com/auth/otp-verification?action=verify-phone&is_activate=false&is_login_legacy=false")
