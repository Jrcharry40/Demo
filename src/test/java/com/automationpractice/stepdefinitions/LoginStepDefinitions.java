package com.automationpractice.stepdefinitions;

import java.util.List;

import com.automationpractice.models.LoginUsuario;
import com.automationpractice.steps.IniciarSesionSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {
	
	@Steps
	IniciarSesionSteps pasos;
	
	@Given("^que voy a la pagina de inicio de Automation Practice$")
	public void queVoyALaPaginaDeInicioDeAutomationPractice() {
		pasos.abrirNavegadorAutomationPractice();
	  
	}

	@When("^escribo mis credenciales, luego hacemos clic en iniciar sesion$")
	public void escriboMisCredencialesLuegoHacemosClicEnIniciarSesion(List<LoginUsuario> loginUsuario) {
	  pasos.darClickEnSingIn();
	  pasos.escribirEmail(loginUsuario.get(0).getEmail());
	  pasos.escribirPasswor(loginUsuario.get(0).getPassword());
	  pasos.darClickEnSingInTwo();
	}

	@Then("^deberia ver mi nombre registrado$")
	public void deberiaVerMiNombreRegistrado() {
	    pasos.validarLoginExitoso();
	}

	@When("^escribo mi credenciales erroneas, luego hacemos clic en iniciar sesion$")
	public void escriboMiCredencialesErroneasLuegoHacemosClicEnIniciarSesion(List<LoginUsuario> loginUsuario) {
		pasos.abrirNavegadorAutomationPractice();
		pasos.darClickEnSingIn();
		  pasos.escribirEmail(loginUsuario.get(0).getEmail());
		  pasos.escribirPasswor(loginUsuario.get(0).getPassword());
		  pasos.darClickEnSingInTwo();
	}

	@Then("^deberia ver error en el login$")
	public void deberiaVerErrorEnElLogin() {
	    pasos.validarErrorEnElLogin();
	}

}
