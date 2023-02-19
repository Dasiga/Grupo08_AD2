package entidad;
/**
 * Clase soldado en la que se definen los estados y atributos del soldado.
 * @author olgap
 *
 */
public class Soldado {
	/**
	 * @author olgap
	 * Condición booleana privada que servirá para definir si el soldado está muerto.
	 */
	private boolean estaMuerto;
	/**
	 * @author olgap
	 * Número privado que definirá la cantidad de munición del soldado.
	 */
	private int numeroBalas;
	
	/**
	 * @author olgap
	 * Booleana para definir si el soldado está muerto.
	 * @return devuelve el valor de que el soldado está muerto.
	 */
	public boolean isEstaMuerto() {
		return estaMuerto;
	}
	/**
	 * @author olgap
	 * Aplica el estado de muerto a un soldado.
	 * @param estaMuerto valor de booleana de si está muerto o no. 
	 */
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	/**
	 * @author olgap
	 * Obtiene el número de balas disponibles
	 * @return devuelve el número de balas obtenido.
	 */
	public int getNumeroBalas() {
		return numeroBalas;
	}
	/**
	 * @author olgap
	 * Establece la cantidad de balas disponibles.
	 * @param numeroBalas cantidad de balas disponibles.
	 */
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	/**
	 * @author olgap
	 * Define la capacidad de disparo en función de si hay balas disponibles o no.
	 * @return devuelve positivo si quedan balas, devuelve negativo si no quedan balas.
	 */
	public boolean puedeDisparar() {
		
		if(this.numeroBalas > 0)
			return true;
		
		return false;		
	}
	/**
	 * @author olgap
	 * Define la acción del disparo. Recibe el parámetro del soldado. Al ejecutarse resta balas de la cantidad
	 * total de balas disponibles y adjudica el estado de estaMuerto al soldado.
	 * @param sol
	 */
	public void disparar(Soldado sol) {
		
		this.numeroBalas--;
		
		sol.estaMuerto = true;
	}
}
