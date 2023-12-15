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

WebUI.setText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_identifier'), '85772902501')

WebUI.sendKeys(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_identifier'), 
    Keys.chord(Keys.ENTER))

WebUI.mouseOver(findTestObject('Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/button_scroll'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/button_scroll'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input__main_square-check__3a3WX'))

WebUI.click(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/button_Lanjutkan'))

// Pilih skenario test case negatif (ganti dengan skenario negatif yang diinginkan)
// Contoh: Email salah
WebUI.setText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_name'), 'Vincent Jonathan Budiman')

WebUI.setText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_email'), 'email_salah' // Ganti dengan email yang salah
    )

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_password'), 
    '8SQVv/p9jVR0UOrKCEogRg==' // Ganti dengan password yang salah
    )

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_confirmPassword'), 
    '8SQVv/p9jVR0UOrKCEogRg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_pin'), 
    'SFTQUhjBfIY=' // Ganti dengan PIN yang salah
    )

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_pinConfirm'), 
    'SFTQUhjBfIY=')

WebUI.sendKeys(findTestObject('Page_ruparupa Solusi Kebutuhan Rumah Terlen_7cb821/input_pinConfirm'), Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/EmailnoValid'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/passnovalid'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_ruparupa Solusi Kebutuhan Rumah Terlengkap  Berkualitas/pinnovalid'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

