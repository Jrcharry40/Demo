package com.automationpractice.steps;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import com.automationpractice.pageobjects.IniciarSesionPageObject;
import com.sqasa.web.demo.utils.KrakenWeb;

import net.thucydides.core.annotations.Step;

public class IniciarSesionSteps extends KrakenWeb {

	IniciarSesionPageObject iniciarSesion = new IniciarSesionPageObject();

	@Step
	public void abrirNavegadorAutomationPractice() {
		configuracionesIniciales();
		abrirNavegadorEn(iniciarSesion);
	}

	@Step
	public void darClickEnSingIn() {
	esperarQueElObjetoSeaClickeable(iniciarSesion.getBtnSingIn());
	click(iniciarSesion.getBtnSingIn());

	}

	@Step
	public void escribirEmail(String email) {
		click(iniciarSesion.getTxtEmail());
		escribirTexto(iniciarSesion.getTxtEmail(), email);

	}

	@Step
	public void escribirPasswor(String password) {
		click(iniciarSesion.getTxtPassword());
		escribirTexto(iniciarSesion.getTxtPassword(), password);

	}
	
	@Step
	public void darClickEnSingInTwo() {
		click(iniciarSesion.getBtnSingInTwo());

	}
	
	@Step
	public void validarLoginExitoso() {
		assertThat(getDriver().findElement(iniciarSesion.getTxtLoginSuccessfully()).isDisplayed(), Matchers.is(true));

	}
	
	@Step
	public void validarErrorEnElLogin() {
		assertThat(getDriver().findElement(iniciarSesion.getTxtErrorLogin()).isDisplayed(), Matchers.is(true));

	}

}
