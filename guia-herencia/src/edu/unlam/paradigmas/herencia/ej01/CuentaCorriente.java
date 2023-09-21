package edu.unlam.paradigmas.herencia.ej01;

public class CuentaCorriente extends Cuenta {

	private double saldoEnDescubierto;

	public CuentaCorriente() {
		super();
		this.saldoEnDescubierto = 0;
	}

	public CuentaCorriente(double montoInicial, double montoDescubierto) {
		super(montoInicial);
		if (montoDescubierto > 0)
			this.saldoEnDescubierto = montoDescubierto;
		else
			throw new IllegalArgumentException("El monto en descubierto debe ser mayor a cero");
	}

	public double consultarSaldoEnDescubierto() {
		return this.saldoEnDescubierto;
	}

	public void extraer(double monto, String motivo) {
		if (monto > 0) {
			if (monto <= (this.saldoEnDescubierto + saldo)) {
				if (monto > saldo) {
					monto -= saldo;
					saldo = 0;
					this.saldoEnDescubierto -= monto;
					transacciones.add(new Transaccion(-monto, motivo));
				} else
					saldo -= monto;
			} else
				throw new IllegalArgumentException("Saldo insuficiente para realizar extracción");
		} else
			throw new IllegalArgumentException("La cantidad a extraer debe ser mayor a cero");
	}

}
