package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entidad.Soldado;

class TestSoldado {

	@Test
	void probandoNumeroBalasYDisparar() {
		Soldado S1 = new Soldado();
		S1.setNumeroBalas(3);
		assertTrue(S1.puedeDisparar());
		
	}
	@Test
	void probandoDipararYEstaMuerto() {
		Soldado S1 = new Soldado();
		S1.setNumeroBalas(3);
		S1.disparar(S1);
		assertTrue(S1.isEstaMuerto());
		
	}
	@Test
	void probandoBalas() {
		Soldado S1 = new Soldado();
		S1.setNumeroBalas(3);
		assertEquals(S1.getNumeroBalas(),3);
		
	}
}
