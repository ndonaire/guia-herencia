package edu.unlam.paradigmas.herencia.ej02;

public class Afinador {
	
	public void afinar(InstrumentoMusical instrumento) {
		if(instrumento.esAfinable())
			instrumento.afinar();
	}
}
