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

// Cari elemen yang ingin diverifikasi
TestObject myElement = findTestObject('Object Repository/verificationElemen/importLetter')

try {
	// Verifikasi bahwa elemen terlihat
	WebUI.verifyElementVisible(myElement)
	println "Elemen terlihat."
} catch (StepFailedException e) {
	println "Elemen tidak terlihat: " + e.getMessage()
}

//import letter of credit
WebUI.setText(findTestObject('Object Repository/Page5/refNum'), GlobalVariable.ref)
//issued by
WebUI.click(findTestObject('Object Repository/Page5/issuedBy'))
WebUI.click(findTestObject('Object Repository/Page5/chooseSwift'))
WebUI.setText(findTestObject('Object Repository/Page5/expDate'), GlobalVariable.expDate)
WebUI.setText(findTestObject('Object Repository/Page5/expPlace'), GlobalVariable.expPlace)

//Party Details
WebUI.scrollToPosition(0, 300)
WebUI.setText(findTestObject('Object Repository/Page5/applicantTitle'), GlobalVariable.applicantTitle)
WebUI.click(findTestObject('Object Repository/Page5/applicantDesc'))
WebUI.sendKeys(findTestObject('Object Repository/Page5/applicantDesc'), Keys.chord(Keys.CONTROL, 'A'))
WebUI.sendKeys(findTestObject('Object Repository/Page5/applicantDesc'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Page5/applicantDesc'), GlobalVariable.applicantDesc)


WebUI.click(findTestObject('Object Repository/Page5/benefTitle'))
WebUI.setText(findTestObject('Object Repository/Page5/benefTitle'), GlobalVariable.benefTitle)
WebUI.click(findTestObject('Object Repository/Page5/benefDesc'))
WebUI.sendKeys(findTestObject('Object Repository/Page5/benefDesc'), Keys.chord(Keys.CONTROL, 'A'))
WebUI.sendKeys(findTestObject('Object Repository/Page5/benefDesc'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Page5/benefDesc'), GlobalVariable.benefDesc)



WebUI.scrollToPosition(0, 500)
WebUI.click(findTestObject('Object Repository/Page5/advisingBankTitle'))
WebUI.setText(findTestObject('Object Repository/Page5/advisingBankTitle'), GlobalVariable.advisingBankTitle)
WebUI.click(findTestObject('Object Repository/Page5/advisingBankDesc'))
WebUI.sendKeys(findTestObject('Object Repository/Page5/advisingBankDesc'), Keys.chord(Keys.CONTROL, 'A'))
WebUI.sendKeys(findTestObject('Object Repository/Page5/advisingBankDesc'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Page5/advisingBankDesc'), GlobalVariable.advisingBankDesc)


//amount
WebUI.scrollToPosition(0, 600)
WebUI.click(findTestObject('Object Repository/Page5/amount'))
WebUI.setText(findTestObject('Object Repository/Page5/amount'), GlobalVariable.amount)


//input branch
WebUI.scrollToPosition(0, 600)
WebUI.click(findTestObject('Object Repository/Page5/inputBranch'))
WebUI.setText(findTestObject('Object Repository/Page5/inputBranch'), GlobalVariable.inputBranch)


//click validate
WebUI.click(findTestObject('Object Repository/Page5/clickValidate'))