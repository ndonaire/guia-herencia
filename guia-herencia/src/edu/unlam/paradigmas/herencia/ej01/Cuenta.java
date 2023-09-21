package edu.unlam.paradigmas.herencia.ej01;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	protected double saldo;
	protected List<Transaccion> transacciones;

	public Cuenta() {
		this.saldo = 0;
		this.transacciones = new ArrayList<>();
	}

	public Cuenta(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
			this.transacciones = new ArrayList<>();
		} else
			throw new IllegalArgumentException(
					"La cantidad para la apertura de cuenta debe ser mayor o igual que cero");
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	public void depositar(double monto, String motivo) {
		if (monto > 0) {
			this.saldo += monto;
			transacciones.add(new Transaccion(monto, motivo));
		} else
			throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero");
	}

	public void extraer(double monto, String motivo) {
		if (monto > 0) {
			if (monto <= this.saldo) {
				this.saldo -= monto;
				transacciones.add(new Transaccion(-monto, motivo));
			} else
				throw new IllegalArgumentException("Saldo insuficiente para realizar la extracción");
		}

		else
			throw new IllegalArgumentException("La cantidad a extraer debe ser mayor que cero");
	}

	public void transferir(double monto, String motivo, Cuenta cuentaDestino) {
		if (monto > 0) {
			this.extraer(monto, motivo);
			cuentaDestino.depositar(monto, motivo);
			transacciones.add(new Transaccion(monto, motivo));
		}
		else
			throw new IllegalArgumentException("La cantidad a transferir debe ser mayor que cero");
	}
}
