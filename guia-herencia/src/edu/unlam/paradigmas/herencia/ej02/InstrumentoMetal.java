package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoMetal extends InstrumentoViento{

	public InstrumentoMetal(String nombre, String descripcion, String metodoAfinar) {
		super(nombre, descripcion,metodoAfinar);
	}

	@Override
	public String getTipoviento() {
		return "METAL";
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
		return true;
	}

	@Override
	public void lustrar() {
		System.out.println("Lustrando instrumento: " + this.getNombre());		
	}

}
