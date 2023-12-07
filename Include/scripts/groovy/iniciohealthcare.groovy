import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class iniciohealthcare {
	@Given("Ingresar al navegador")
	def Ingresar_al_navegador() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
	}
	@And("Ingresar a la pagina web")
	def Ingresar_a_la_pagina_web() {
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
	}
	@And("Doy click al boton de ingreso")
	def Doy_click_al_boton_de_ingreso() {
		WebUI.click(findTestObject('Object Repository/boton_entrar'))
	}
	@When("Tomo e inserto los datos")
	def Tomo_e_inserto_los_datos() {
		String user = WebUI.getAttribute(findTestObject('Object Repository/text_1'), "value")
		String password = WebUI.getAttribute(findTestObject('Object Repository/text_2'), "value")

		WebUI.setText(findTestObject('Object Repository/user_input'), user)
		WebUI.setText(findTestObject('Object Repository/password_input'), password)
	}
	@And("Click en boton de ingreso de datos")
	def Click_en_boton_de_ingreso_de_datos() {
		WebUI.click(findTestObject('Object Repository/boton_login'))
	}
	@Then("Seleccionar una instalacion")
	def Seleccionar_una_instalacion() {
		WebUI.click(findTestObject('Object Repository/select_facility'))
		WebUI.click(findTestObject('Object Repository/second_facility'))
	}
	@And("Seleccionar programa Medicaid")
	def Seleccionar_programa_Medicaid() {
		WebUI.click(findTestObject('Object Repository/boton_medicaid'))
	}
	@And("Ingreso la fecha del covid")
	def Ingreso_la_fecha_del_covid() {
		WebUI.sendKeys(findTestObject('Object Repository/calendar_input'), '11/11/2019', FailureHandling.STOP_ON_FAILURE)
	}
	@And("Click en el boton y cerrar")
	def Click_en_el_boton_y_cerrar() {
		WebUI.click(findTestObject('Object Repository/boton_Book_Appointment'))
		WebUI.closeBrowser()
	}
}