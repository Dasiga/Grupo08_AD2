package JUnit;

import entidad.Jugador;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJugador {

	@Test
	void testFuncPonerDorsal() {
		//El test ejecutará para: (Lo que aparece entre () son la cantidad de pruebas)
		// > Cuando el valor esté comprendido en la condición (1)
		// > Los límites inclusivos (2)
		// > Valores ajenos a esta condición (2)
		// > Cuando el valor sea -1 que es al valor que cambia en caso de no entrar en al condición (1)
		Jugador j = new Jugador();
		
		//Cuando el valor está comprendido entre 1 y 30
		int expected = 12;
		j.ponerDorsal(expected);
		int obtained = j.getDorsal();
		
		assertEquals(obtained, expected);
		
		//Cuando el valor no está comprendido entre 1 y 30 y es superior a los límites			
		expected = 43;		
		j.ponerDorsal(expected);	
		obtained = j.getDorsal();
					
		assertNotEquals(obtained, expected);
		
		//Cuando el valor no está comprendido entre 1 y 30 y es inferior a los límites			
		expected = -123;		
		j.ponerDorsal(expected);	
		obtained = j.getDorsal();
							
		assertNotEquals(obtained, expected);
		
		//Cuando el valor es -1
		expected = -1;
		j.ponerDorsal(expected);
		obtained = j.getDorsal();
		
		assertEquals(obtained, expected);
		
		//Cuando el valor está en el límite izquierdo de la condición
		expected = 1;		
		j.ponerDorsal(expected);	
		obtained = j.getDorsal();
		
		assertEquals(obtained, expected);
		
		//Cuando el valor está en el límite derecho de la condición
		expected = 30;		
		j.ponerDorsal(expected);	
		obtained = j.getDorsal();
		
		assertEquals(obtained, expected);
	}
	
	@Test
	void testFuncEstaExpulsadoAmarillas() {
		//El test ejecutará para: (Lo que aparece entre () son la cantidad de pruebas) 
		// > En momento de instancia debe tener 0 (1)
		// > Cuando la tarjeta tenga menos que el indicador (1)
		// > Cuando la tarjeta tenga el valor del indicador (1)
		// > Cuando la tarjeta tenga más que el indicador (1)
		Jugador j = new Jugador();
		
		int numeroAmarillas = 0;
		boolean obtained = j.estaExpulsado();
		
		assertFalse(obtained);
		
		numeroAmarillas = 1;
		j.setNumeroTarjetasAmarillas(numeroAmarillas);
		obtained = j.estaExpulsado();
		
		assertFalse(obtained);
		
		numeroAmarillas = 2;
		j.setNumeroTarjetasAmarillas(numeroAmarillas);
		obtained = j.estaExpulsado();
		
		assertTrue(obtained);		
		
		numeroAmarillas = 3;
		j.setNumeroTarjetasAmarillas(numeroAmarillas);
		obtained = j.estaExpulsado();
		
		assertFalse(obtained);		
	}
	
	@Test
	void testFuncEstaExpulsadoRojas() {
		//El test ejecutará para: (Lo que aparece entre () son la cantidad de pruebas) 
		// > En momento de instancia debe tener 0 (1)
		// > Cuando la tarjeta tenga menos que el indicador (1)
		// > Cuando la tarjeta tenga el valor del indicador (1)
		// > Cuando la tarjeta tenga más que el indicador (1)
		Jugador j = new Jugador();
				
		int numeroRojas = 0;
		boolean obtained = j.estaExpulsado();
				
		assertFalse(obtained);
				
		numeroRojas = 0;
		j.setNumeroTarjetasRojas(numeroRojas);
		obtained = j.estaExpulsado();
				
		assertFalse(obtained);
				
		numeroRojas = 1;
		j.setNumeroTarjetasRojas(numeroRojas);
		obtained = j.estaExpulsado();
			
		assertTrue(obtained);		
				
		numeroRojas = 3;
		j.setNumeroTarjetasRojas(numeroRojas);
		obtained = j.estaExpulsado();
				
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
		Jugador j = new Jugador();
		
		j.setNumeroTarjetasAmarillas(1); 
		j.setNumeroTarjetasRojas(1);
				
		assertTrue(j.estaExpulsado());
		
		j.setNumeroTarjetasAmarillas(3);
		j.setNumeroTarjetasRojas(1);
		
		assertTrue(j.estaExpulsado());
		
		j.setNumeroTarjetasAmarillas(2);
		j.setNumeroTarjetasRojas(1);
		
		assertTrue(j.estaExpulsado());
		
		j.setNumeroTarjetasAmarillas(1);
		j.setNumeroTarjetasRojas(3);
		
		assertFalse(j.estaExpulsado());	
	}

}
