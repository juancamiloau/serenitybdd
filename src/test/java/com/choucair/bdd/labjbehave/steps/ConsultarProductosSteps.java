package com.choucair.bdd.labjbehave.steps;

import com.choucair.bdd.labjbehave.pageobjects.ExitoHomePage;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ConsultarProductosSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	ExitoHomePage exitoHomePage;
	String strProducto;
	@Step("Abrir el portal del exito")
	public void AbrirElPortalDelExito() {
		exitoHomePage.open();
	}
	
		
	@Step("Escribir en la barra de busqueda el nombre del producto")
	public void EscribirEnLaBarraDeBusquedaElNombreDelProducto() {
		exitoHomePage.EscribirEnLaBarraDeBusqueda(strProducto = "Silla");
	}
	
	@Step("Verificar que el portal me trae resultados relacionados")
	public void VerificarQueElPortalMeTraeResultadosRelacionados() {
		assertThat(true,is(exitoHomePage.VerificarResultadosRelacionados(strProducto)));
	}
}
