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
import com.kms.katalon.core.exception.StepFailedException



WebUI.click(findTestObject('Object Repository/Page6/ClickReleaseItems'))
WebUI.click(findTestObject('Object Repository/Page6/ClickCharges'))
TestObject myElement = findTestObject('Object Repository/verificationElemen/charge')

try {
	// Verifikasi bahwa elemen terlihat
	WebUI.verifyElementVisible(myElement)
	println "Elemen start terlihat."
} catch (StepFailedException e) {
	println "Elemen tidak terlihat: " + e.getMessage()
}
WebUI.scrollToPosition(0, 300)
WebUI.waitForElementClickable(findTestObject('Object Repository/Page6/clickAdd'), 10)
WebUI.click(findTestObject('Object Repository/Page6/ClickAdd'))
WebUI.doubleClick(findTestObject('Object Repository/Page6/issuingBank'))
WebUI.click(findTestObject('Object Repository/Page6/clickClose1'))
WebUI.click(findTestObject('Object Repository/Page6/clickWaive'))
WebUI.click(findTestObject('Object Repository/Page6/clickEdit'))
WebUI.click(findTestObject('Object Repository/Page6/clickSelect'))
WebUI.click(findTestObject('Object Repository/Page6/clickTake'))
WebUI.click(findTestObject('Object Repository/Page6/clickChargeAmount'))
WebUI.sendKeys(findTestObject('Object Repository/Page6/clickChargeAmount'), Keys.chord(Keys.CONTROL, 'A'))
WebUI.sendKeys(findTestObject('Object Repository/Page6/clickChargeAmount'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Page6/clickChargeAmount'), GlobalVariable.amount)
WebUI.scrollToPosition(0, 600)
WebUI.click(findTestObject('Object Repository/Page6/clickOK'))
WebUI.click(findTestObject('Object Repository/Page6/clickClose2'))
WebUI.click(findTestObject('Object Repository/Page5/clickValidate'))
WebUI.click(findTestObject('Object Repository/Page6/clickOkValidate'))




//WebUI.click(findTestObject('Object Repository/Page6/amountPage6'))

