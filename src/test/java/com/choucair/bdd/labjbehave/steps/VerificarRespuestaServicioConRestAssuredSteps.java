package com.choucair.bdd.labjbehave.steps;



import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;


public class VerificarRespuestaServicioConRestAssuredSteps {
	String strURL = "https://api.github.com/users/";
	
	
	@Step("Hacer la peticion con el nombre de usuario")
	public void BuscarNombreUsuario(String strName) {
		SerenityRest.when().get(strURL + strName);
	}
	
	@Step("Buscar si ejecuto correctamente")
	public void BuscarSiEjecutoCorrectamente() {
		SerenityRest.then().statusCode(200);
	}
	
	@Step("Se hallara el nombre de usuario.")
	public void SeHallaraElNombreDeUsaurio (String strName)
	{
		SerenityRest.then().assertThat().body("login", equalTo(strName));
	}
}
