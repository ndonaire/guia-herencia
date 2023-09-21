package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaDeAhorrosTests {

	// @Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testCrearCuentaAhorrosEnCero() {
		CuentaDeAhorros cuenta = new CuentaDeAhorros();

		assertEquals(cuenta.consultarSaldo(), 0, 0.1);
		assertEquals(cuenta.consultarSaldoReservado(), 0, 0.1);
	}

	@Test
	void testCrearCuentaAhorros() {
		double monto = 1000;
		double montoReservado = 200;
		CuentaDeAhorros cuenta = new CuentaDeAhorros(monto, montoReservado);

		assertEquals(cuenta.consultarSaldo(), 800, 0.1);
		assertEquals(cuenta.consultarSaldoReservado(), 200, 0.1);
	}

	@Test
	void testCrearCuentaAhorrosSaldoNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double monto = 1000;
			double montoReservado = -200;
			CuentaDeAhorros cuenta = new CuentaDeAhorros(monto, montoReservado);
			System.out.print(cuenta.consultarSaldo());
		});
	}

	@Test
	void testCrearCuentaAhorrosSaldoInsuf() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double monto = 1000;
			double montoReservado = 2000;
			CuentaDeAhorros cuenta = new CuentaDeAhorros(monto, montoReservado);
			System.out.print(cuenta.consultarSaldo());
		});
	}

	@Test
	void testAgregarSaldoReservado() {
		double monto = 1000;
		double montoReservado = 100;
		CuentaDeAhorros cuenta = new CuentaDeAhorros(monto, montoReservado);
		cuenta.agregarSaldoReservado(100, "TEST RESERVA");

		assertEquals(cuenta.consultarSaldo(), 800, 0.1);
		assertEquals(cuenta.consultarSaldoReservado(), 200, 0.1);
	}

	@Test
	void testAgregarSaldoNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double monto = 1000;
			double montoReservado = 100;
			CuentaDeAhorros cuenta = new CuentaDeAhorros(monto, montoReservado);
			cuenta.agregarSaldoReservado(-100, "TEST RESERVA NEG");
		});
	}
	
	@Test
	void testAgregarSaldoInsuf() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			double monto = 1000;
			double montoReservado = 100;
			CuentaDeAhorros cuenta = new CuentaDeAhorros(monto, montoReservado);
			cuenta.agregarSaldoReservado(1000, "TEST RESERVA INSUF");
		});
	}
	
	@Test
	void testreintegrarSaldo() {
		double monto = 1000;
		double montoReservado = 200;
		CuentaDeAhorros cuenta = new CuentaDeAhorros(monto, montoReservado);
		cuenta.agregarSaldoReservado(100, "TEST RESERVA");
		cuenta.reintegrarSaldo(50, "TEST REINTEGRO");

		assertEquals(cuenta.consultarSaldo(), 750, 0.1);
		assertEquals(cuenta.consultarSaldoReservado(), 250, 0.1);
	}
	
	@Test
	void testreintegrarSaldonNeg()throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
		double monto = 1000;
		double montoReservado = 200;
		CuentaDeAhorros cuenta = new CuentaDeAhorros(monto, montoReservado);
		cuenta.agregarSaldoReservado(100, "TEST RESERVA");
		cuenta.reintegrarSaldo(-50, "TEST REINTEGRO NEG");});
	}
	
	@Test
	void testreintegrarSaldonInsuf()throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
		double monto = 1000;
		double montoReservado = 200;
		CuentaDeAhorros cuenta = new CuentaDeAhorros(monto, montoReservado);
		cuenta.agregarSaldoReservado(100, "TEST RESERVA");
		cuenta.reintegrarSaldo(5000, "TEST REINTEGRO INSUF");});
	}
}
