package com.choucair.bdd.labjbehave.steps;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.is;


public class VerificarQuePodemosEncontrarUnPaisSteps  {
	String strURL = "http://services.groupkt.com/country/get/iso2code/";
	
	@Step("Buscar el pais por el codigo: {0}")
	public void BuscarElPaisPorCodigo(String strCodigo) {
		SerenityRest.when().get(strURL+strCodigo);
	}
	
	@Step("La busqueda se ejecuto con exito")
	public void LaBusquedaSeEjecutoConExito() {
		SerenityRest.then().statusCode(200);
	}
	
	@Step("Deberia encontrar el pais: {0}")
	public void DeberiaEncontrarElPais(String strNombre) {
		SerenityRest.then().body("RestResponse.result.name", is(strNombre));			
	}
	
	@Step("Deberia encontrar el pais: {0} con un mensaje especifico")
	public void DeberiaEncontrarElPaisConUnMensajeEspecifico(String strNombre) {		
		String strNameUser = SerenityRest.then().extract().body().jsonPath().get("RestResponse.result.name");
		assert (strNombre == strNameUser): "El nombre de pais no es el esperado se esperaba " + strNombre + " y se encontró "+ strNameUser;
	}
}
