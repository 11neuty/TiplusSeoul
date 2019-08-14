import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\LIEUHU~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Simple Examples\\Login Test\\Custom-keyword examples\\TC_Add to Cart using Custom Keyword\\20190814_154302\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Simple Examples/Login Test/Custom-keyword examples/TC_Add to Cart using Custom Keyword', new TestCaseBinding('Test Cases/Simple Examples/Login Test/Custom-keyword examples/TC_Add to Cart using Custom Keyword',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
