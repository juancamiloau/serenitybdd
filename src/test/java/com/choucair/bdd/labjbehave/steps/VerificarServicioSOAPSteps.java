package com.choucair.bdd.labjbehave.steps;



import net.thucydides.core.annotations.Step;
import net.webservicex.ComputerUnit;
import net.webservicex.ComputerUnitSoap;
import net.webservicex.Computers;

public class VerificarServicioSOAPSteps {
	ComputerUnitSoap computerUnitSoap;
	double dblResultado;
	
	@Step("Crear el servicio")
	public void CrearElServicio() {
		computerUnitSoap = new ComputerUnit().getComputerUnitSoap();
	}
	
	@Step("Enviar el valor de megabytes a convertir")
	public void EnviarElValorDeMegasAConvertir(int intValorMegas) {
		dblResultado = computerUnitSoap.changeComputerUnit(intValorMegas, Computers.MEGABYTE, Computers.KILOBYTE);
	}
	
	@Step("El servicio me muestra el valor en kilobytes")
	public void ElServicioMeMuestraElValorEnKiloBytes(double dblValorKilos) {
		assert(dblResultado == dblValorKilos) : "El valor esperado no es el valor recibido";
	}
	
}
