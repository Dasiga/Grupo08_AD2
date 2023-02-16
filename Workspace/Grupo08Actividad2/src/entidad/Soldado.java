package entidad;

/**
 * Clase que da forma a la entidad <b>Soldado</b> indicando por sus atributos si está muerta y la cantidad de balas de la que dispone.
 * y podrá utilizar los métodos de disparar a otro soldado y saber si puede disparar según sus balas.
 * @author diego de silva
 * @version 0.1
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
	 * Permite saber si este Soldado tiene balas disponibles (al menos 1)
	 * 
	 * @author diego de silva
	 * @return Devuelve <b>true</b> si tenemos suficientes balas. <p>En caso contrario devuelve <b>false</b>
	 */
	public boolean puedeDisparar() {
		
		if(this.numeroBalas > 0)
			return true;
		
		return false;
		
	}
	
	/**
	 * Utiliza 1 bala para cambiar el estado 
	 * del <b>Soldado</b> objetivo a <b>muerto</b> 
	 * @param sol Soldado objetivo que va a morir
	 */
    public void disparar(Soldado sol) {

        this.numeroBalas--;

        sol.estaMuerto = true;
    }  
}
