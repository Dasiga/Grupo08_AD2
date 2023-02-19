package entidad;

/** El objetivo de esta clase es definir el estado y funciones de un <b> Soldado <b>.
 * Disponemos de los siguientes métodos:
 * - puedeDisparar()
 * - disparar()
 * 
 * @author Juan Pablo Tecchia
 * @version 1.0
 */
public class Soldado {

	/**
	 * Indicador para saber si la entidad está meurta o no.
	 * @author diego de silva
	 */
	private boolean estaMuerto;
	/**
	 * Cantidad de balas que dispone el Soldado para su uso 
	 * @author diego de silva
	 */
	private int numeroBalas;
	
	//Los get and set no se documentan	
	//is cambia por get porque es un indicador en los booleans.
	public boolean isEstaMuerto() {
		return estaMuerto;
	}
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	public int getNumeroBalas() {
		return numeroBalas;
	}
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	/**
     * 
     * Define la capacidad de disparo en función de si hay balas disponibles o no.
     * @author Olga
     * @return devuelve true si quedan balas, devuelve false si no quedan balas.
     */
	public boolean puedeDisparar() {
		
		if(this.numeroBalas > 0)
			return true;
		
		return false;
		
	}
	
	/**
	 * Utiliza 1 bala para cambiar el estado 
	 * del <b>Soldado</b> objetivo a <b>muerto</b> 
	 * @author diego de silva
	 * @param sol Soldado objetivo que va a morir
	 */
    public void disparar(Soldado sol) {

        this.numeroBalas--;

        sol.estaMuerto = true;
    }  
}
