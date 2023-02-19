package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidad.Soldado;

class TestSoldado {
/**
 * Creamos los soldados.
 */
	Soldado s = new Soldado();
	Soldado s2 = new Soldado();
	
	/**
	 * test.
	 */
	@BeforeEach
	public void inicializacion() {
	 s2 = new Soldado();
	 s = new Soldado();
	}
	@Test
	public void testPuedeDisparar() {
		s.setNumeroBalas(25);
		assertTrue(s.puedeDisparar());
		
		s2.setNumeroBalas(-5);
		assertFalse(s2.puedeDisparar());
	}
	@Test
	public void testSoldadoMuerto() {
		int balas = -1;
		s2.disparar(s);
		assertTrue(s.isEstaMuerto());
		
	}

	
}
