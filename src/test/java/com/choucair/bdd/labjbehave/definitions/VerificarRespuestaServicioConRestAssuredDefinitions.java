package com.choucair.bdd.labjbehave.definitions;
import org.jbehave.core.annotations.*;

import com.choucair.bdd.labjbehave.steps.VerificarRespuestaServicioConRestAssuredSteps;

import net.thucydides.core.annotations.Steps;
public class VerificarRespuestaServicioConRestAssuredDefinitions{
	
	@Steps VerificarRespuestaServicioConRestAssuredSteps verificarRespuestaServicioConRestAssuredSteps;
	
	
	@Given("Tengo un usuario que existe")
	public void givenTengoUnUsuarioQueExiste(){
		
		verificarRespuestaServicioConRestAssuredSteps.BuscarNombreUsuario("eugenp");
	}
	@When("Busco el usuario en el servicio API")
	public void whenBuscoElUsuarioEnElServicioAPI(){
		verificarRespuestaServicioConRestAssuredSteps.BuscarSiEjecutoCorrectamente();
	}
	@Then("El servicio responde el json del usuario")
	public void thenElServicioRespondeElJsonDelUsuario(){
		
		verificarRespuestaServicioConRestAssuredSteps.SeHallaraElNombreDeUsaurio("eugenp");
	}
	
}