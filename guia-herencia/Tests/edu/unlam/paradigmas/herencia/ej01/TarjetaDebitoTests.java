package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaDebitoTests {

	// @Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testCrearTarjetaDebito() {
		CuentaDeAhorros cuenta = new CuentaDeAhorros(1000, 100);
		TarjetaDebito tc = new TarjetaDebito(cuenta);

		assertEquals(tc.consultarCuentaAsociada(), cuenta);
	}

	@Test
	void testRealizarCompra() {
		CuentaDeAhorros cuenta = new CuentaDeAhorros(1000, 100);
		TarjetaDebito tc = new TarjetaDebito(cuenta);
		tc.realizarCompra(10, "TEST COMPRA");

		assertEquals(cuenta.consultarSaldo(), 890, 0.1);
	}

	@Test
	void testRealizarCompraMontoNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			CuentaDeAhorros cuenta = new CuentaDeAhorros(1000, 100);
			TarjetaDebito tc = new TarjetaDebito(cuenta);
			tc.realizarCompra(-10, "TEST COMPRA NEG");
		});
	}
	
	@Test
	void testRealizarCompraSaldoInsuf() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			CuentaDeAhorros cuenta = new CuentaDeAhorros(1000, 100);
			TarjetaDebito tc = new TarjetaDebito(cuenta);
			tc.realizarCompra(10000, "TEST COMPRA SALDO INSUF");
		});
	}
}
