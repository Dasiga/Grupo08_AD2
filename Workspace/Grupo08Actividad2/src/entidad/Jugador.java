package entidad;
/**
 * Esta clase define el estado y métodos de la clase Jugador.
 * @author Pablo
 *
 */
public class Jugador {

	private int dorsal;
	private int numeroTarjetasAmarillas;
	private int numeroTarjetasRojas;
	
	/**
	 * 
	 * @return Devuelve un valor int con el numero de dorsal.
	 */
	public int getDorsal() {
		return dorsal;
	}
	/**
	 * 
	 * @param dorsal Definimos el numero de dorsal, le pasamos un valor int.
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	/**
	 * 
	 * @return Devuelve un valor int con el numero de tarjetas amarillas que ha recibido el jugador.
	 */
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	
	/**
	 * 
	 * @param numeroTarjetasAmarillas Definimos el numero de tarjetas amarillas que ha recibido el jugador.
	 */
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	
	/**
	 * 
	 * @return Devuelve un valor int con el numero de tarjetas rojas que ha recibido el jugador.
	 */
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	
	/** 
	 * 
	 * @param numeroTarjetasRojas Definimos un valor int con el numero de tarjetas rojas que ha recibido el jugador.
	 */
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	/**
	 * Este método asignará un numero de dorsal al jugador siempre y cuando este se encuentre entre 1 y 30 inclusives. En caso contrario
	 * se definirá el valor de -1 al numero de dorsal.
	 * @param dorsal Le pasamos un valor int con el numero de dorsal que deseamos ponerle al jugador.
	 */
    public void ponerDorsal(int dorsal) {
    	
        if(dorsal >= 1 && dorsal <= 30)                     
        	this.dorsal = dorsal;
        else               
        	this.dorsal = -1;
    }

    /**
     * Este método esta definido para saber si un jugador esta expulsado.
     * @return Nos devuelve un boolean con estado True si el jugador a recibido 2 tarjetas amarillas o bien 1 tarjeta roja. En caso contrario
     * nos devolverá un boolean con estado False.
     */
    public boolean estaExpulsado() {

        boolean expulsado = false;                                                  

        if(numeroTarjetasAmarillas == 2)                     
        	expulsado = true;      

        if(numeroTarjetasRojas == 1) 
                      expulsado = true;        
        
        return expulsado;
    }    
    
}
