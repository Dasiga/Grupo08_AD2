package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidad.Jugador;

class TestJugador {

	private Jugador j = new Jugador();
	@BeforeEach
	
	public void inicializacion() {
		
	j = new Jugador();
	
	}
	@Test
	public void testPonerDorsal1() {
		
		j.ponerDorsal(130);
		assertNotEquals(130, j.getDorsal());
	}
	@Test
	public void testEstarExpulsado() {
		
		j.setNumeroTarjetasAmarillas(2);
		boolean resultado =j.estaExpulsado();
		assertTrue(resultado);
		
		j.setNumeroTarjetasRojas(1);
		boolean resultado2 =j.estaExpulsado();
		assertTrue(resultado2);
	}
}
