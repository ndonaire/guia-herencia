package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoPercusion extends InstrumentoMusical{

	public InstrumentoPercusion(String nombre, String descripcion) {
		super(nombre, descripcion);
	}

	@Override
	public void tocar() {
		System.out.println("Tocando instrumento: " + this.getNombre());
	}

	@Override
	public boolean esAfinable() {
		return false;
	}

	@Override
	public void afinar() {}

	@Override
	public boolean esLustrable() {
		return true;
	}

	@Override
	public void lustrar() {
		System.out.println("Lustrando instrumento: " + this.getNombre());		
	}

}
