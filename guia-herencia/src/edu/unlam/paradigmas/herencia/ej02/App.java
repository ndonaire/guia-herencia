package edu.unlam.paradigmas.herencia.ej02;

public class App {

	public static void main(String[] args) {
		// ORQUESTA 
		InstrumentoMusical[] instrumentos = new InstrumentoMusical[] {
	            new InstrumentoMadera("Flauta", "Instrumento de madera","Manual"),
	            new InstrumentoMetal("Trompeta", "Instrumento de metal", "Manual"),
	            new InstrumentoCuerda ("Guitarra", "Instrumento de cuerda", "Automatico"),
	            new InstrumentoCuerda ("Bajo", "Instrumento de cuerda", "Automatico"),
	            new InstrumentoPercusion("Batería", "Instrumento de percusión"),
	            new InstrumentoPercusion("Triángulo", "Instrumento de percusión")
	        };
		
		Orquesta orquesta = new Orquesta(instrumentos);
		
		System.out.println("Orquesta toca todos los instrumentos juntos: ");
		orquesta.tocar();
		
		System.out.println("Orquesta toca todos los instrumentos de cuerda: ");
		orquesta.tocarCuerdas();
		
		System.out.println("Orquesta toca todos los instrumentos de viento: ");
		orquesta.tocarVientos();
		
		System.out.println("Orquesta toca todos los instrumentos de percusión: ");
		orquesta.tocarPercusion();
		
		//LUSTRADOR
		Lustrador lustrador = new Lustrador();
		System.out.println("Probando lustrador: ");
		
		lustrador.lustrar(instrumentos[0]);
		lustrador.lustrar(instrumentos[1]);
		lustrador.lustrar(instrumentos[4]);
		lustrador.lustrar(instrumentos[5]);
		
		//AFINADOR
		Afinador afinador = new Afinador();
		System.out.println("Probando afinador: ");
		
		afinador.afinar(instrumentos[0]);
		afinador.afinar(instrumentos[1]);
		afinador.afinar(instrumentos[2]);
		afinador.afinar(instrumentos[3]);
	}

}
