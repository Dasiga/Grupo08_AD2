package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidad.Soldado;

class TestSoldado {
	
	// Declaramos varias entidades de soldado
	
	private Soldado soldado1 = new Soldado();
	private Soldado soldado2 = new Soldado();
	private Soldado soldado3 = new Soldado();
	private Soldado soldado4 = new Soldado();
	
	@BeforeEach
	
	// Inicializamos las propiedades a sus valores conocidos para realizar cada test.
	
	public void inicializacion() {
	
		soldado1.setEstaMuerto(false);
		soldado2.setEstaMuerto(false);
		soldado3.setEstaMuerto(false);
		soldado4.setEstaMuerto(false);
		
		soldado1.setNumeroBalas(0);
		soldado2.setNumeroBalas(0);
		soldado3.setNumeroBalas(0);
		soldado4.setNumeroBalas(0);
			
	} 
	
	@Test
	void testPuedeDisparar1() {
		soldado1.setNumeroBalas(15);
		assertTrue(soldado1.puedeDisparar());
	}
	
	@Test
	void testPuedeDisparar2() {
		soldado1.setNumeroBalas(1);
		assertTrue(soldado1.puedeDisparar());
	}
	
	@Test
	void testPuedeDisparar3() {
		soldado1.setNumeroBalas(56);
		assertTrue(soldado1.puedeDisparar());
	}
	
	@Test
	void testPuedeDisparar4() {
		soldado4.setNumeroBalas(0);
		assertFalse(soldado4.puedeDisparar());
	}
	
	@Test
	void testPuedeDisparar5() {
		soldado3.setNumeroBalas(-5);
		assertFalse(soldado3.puedeDisparar());
	}
	
	@Test
	void testPuedeDisparar6() {
		soldado2.setNumeroBalas(-20);
		assertFalse(soldado2.puedeDisparar());
	}
	
	@Test
	void testDisparar1() {
		soldado1.setNumeroBalas(10);
		int numeroBalas = soldado1.getNumeroBalas();
		soldado1.disparar(soldado2);
		
		assertTrue(soldado2.isEstaMuerto());
		assertEquals(numeroBalas -1,soldado1.getNumeroBalas());
		
	}
	
	
	@Test
	void testDisparar2() {
		
		soldado1.setNumeroBalas(1);
		int numeroBalas = soldado3.getNumeroBalas();
		soldado3.disparar(soldado4);
		
		assertTrue(soldado4.isEstaMuerto());
		assertEquals(numeroBalas -1,soldado3.getNumeroBalas());
	}
	
	

}
