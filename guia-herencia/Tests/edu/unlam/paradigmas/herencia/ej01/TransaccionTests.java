package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransaccionTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCrearTransaccion() {
		Transaccion tx = new Transaccion(500,"TEST TX");
		
		assertEquals(tx.getMonto(),500);
		assertEquals(tx.getMotivo(),"TEST TX");
	}
}
