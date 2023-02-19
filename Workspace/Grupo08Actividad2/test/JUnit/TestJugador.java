package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entidad.Jugador;

class TestJugador {

	Jugador j = new Jugador();
	@Test
	void test() {
		
	
		j.setNumeroTarjetasRojas(1);
		
		j.estaExpulsado();
		
	}

}
