package edu.unlam.paradigmas.herencia.ej02;

public abstract class InstrumentoViento extends InstrumentoMusical{

	public InstrumentoViento(String nombre, String descripcion, String metodoAfinar) {
		super(nombre, descripcion,metodoAfinar);
	}
	
	public abstract String getTipoviento();

}

	