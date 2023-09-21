package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaCreditoTests {

	// @Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testCrearTarjetaCredito() {
		CuentaDeAhorros cuenta = new CuentaDeAhorros(1000, 100);
		TarjetaCredito tc = new TarjetaCredito(cuenta);

		assertEquals(tc.consultarCuentaAsociada(), cuenta);
	}

	@Test
	void testRealizarCompra() {
		CuentaDeAhorros cuenta = new CuentaDeAhorros(1000, 100);
		TarjetaCredito tc = new TarjetaCredito(cuenta);
		tc.realizarCompra(100, "TEST COMPRA");

		assertEquals(tc.consultarSaldoCompras(), 100, 0.1);
	}

	@Test
	void testRealizarCompraSaldoNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			CuentaDeAhorros cuenta = new CuentaDeAhorros(1000, 100);
			TarjetaCredito tc = new TarjetaCredito(cuenta);
			tc.realizarCompra(-100, "TEST COMPRA NEG");
		});

	}

	@Test
	void testPagarTarjeta() {
		CuentaDeAhorros cuenta = new CuentaDeAhorros(1000, 100);
		TarjetaCredito tc = new TarjetaCredito(cuenta);
		tc.realizarCompra(100, "TEST COMPRA");
		tc.realizarCompra(200, "TEST COMPRA2");
		tc.pagarSaldoPendiente();

		assertEquals(tc.consultarSaldoCompras(), 0, 0.1);
		assertEquals(cuenta.consultarSaldo(), 591, 0.1);
	}

	@Test
	void testPagarTarjetaSaldoInsuf() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			CuentaDeAhorros cuenta = new CuentaDeAhorros(1000, 100);
			TarjetaCredito tc = new TarjetaCredito(cuenta);
			tc.realizarCompra(1000, "TEST COMPRA");
			tc.realizarCompra(2000, "TEST COMPRA2");
			tc.pagarSaldoPendiente();
		});
	}
}
