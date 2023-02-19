package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entidad.Jugador;

class TestJugador {

	@Test
	void probandoDorsalJugador () {
		Jugador J1 = new Jugador();
		J1.ponerDorsal(25);
		assertEquals(J1.getDorsal(), 25);	
	}
	@Test
	void probandoDorsalError () {
		Jugador J1 = new Jugador();
		J1.ponerDorsal(33);
		assertNotEquals(J1.getDorsal(),33);
	}
	@Test
	void probandoExpulsionJugador() {
		Jugador J1 = new Jugador();
		J1.setNumeroTarjetasRojas(1);
		assertTrue(J1.estaExpulsado());
	}
	@Test
	void probandoExpulsionConAmarillas() {
		Jugador J1 = new Jugador();
		J1.setNumeroTarjetasAmarillas(1);
		assertFalse(J1.estaExpulsado());
		
	}
	
	

}
