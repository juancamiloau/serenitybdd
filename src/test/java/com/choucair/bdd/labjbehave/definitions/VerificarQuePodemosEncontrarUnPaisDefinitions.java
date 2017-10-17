package com.choucair.bdd.labjbehave.definitions;
import org.jbehave.core.annotations.*;
import com.choucair.bdd.labjbehave.steps.VerificarQuePodemosEncontrarUnPaisSteps;
import net.thucydides.core.annotations.Steps;

public class VerificarQuePodemosEncontrarUnPaisDefinitions{
	
	@Steps VerificarQuePodemosEncontrarUnPaisSteps verificarQuePodemosEncontrarUnPaisSteps;
	
	@Given("tengo el codigo del pais")	
	public void givenTengoElCodigoDelPais(){
		verificarQuePodemosEncontrarUnPaisSteps.BuscarElPaisPorCodigo("US");
	}
	@When("busco el pais en la pagina")	
	public void whenBuscoElPaisEnLaPagina(){
		verificarQuePodemosEncontrarUnPaisSteps.LaBusquedaSeEjecutoConExito();
	}
	
	@Then("encontrare el pais buscado")	
	public void thenEncontrareElPaisBuscado(){
		verificarQuePodemosEncontrarUnPaisSteps.DeberiaEncontrarElPais("United States of America");
	}
		
	@Then("encontrare el pais buscado con un mensaje especifico de error")	
	public void thenEncontrareElPaisBuscadoConUnMensaje(){
		
		verificarQuePodemosEncontrarUnPaisSteps.DeberiaEncontrarElPaisConUnMensajeEspecifico("Colombia");
	}
}