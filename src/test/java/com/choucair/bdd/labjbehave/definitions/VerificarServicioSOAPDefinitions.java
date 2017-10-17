package com.choucair.bdd.labjbehave.definitions;
import org.jbehave.core.annotations.*;

import com.choucair.bdd.labjbehave.steps.VerificarServicioSOAPSteps;

import net.thucydides.core.annotations.Steps;
public class VerificarServicioSOAPDefinitions{
	
	@Steps VerificarServicioSOAPSteps verificarServicioSOAPSteps;
	@Given("tengo un servicio SOAP de conversion")
	public void givenTengoUnServicioSOAPDeConversion(){
		verificarServicioSOAPSteps.CrearElServicio();
	}
	
	@When("mando el numero de megabytes a convertir")	
	public void whenMandoElNumeroDeMegabytesAConvertir(){
		verificarServicioSOAPSteps.EnviarElValorDeMegasAConvertir(2);
	}
	
	@Then("el servicio me responde el valor en kilobytes")
	public void thenElServicioMeRespondeElValorEnKilobytes(){		
		verificarServicioSOAPSteps.ElServicioMeMuestraElValorEnKiloBytes(2048);
	}
}