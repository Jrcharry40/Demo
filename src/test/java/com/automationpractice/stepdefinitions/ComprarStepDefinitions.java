package com.automationpractice.stepdefinitions;

import com.automationpractice.steps.ComprarSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ComprarStepDefinitions {
	
	@Steps
	ComprarSteps pasos;
	
	@When("^Selecciono el articulo de interes y registro mi compra$")
	public void seleccionoElArticuloDeInteresYRegistroMiCompra() {
		pasos.darClicEnBotonHome();
		pasos.darClicEnElArticuloBlouse();
		pasos.seleccionarCantidad();
		pasos.seleccionarTalla();
		pasos.seleccionarColor();
		pasos.darClicEnBotonAddToCart();
		pasos.darClicEnBotonProceedToCheckout();
		pasos.darClicEnBotonProceedToCheckoutTwo();
		pasos.darClicEnBotonProceedToCheckoutThree();
		pasos.darClicEnAceptarTerminosEnvio();
		pasos.darClicEnBotonProceedToCheckoutFour();
		pasos.darClicEnPagoPorTranferenciaBancaria();
		pasos.darClicEnConfirmarMiOrden();
	}


	@Then("^Deberia ver mi transaccion completa$")
	public void deberiaVerMiTransaccionCompleta() {
		pasos.validarMensajeDeOrdenCompleta();
	    
	}

}
