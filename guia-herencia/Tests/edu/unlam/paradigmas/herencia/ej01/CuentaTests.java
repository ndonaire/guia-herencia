package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTests {

	// @Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaldoInicialCero() {
		Cuenta cuenta = new Cuenta();

		assertEquals(cuenta.consultarSaldo(), 0, 0.1);
	}

	@Test
	public void testSaldoInicialMayorACero() {
		double saldo = 1900.24;
		Cuenta cuenta = new Cuenta(saldo);

		assertEquals(cuenta.consultarSaldo(), 1900.24, 0.1);
	}

	@Test
	public void testSaldoInicialNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double saldo = -1900.24;
			Cuenta cuenta = new Cuenta(saldo);
			System.out.println(cuenta.saldo);
		});
	}

	@Test
	public void testDepositar() {
		double saldo = 1900.24;
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(saldo, "Deposito");

		assertEquals(cuenta.consultarSaldo(), 1900.24, 0.1);
	}

	@Test
	public void testDepositarSaldoNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double saldo = -1900.24;
			Cuenta cuenta = new Cuenta();
			cuenta.depositar(saldo, "Deposito");
		});
	}

	@Test
	public void testExtraer() {
		double saldo = 1900.24;
		Cuenta cuenta = new Cuenta(saldo);
		cuenta.extraer(500, "Extracción");

		assertEquals(cuenta.consultarSaldo(), 1400.24, 0.1);
	}

	@Test
	public void testExtraerSaldoNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double saldo = 1900.24;
			Cuenta cuenta = new Cuenta(saldo);
			cuenta.extraer(-500, "Extracción");
		});
	}

	@Test
	public void testExtraerSaldoInsuf() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double saldo = 1900.24;
			Cuenta cuenta = new Cuenta(saldo);
			cuenta.extraer(5000, "Extracción");
		});
	}

	@Test
	public void testTrasnferir() {
		Cuenta cuentaOrigen = new Cuenta(1000);
		Cuenta cuentaDestino = new Cuenta();
		cuentaOrigen.transferir(500, "Transferencia", cuentaDestino);

		assertEquals(cuentaDestino.consultarSaldo(), 500, 0.1);
	}

	@Test
	public void testTrasnferirMontoNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			Cuenta cuentaOrigen = new Cuenta(1000);
			Cuenta cuentaDestino = new Cuenta();
			cuentaOrigen.transferir(-500, "Transferencia", cuentaDestino);
		});
	}
	
	@Test
	public void testTrasnferirSaldoInsuf() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			Cuenta cuentaOrigen = new Cuenta(1000);
			Cuenta cuentaDestino = new Cuenta();
			cuentaOrigen.transferir(5000, "Transferencia", cuentaDestino);
		});
	}

}
