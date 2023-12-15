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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.setText(findTestObject('Object Repository/TC_03/Page_Register/input_signatory_first_name'), 'Vincent')

WebUI.setText(findTestObject('Object Repository/TC_03/Page_Register/input_signatory_last_name'), 'Jonathan Budiman')

WebUI.setText(findTestObject('Object Repository/TC_03/Page_Register/input_email'), 'vincentjbudiman@gmai.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_03/Page_Register/input_password'), '/t2jCDtzEnAlfbRkXtaa2Q==')

WebUI.setText(findTestObject('Object Repository/TC_03/Page_Register/input_name'), 'UMN')

WebUI.setText(findTestObject('Object Repository/TC_03/Page_Register/input_form-control btn-log border-grey int__5c974a'), 
    '22')

WebUI.click(findTestObject('TC_03/Page_Register/select_Your country                        _da403c'))

WebUI.click(findTestObject('TC_03/Page_Register/select_Your country                        _da403c'))

WebUI.click(findTestObject('Object Repository/TC_03/Page_Register/input_psa-checkbox'))

WebUI.scrollToElement(findTestObject('TC_03/Page_Register/button_Next Step   please wait'), 0)

WebUI.click(findTestObject('Object Repository/TC_03/Page_Register/button_Next Step   please wait'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TC_03/Page_Register/div_Phone number is too short'), 0)

WebUI.closeBrowser()

