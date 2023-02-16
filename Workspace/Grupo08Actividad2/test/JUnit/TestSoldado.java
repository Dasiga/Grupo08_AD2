package JUnit;

import entidad.Soldado;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSoldado {
	
	@Test
	void testFuncPuedeDisparar() {
		
		//int numero de balas tiene 2 resultados: true y false
		//además, la condición es una comparativa como límite en 0 lo que para el resultado
		//Por lo que haremos 1 en momento de creación, 1 con balas > 0 y otra con balas <= 0
 		Soldado sol = new Soldado();
		
		assertFalse(sol.puedeDisparar());	//En momento de creación no tiene Balas
		
		//Cambiamos el número de balas para comprobar los estados de la condición.
		sol.setNumeroBalas(1);
		assertTrue(sol.puedeDisparar());	//true
		
		sol.setNumeroBalas(0);				
		assertFalse(sol.puedeDisparar());	//false
		
		sol.setNumeroBalas(-1);
		assertFalse(sol.puedeDisparar());	//false
	}

	@Test
	void testFuncDisparar() {
		//Necesitamos 2 soldados para esta funcion
		//La función contiene una operación int y otra boolean asique se necesitan 2 Aserciones
		Soldado mySol = new Soldado();		//Soldado que va a disparar
		Soldado targetSol = new Soldado();	//Soldado que va a recibir el disparo
		
		int currentBalas = -1;	//Balas que se quedan al terminar de disparar
		
		mySol.disparar(targetSol);
		
		assertTrue(targetSol.isEstaMuerto());				//true
		assertEquals(currentBalas, mySol.getNumeroBalas());	//true
	}
}
