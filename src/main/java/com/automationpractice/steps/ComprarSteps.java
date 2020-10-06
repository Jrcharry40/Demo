package com.automationpractice.steps;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.automationpractice.pageobjects.ComprarPageObject;
import com.sqasa.web.demo.utils.KrakenWeb;

import net.thucydides.core.annotations.Step;

public class ComprarSteps extends KrakenWeb{

	ComprarPageObject comprarArticulo = new ComprarPageObject();

	@Step
	public void darClicEnBotonHome() {
		configuracionesIniciales();
		esperarQueElObjetoSeaClickeable(comprarArticulo.getBtnHome());
		click(comprarArticulo.getBtnHome());
		
	}

	@Step
	public void darClicEnElArticuloBlouse() {
		esperarVisibilidadDelObjeto(comprarArticulo.getImgBlouse());
		click(comprarArticulo.getImgBlouse());

	}

	@Step
	public void seleccionarCantidad() {
		esperarVisibilidadDelObjeto(comprarArticulo.getBtnPlus());
		click(comprarArticulo.getBtnPlus());

	}

	@Step
	public void seleccionarTalla() {
		click(comprarArticulo.getListSize());

	}

	@Step
	public void seleccionarColor() {
		click(comprarArticulo.getBtnColor());

	}

	@Step
	public void darClicEnBotonAddToCart() {
		click(comprarArticulo.getBtnAddToCart());

	}

	@Step
	public void darClicEnBotonProceedToCheckout() {
		esperarVisibilidadDelObjeto(comprarArticulo.getBtnProceedToCheckout());
		click(comprarArticulo.getBtnProceedToCheckout());

	}

	@Step
	public void darClicEnBotonProceedToCheckoutTwo() {
		click(comprarArticulo.getBtnProceedToCheckoutTwo());

	}

	@Step
	public void darClicEnBotonProceedToCheckoutThree() {
		click(comprarArticulo.getBtnProceedToCheckoutThree());

	}

	@Step
	public void darClicEnAceptarTerminosEnvio() {
		click(comprarArticulo.getCheckBoxTerms());

	}

	@Step
	public void darClicEnBotonProceedToCheckoutFour() {
		click(comprarArticulo.getBtnProceedToCheckoutFour());

	}

	@Step
	public void darClicEnPagoPorTranferenciaBancaria() {
		click(comprarArticulo.getBtnPayByBankWire());

	}

	@Step
	public void darClicEnConfirmarMiOrden() {
		click(comprarArticulo.getBtnIConfirmMyOrder());

	}

	@Step
	public void validarMensajeDeOrdenCompleta() {
		assertThat(getDriver().findElement(comprarArticulo.getTxtOrderCompleted()).isDisplayed(), Matchers.is(true));

	}

}
