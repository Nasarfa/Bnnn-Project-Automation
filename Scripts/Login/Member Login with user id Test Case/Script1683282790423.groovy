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

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/button_Allow all'))

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/button_Login'))

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/input_Login_email'))

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/div_UsernameEmail Address'))

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/p_UsernameEmail Address'))

WebUI.setText(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/input_Login_email'), 
    'itengineering_product_uat01')

WebUI.selectOptionByValue(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/select_Select StateAlabamaAlaskaArizonaArka_56566a'), 
    'CT, Connecticut', true)

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/p_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/input_Login_password'), 
    'DrbKVv2yyAxIMyGYGaZfTd96DAWTD9fEv7rMDP891WQ=')

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/input_Login_remember_me_check'))

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/button_Login_1'))

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/button_IT Engineering Product UAT 01'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/button_IT Engineering Product UAT 01'), 
    0)

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/p_Logout'))

WebUI.click(findTestObject('Object Repository/Login Page/Login with User id Member/Page_Trusted Professionals Business Network_6a68fd/button_Logout'))

