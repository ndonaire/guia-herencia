package edu.unlam.paradigmas.herencia.ej02;

public class Lustrador {
	
	public void lustrar(InstrumentoMusical instrumento) {
		if(instrumento.esLustrable())
			instrumento.lustrar();
	}
	
}
