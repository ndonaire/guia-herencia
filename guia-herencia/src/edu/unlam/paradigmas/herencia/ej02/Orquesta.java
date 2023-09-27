package edu.unlam.paradigmas.herencia.ej02;

public class Orquesta {
	
	private InstrumentoMusical[] instrumentos;

	public Orquesta(InstrumentoMusical[] instrumentos) {
		super();
		this.instrumentos = instrumentos;
	}
	
	public void tocar() {
		for(InstrumentoMusical instrumento: instrumentos ) {
			instrumento.tocar();
		}
	}
	
	public void tocarVientos() {
		for(InstrumentoMusical instrumento: instrumentos ) {
			if(instrumento instanceof InstrumentoViento) //pregunta si el instrumento es instancia de InstrumentoViento
				instrumento.tocar();
		}
	}
	
	public void tocarCuerdas() {
		for(InstrumentoMusical instrumento: instrumentos ) {
			if(instrumento instanceof InstrumentoCuerda) //pregunta si el instrumento es instancia de InstrumentoCuerda
				instrumento.tocar();
		}
	}
	
	public void tocarPercusion() {
		for(InstrumentoMusical instrumento: instrumentos ) {
			if(instrumento instanceof InstrumentoPercusion) //pregunta si el instrumento es instancia de InstrumentoPercusion
				instrumento.tocar();
		}
	}
	
}
