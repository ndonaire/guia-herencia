package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTests {

	// @Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testCrearCuentaCorrienteEnCero() {
		CuentaCorriente cuenta = new CuentaCorriente();

		assertEquals(cuenta.consultarSaldo(), 0, 0.1);
		assertEquals(cuenta.consultarSaldoEnDescubierto(), 0, 0.1);
	}

	@Test
	public void testCrearCuentaCorriente() {
		double montoInicial = 1000;
		double montoEncubierto = 400;
		CuentaCorriente cuenta = new CuentaCorriente(montoInicial, montoEncubierto);

		assertEquals(cuenta.consultarSaldo(), 1000, 0.1);
		assertEquals(cuenta.consultarSaldoEnDescubierto(), 400, 0.1);
	}

	@Test
	public void testCrearCuentaCorrienteSaldoDescNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double montoInicial = 1000;
			double montoEncubierto = -400;
			CuentaCorriente cuenta = new CuentaCorriente(montoInicial, montoEncubierto);
			System.out.println(cuenta.consultarSaldo());
		});
	}

	@Test
	public void testExtraerSaldo() {
		double montoInicial = 1000;
		double montoEncubierto = 400;
		CuentaCorriente cuenta = new CuentaCorriente(montoInicial, montoEncubierto);
		cuenta.extraer(500, "Extracción");

		assertEquals(cuenta.consultarSaldo(), 500, 0.1);
	}

	@Test
	public void testExtraerSaldoEncubierto() {
		double montoInicial = 1000;
		double montoEncubierto = 400;
		CuentaCorriente cuenta = new CuentaCorriente(montoInicial, montoEncubierto);
		cuenta.extraer(1200, "Extracción");

		assertEquals(cuenta.consultarSaldo(), 0, 0.1);
		assertEquals(cuenta.consultarSaldoEnDescubierto(), 200, 0.1);
	}

	@Test
	public void testExtraerSaldoInsuf() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double montoInicial = 1000;
			double montoEncubierto = 400;
			CuentaCorriente cuenta = new CuentaCorriente(montoInicial, montoEncubierto);
			cuenta.extraer(2000, "Extracción");
		});
	}

	@Test
	public void testExtraerSaldoNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double montoInicial = 1000;
			double montoEncubierto = 400;
			CuentaCorriente cuenta = new CuentaCorriente(montoInicial, montoEncubierto);
			cuenta.extraer(-2000, "Extracción");
		});
	}
}
