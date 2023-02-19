package JUnit;

import entidad.Jugador;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJugador {
	
	private Jugador jugador1 = new Jugador();
	
	@BeforeEach 

    // Antes de cada test inicializamos las propiedades a sus valores conocidos para realizar cada test.

    public void inicializacion() {
		
        jugador1 = new Jugador();
        
    }
	
	@Test
    void probandoDorsalError () {     
        jugador1.ponerDorsal(33);
        assertNotEquals(jugador1.getDorsal(),33);
    }
	
	@Test
    void probandoDorsalJugador () {
        jugador1.ponerDorsal(25);
        assertEquals(jugador1.getDorsal(), 25);
    }
	
	@Test
	void testFuncPonerDorsalLimites() {
		//El test ejecutará para: (Lo que aparece entre () son la cantidad de pruebas)
		// > Cuando el valor esté comprendido en la condición (1)
		// > Los límites inclusivos (2)
		// > Valores ajenos a esta condición (2)
		// > Cuando el valor sea -1 que es al valor que cambia en caso de no entrar en al condición (1)		
		//Cuando el valor no está comprendido entre 1 y 30 y es inferior a los límites			
		int expected = -123;		
		jugador1.ponerDorsal(expected);	
		int obtained = jugador1.getDorsal();
							
		assertNotEquals(obtained, expected);
		
		//Cuando el valor es -1
		expected = -1;
		jugador1.ponerDorsal(expected);
		obtained = jugador1.getDorsal();
		
		assertEquals(obtained, expected);
		
		//Cuando el valor está en el límite izquierdo de la condición
		expected = 1;		
		jugador1.ponerDorsal(expected);	
		obtained = jugador1.getDorsal();
		
		assertEquals(obtained, expected);
		
		//Cuando el valor está en el límite derecho de la condición
		expected = 30;		
		jugador1.ponerDorsal(expected);	
		obtained = jugador1.getDorsal();
		
		assertEquals(obtained, expected);
	}
	
	@Test
	void testFuncEstaExpulsadoAmarillas() {
		//El test ejecutará para: (Lo que aparece entre () son la cantidad de pruebas) 
		// > En momento de instancia debe tener 0 (1)
		// > Cuando la tarjeta tenga menos que el indicador (1)
		// > Cuando la tarjeta tenga el valor del indicador (1)
		// > Cuando la tarjeta tenga más que el indicador (1)
		int numeroAmarillas = 0;
		boolean obtained = jugador1.estaExpulsado();
		
		assertFalse(obtained);
		
		numeroAmarillas = 1;
		jugador1.setNumeroTarjetasAmarillas(numeroAmarillas);
		obtained = jugador1.estaExpulsado();
		
		assertFalse(obtained);
		
		numeroAmarillas = 2;
		jugador1.setNumeroTarjetasAmarillas(numeroAmarillas);
		obtained = jugador1.estaExpulsado();
		
		assertTrue(obtained);		
		
		numeroAmarillas = 3;
		jugador1.setNumeroTarjetasAmarillas(numeroAmarillas);
		obtained = jugador1.estaExpulsado();
		
		assertFalse(obtained);		
	}
	
	@Test
	void testFuncEstaExpulsadoRojas() {
		//El test ejecutará para: (Lo que aparece entre () son la cantidad de pruebas) 
		// > En momento de instancia debe tener 0 (1)
		// > Cuando la tarjeta tenga menos que el indicador (1)
		// > Cuando la tarjeta tenga el valor del indicador (1)
		// > Cuando la tarjeta tenga más que el indicador (1)	
		int numeroRojas = 0;
		boolean obtained = jugador1.estaExpulsado();
				
		assertFalse(obtained);
				
		numeroRojas = 0;
		jugador1.setNumeroTarjetasRojas(numeroRojas);
		obtained = jugador1.estaExpulsado();
				
		assertFalse(obtained);
				
		numeroRojas = 1;
		jugador1.setNumeroTarjetasRojas(numeroRojas);
		obtained = jugador1.estaExpulsado();
			
		assertTrue(obtained);		
				
		numeroRojas = 3;
		jugador1.setNumeroTarjetasRojas(numeroRojas);
		obtained = jugador1.estaExpulsado();
				
		assertFalse(obtained);	
	}
	

	@Test
	void testFuncEstaExpulsadoAmbas() {
		//Se combinarán ambos test (amarillas y rojas) pero sin repetir patrones anteriores por lo que al menos habrá 1 tarjeta en cada
		//El test ejecutará para: (Lo que aparece entre () son la cantidad de pruebas)			
		// > Cuando tienes 1 amarilla y 1 roja
		// > Cuando tienes 3 amarillas y 1 roja
		// > Cuando tienes 2 amarillas y 1 roja
		// > Cuando tienes 1 amarilla y 3 rojas
		jugador1.setNumeroTarjetasAmarillas(1); 
		jugador1.setNumeroTarjetasRojas(1);
				
		assertTrue(jugador1.estaExpulsado());
		
		jugador1.setNumeroTarjetasAmarillas(3);
		jugador1.setNumeroTarjetasRojas(1);
		
		assertTrue(jugador1.estaExpulsado());
		
		jugador1.setNumeroTarjetasAmarillas(2);
		jugador1.setNumeroTarjetasRojas(1);
		
		assertTrue(jugador1.estaExpulsado());
		
		jugador1.setNumeroTarjetasAmarillas(1);
		jugador1.setNumeroTarjetasRojas(3);
		
		assertFalse(jugador1.estaExpulsado());	
	}

}
