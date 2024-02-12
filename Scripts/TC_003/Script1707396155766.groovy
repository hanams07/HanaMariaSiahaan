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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/a_CONTACT US'))

selected = WebUI.verifyElementClickable(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/selected'))

if (selected == true) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/select_Select CategoryLaptopsHeadphonesTabl_1ef56f'), 
        'object:62', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/select_Select ProductHP ElitePad 1000 G2 Ta_18213c'), 
        'object:123', true)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/input__emailContactUs'), email)

    WebUI.setText(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/textarea__subjectTextareaContactUs'), 
        subject)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/button_SEND'))

    WebUI.delay(2)

    WebUI.verifyElementPresent(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/p_Thank you for contacting Advantage support'), 0)
} else {
    WebUI.setText(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/input__emailContactUs'), email)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/textarea__subjectTextareaContactUs'), 
        subject)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/button_SEND'))

    WebUI.delay(2)

    WebUI.verifyElementPresent(findTestObject('Object Repository/ContactUs/Page_Advantage Shopping/p_Thank you for contacting Advantage support'), 
        0)
}

WebUI.delay(2)

WebUI.closeBrowser()

