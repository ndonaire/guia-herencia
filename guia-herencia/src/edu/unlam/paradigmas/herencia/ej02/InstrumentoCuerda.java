package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoCuerda extends InstrumentoMusical{

	
	public InstrumentoCuerda(String nombre, String descripcion, String metodoAfinar) {
		super(nombre, descripcion,metodoAfinar);
	}

	@Override
	public void tocar() {
		System.out.println("Tocando instrumento: " + this.getNombre());
	}

	@Override
	public boolean esAfinable() {
		return true;
	}

	@Override
	public void afinar() {
		if(this.metodoAfinar.equals("Manual"))
			System.out.println("Afinando instrumento manualmente: " + this.getNombre());
		else 
			System.out.println("Afinando instrumento automáticamente: " + this.getNombre());
	}

	@Override
	public boolean esLustrable() {
		return false;
	}

	@Override
	public void lustrar() {}

}
