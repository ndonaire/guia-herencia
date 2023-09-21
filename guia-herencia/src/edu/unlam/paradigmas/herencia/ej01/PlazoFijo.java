package edu.unlam.paradigmas.herencia.ej01;

public class PlazoFijo {

	private Cuenta cuentaAsociada;
	private double montoReservado;
	private double tasaInteresAnual = 0.36;

	public PlazoFijo(Cuenta cuenta, double monto) {
		if (monto > 0) {
			this.cuentaAsociada = cuenta;
			this.montoReservado = monto;
			cuentaAsociada.transacciones.add(new Transaccion(monto, "Apertura Plazo Fijo"));
		}
		else
			throw new IllegalArgumentException("El monto debe ser mayor a cero");
	}

	public Cuenta consultarCuentaAsociada() {
		return this.cuentaAsociada;
	}

	public double consultarMontoReservado() {
		return this.montoReservado;
	}

	public void depositarIntereses() {
		double monto = montoReservado + (montoReservado * tasaInteresAnual / 12);
		cuentaAsociada.depositar(monto, "Intereses Plazo Fijo");
	}

}
