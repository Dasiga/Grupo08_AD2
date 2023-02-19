package entidad;

/**
 * Esta clase define el estado y métodos de la clase Jugador así como sus propiedades.
 * Disponemos de los siguientes métodos:
 * - ponerDorsal();
 * - estaExpulsado();
 * @author Pablo
 * @version 1.0
 *
 */
public class Jugador {

	/**
	 * Indicador numérico del jugador 
	 */
	private int dorsal;
	/**
	 * Cantidad de tarjetas amarillas que tiene el jugador
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Cantidad de tarjetas rojas que tiene el jugador
	 */
	private int numeroTarjetasRojas;
	
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	/**
	 * ponerDorsal recibe un número de dorsal y si este está comprendido entre 1 y 30 asignará ese 
     * número al dorsal del jugador. En caso de no ser un número entre 1 y 30 (inclusive) devolverá un -1.
     * 
     * @author Olga
     * @param dorsal número de dorsal a asignar.
	 * @since 1.0
	 */
    public void ponerDorsal(int dorsal) {
    	
        if(dorsal >= 1 && dorsal <= 30)                     
        	this.dorsal = dorsal;
        else               
        	this.dorsal = -1;
    }

    /**
     * Define si el jugador está expulsado o no en función del número de tarjetas amarillas y rojas recibidas.
     * Como base se define como false pero si se cumple la condición de numeroTarjetasAmarillas sea 2 o si
     * numeroTarjetasRojas sea 1 entonces se define como true y devuelve el valor de que el jugador queda expulsado.
     * 
     * @author Olga
     * @return devuelve el valor de expulsado en caso de que se cumplan las condiciones.
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
