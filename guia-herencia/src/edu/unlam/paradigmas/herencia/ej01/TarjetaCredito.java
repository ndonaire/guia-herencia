package edu.unlam.paradigmas.herencia.ej01;

public class TarjetaCredito {

	private Cuenta cuentaAsociada;
	private double saldoCompras = 0;
	private double comision = 0.03;
	private String motivo = "Pago tarjeta de crédito";

	public TarjetaCredito(Cuenta cuenta) {
		this.cuentaAsociada = cuenta;
	}

	public Cuenta consultarCuentaAsociada() {
		return this.cuentaAsociada;
	}

	public double consultarSaldoCompras() {
		return this.saldoCompras;
	}

	public void realizarCompra(double monto, String motivo) {
		if (monto > 0) {
			saldoCompras += monto;
			cuentaAsociada.transacciones.add(new Transaccion(monto, motivo));
		} else
			throw new IllegalArgumentException("El monto de la compra debe ser mayor que cero");
	}

	public void pagarSaldoPendiente() {
		double monto = saldoCompras + saldoCompras * comision;
		if(monto <= this.cuentaAsociada.consultarSaldo()) {
			this.cuentaAsociada.extraer(monto, this.motivo);
			this.saldoCompras = 0;
		}
		else
			throw new IllegalArgumentException("Pagale a Visa, o te cortará una pierna");
	}
}
