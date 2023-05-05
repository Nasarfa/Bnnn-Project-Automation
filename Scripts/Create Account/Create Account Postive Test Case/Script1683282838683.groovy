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

WebUI.navigateToUrl('https://bnidev.ml/#/home')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/button_Allow selection'))

WebUI.click(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/button_Create a free account'))

WebUI.click(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/p_Email Address'))

WebUI.setText(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/input_Create an account_signupemail'), 
    'nasar1243s22@macappstudio.com')

WebUI.setText(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/input_Create an account_signuppassword'), 
    'Nasar@123')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/select_Select StateAlabamaAlaskaArizonaArka_56566a'), 
    'Select State', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/select_Select StateAlabamaAlaskaArizonaArka_56566a'), 
    'CT,Connecticut', true)

WebUI.click(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/input_Create an account_agree_t_c_check'))

WebUI.click(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/p_Your account has been successfully create_1ac6f3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/p_Your account has been successfully create_1ac6f3'), 
    0)

WebUI.click(findTestObject('Object Repository/Create Account Page/Create Account Postive/Page_Trusted Professionals Business Network_6a68fd/img_Create a free account_close-icon'))

WebUI.closeBrowser()

