import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class CURA_TC_APPOINTMENT_LISTENER {
	
	
	@BeforeTestSuite
	def beforeTestSuite() {
		// Code to execute before the test suite starts
		println("Before Test Suite")
	}

	@AfterTestSuite
	def afterTestSuite() {
		// Code to execute after the test suite finishes
		println("After Test Suite")
	}

	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		// Code to execute before each test case starts
		println("Before Test Case: " + testCaseContext.getTestCaseId())
	}

	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
		// Code to execute after each test case ends
		println("After Test Case: " + testCaseContext.getTestCaseId())
	}
}