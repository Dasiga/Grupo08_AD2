package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entidad.Soldado;

class TestSoldado {

	Soldado s = new Soldado();
	@Test
	void test() {
		
		s.setNumeroBalas(230);
		
		s.puedeDisparar();
	}

}
