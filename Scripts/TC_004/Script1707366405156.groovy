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

WebUI.navigateToUrl(GlobalVariable.linkwebsite)

WebUI.click(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/input_OR_username'), 'hanams')

WebUI.setEncryptedText(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/input_Username_password'), 
    'hCc8x1UqSX8vfSLAHukwvg==')

WebUI.click(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/button_SIGN IN'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/div_TABLETS                        Shop Now'))

WebUI.click(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/img_SHOP NOW_16'))

WebUI.click(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/svg_Management Console_menuCart'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/button_CHECKOUT (1,308.99)'))

WebUI.click(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/button_NEXT'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/input__safepay_username'), 'hanamaria')

WebUI.setEncryptedText(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/input__safepay_password'), 
    'iOe3bR1ca6Su8+Kvph2Euw==')

WebUI.click(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/button_PAY NOW'))

WebUI.verifyElementText(findTestObject('Object Repository/ShoppingCart/Page_Advantage Shopping/span_Thank you for buying with Advantage'), 'Thank you for buying with Advantage')

WebUI.delay(2)

WebUI.closeBrowser()

