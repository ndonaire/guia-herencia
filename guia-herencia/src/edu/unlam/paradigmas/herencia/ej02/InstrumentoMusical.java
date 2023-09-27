package edu.unlam.paradigmas.herencia.ej02;

public abstract class InstrumentoMusical {
	String nombre;
	String descripcion;
	String metodoAfinar;
	
	
	public InstrumentoMusical(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public InstrumentoMusical(String nombre, String descripcion, String metodoAfinar) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.metodoAfinar = metodoAfinar;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public abstract void tocar();
	public abstract boolean esAfinable();
	public abstract void afinar();
	public abstract boolean esLustrable();
	public abstract void lustrar();
	
}
