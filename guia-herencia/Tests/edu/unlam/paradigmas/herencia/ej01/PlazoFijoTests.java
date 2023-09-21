package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlazoFijoTests {

	// @Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testCrearPlazoFijo() {
		CuentaCorriente cuenta = new CuentaCorriente(1000, 200);
		PlazoFijo pf = new PlazoFijo(cuenta, 100);

		assertEquals(pf.consultarMontoReservado(), 100, 0.1);
		assertEquals(pf.consultarCuentaAsociada(), cuenta);
	}

	@Test
	void testCrearPlazoFijoMontoNeg() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> {
			CuentaCorriente cuenta = new CuentaCorriente(1000, 200);
			PlazoFijo pf = new PlazoFijo(cuenta, -100);
			System.out.print(pf.consultarMontoReservado());
		});
	}
	
	@Test
	void testDepositarIntereses() {
		CuentaCorriente cuenta = new CuentaCorriente(1000, 200);
		PlazoFijo pf = new PlazoFijo(cuenta, 100);
		pf.depositarIntereses();
		
		assertEquals(cuenta.consultarSaldo(),1103.0, 0.1);
	}

}
