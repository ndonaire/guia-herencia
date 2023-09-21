package edu.unlam.paradigmas.herencia.ej01;

public class CuentaDeAhorros extends Cuenta {

	private double saldoReservado;

	public CuentaDeAhorros() {
		super();
		this.saldoReservado = 0;
	}

	public CuentaDeAhorros(double monto, double montoReservado) {
		super(monto);
		if (montoReservado > 0) {
			if (montoReservado <= monto) {
				this.saldoReservado = montoReservado;
				saldo-= montoReservado;
			}
			else
				throw new IllegalArgumentException("Saldo insuficiente para el monto reservado");
		} else
			throw new IllegalArgumentException("El monto a reservar debe ser mayor que cero");
	}

	public double consultarSaldoReservado() {
		return this.saldoReservado;
	}

	public void agregarSaldoReservado(double monto, String motivo) {
		if (monto > 0) {
			if (monto <= saldo) {
				this.saldoReservado += monto;
				saldo -= monto;
				transacciones.add(new Transaccion(-monto, motivo));
			} else
				throw new IllegalArgumentException("Saldo insuficiente para el monto reservado");
		} else
			throw new IllegalArgumentException("La cantidad a reservar debe ser mayor que cero");
	}

	public void reintegrarSaldo(double monto, String motivo) {
		if (monto > 0) {
			if (monto <= this.saldoReservado) {
				this.saldoReservado -= monto;
				saldo += monto;
				transacciones.add(new Transaccion(monto, motivo));
			} else
				throw new IllegalArgumentException("Saldo reservado insuficiente para el reintegro");
		} else
			throw new IllegalArgumentException("La cantidad a reintegrar debe ser mayor que cero");
	}

}
