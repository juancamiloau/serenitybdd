package com.choucair.bdd.labjbehave.definitions;
import org.jbehave.core.annotations.*;



import com.choucair.bdd.labjbehave.steps.ConsultarProductosSteps;

import net.thucydides.core.annotations.Steps;


public class ConsultarProductoDefinitions{
	
	@Steps ConsultarProductosSteps consultarProductosSteps;
	
	
	@Given("Estoy en la pagina del exito.com")
	public void givenEstoyEnLaPaginaDelExitocom(){
		 consultarProductosSteps.AbrirElPortalDelExito();
	}
	@When("Buscar un producto que deseo adquirir por el nombre")
	public void whenBuscarUnProductoQueDeseoAdquirirPorElNombre(){
		consultarProductosSteps.EscribirEnLaBarraDeBusquedaElNombreDelProducto();
	}
	@Then("Encontrare articulos relacionados con el nombre")
	public void thenEncontrareArticulosRelacionadosConElNombre(){
		consultarProductosSteps.VerificarQueElPortalMeTraeResultadosRelacionados();
	}	
}