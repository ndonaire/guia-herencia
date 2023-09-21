package edu.unlam.paradigmas.herencia.ej01;

public class TarjetaDebito {

	private Cuenta cuentaAsociada;

	public TarjetaDebito(Cuenta cuenta) {
		this.cuentaAsociada = cuenta;
	}

	public Cuenta consultarCuentaAsociada() {
		return this.cuentaAsociada;
	}

	public void realizarCompra(double monto, String motivo) {
		if (monto > 0) {
			if(monto <= this.cuentaAsociada.consultarSaldo())
				cuentaAsociada.extraer(monto, motivo);
			else
				throw new IllegalArgumentException("Saldo insuficiente para realizar compra");
		}
		else
			throw new IllegalArgumentException("El monto de la compra debe ser mayor a cero.");
	}
}
