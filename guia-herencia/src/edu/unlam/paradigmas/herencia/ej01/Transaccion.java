package edu.unlam.paradigmas.herencia.ej01;

import java.util.Date;

public class Transaccion {
	
	private double monto;
	private String motivo;
	private Date fecha;
	
	public Transaccion(double monto, String motivo) {
		this.monto = monto;
		this.motivo = motivo;
		this.fecha = new Date();
	}

	public double getMonto() {
		return monto;
	}

	public String getMotivo() {
		return motivo;
	}

	public Date getFecha() {
		return fecha;
	}
	
	
}
