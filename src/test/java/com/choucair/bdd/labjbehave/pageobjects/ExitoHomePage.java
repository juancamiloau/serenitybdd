package com.choucair.bdd.labjbehave.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.exito.com")
public class ExitoHomePage extends PageObject{
	@FindBy(xpath = "//input[@name='Ntt']")
	private WebElementFacade txtBuscadorPrincipal;
	
	public void EscribirEnLaBarraDeBusqueda(String strPalabra) {
		txtBuscadorPrincipal.typeAndEnter(strPalabra);
	}
	
	public boolean VerificarResultadosRelacionados (String strPalabra) {
		return containsText(strPalabra);
	}
}
