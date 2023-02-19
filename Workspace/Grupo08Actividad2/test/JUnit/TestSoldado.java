package JUnit;

import entidad.Soldado;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	void testFuncDisparar() {
		int currentBalas = -1;	//Balas que se quedan al terminar de disparar
		
		soldado1.disparar(soldado2);
		
		assertTrue(soldado2.isEstaMuerto());				//true
		assertEquals(currentBalas, soldado1.getNumeroBalas());	//true
	}
}
