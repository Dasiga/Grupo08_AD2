package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidad.Jugador;

class TestJugador {
	
	private Jugador jugador1 = new Jugador();
	
	
	@BeforeEach 
	
	// Antes de cada test inicializamos las propiedades a sus valores conocidos para realizar cada test.
	
	public void inicializacion() {
	
		jugador1.setNumeroTarjetasAmarillas(0);
		jugador1.setNumeroTarjetasRojas(0);
		jugador1.setDorsal(1);
		
	} 
	
	
	
	@Test
	void testPonerDorsalEnRango1() {
		
		jugador1.ponerDorsal(5);
		assertTrue(jugador1.getDorsal() == 5);
		
	}
	
	@Test
	void testPonerDorsalEnRango2() {
		
		jugador1.ponerDorsal(1);
		assertTrue(jugador1.getDorsal() == 1);
	
	}
	
	@Test
	void testPonerDorsalEnRango3() {
		
		jugador1.ponerDorsal(30);
		assertTrue(jugador1.getDorsal() == 30);
		
	}
	
	@Test
	
	void testDorsalFueraRango1() {
		
		jugador1.ponerDorsal(-1);
		assertTrue(jugador1.getDorsal() == -1);
	
	}
	
	void testDorsalFueraRango2() {
		
		jugador1.ponerDorsal(31);
		assertTrue(jugador1.getDorsal() == -1);
		
	}
	
	void testDorsalFueraRango3() {
		
		jugador1.ponerDorsal(0);
		assertTrue(jugador1.getDorsal() == -1);
		
	}
	void testDorsalFueraRango4() {
		
		jugador1.ponerDorsal(50);
		assertTrue(jugador1.getDorsal() == -1);
		
	}
	
	@Test
	void testExpulsion1() {
		
		jugador1.setNumeroTarjetasAmarillas(1);
		assertFalse(jugador1.estaExpulsado());
		
	}
	
	@Test
	void testExpulsion2() {
		
		jugador1.setNumeroTarjetasAmarillas(2);
		assertTrue(jugador1.estaExpulsado());
	}
	
	@Test
	void testExpulsion3() {
		
		jugador1.setNumeroTarjetasRojas(0);
		assertFalse(jugador1.estaExpulsado());
		
	}
	@Test
	void testExpulsion4() {
		
		jugador1.setNumeroTarjetasRojas(1);
		assertTrue(jugador1.estaExpulsado());
		
	}

}
