import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class CustomTestListener {

    @BeforeTestSuite
    def beforeTestSuite(TestSuiteContext testSuiteContext) {
        println("Before Test Suite: ${testSuiteContext.getTestSuiteId()}")
    }

    @AfterTestSuite
    def afterTestSuite(TestSuiteContext testSuiteContext) {
        println("After Test Suite: ${testSuiteContext.getTestSuiteId()}")
    }

    @BeforeTestCase
    def beforeTestCase(TestCaseContext testCaseContext) {
        println("Before Test Case: ${testCaseContext.getTestCaseId()}")
    }

    @AfterTestCase
    def afterTestCase(TestCaseContext testCaseContext) {
        println("After Test Case: ${testCaseContext.getTestCaseId()}")
    }
}

