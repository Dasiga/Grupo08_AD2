package entidad;

/**
 * Clase que da forma a la entidad "Jugador" que indica el <b>dorsal</b> que lleva, 
 * y el <b>número de tarjetas amarilla</b> y <b>rojas</b>.
 * <p>
 * Puede <b>ponerse un dorsal</b> e indicarnos <b>si está expulsado</b>.
 * @author diego de silva
 * @version 0.1
 */
public class Jugador {

	/**
	 * Indicador numérico del jugador
	 * @author diego de silva
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
	 * Método que permite cambiar el dorsal al jugador por otro o el mismo siempre que sea un valor comprendido entre 1 y 30 (incluidos)
	 * sino el valor de tu dorsal será -1
	 * @author diego de silva
	 * @param dorsal número al que se desea cambiar
	 */
    public void ponerDorsal(int dorsal) {
    	
        if(dorsal >= 1 && dorsal <= 30)                     
        	this.dorsal = dorsal;
        else               
        	this.dorsal = -1;
    }

    /**
     * Método para saber si un jugador está expulsado según el <b>número de tarjetas</b> (amarillas y/o rojas) que tenga
     * @return Devuelve <b>true</b> si tiene 2 amarillas o 1 roja. En caso contrario devuelve <b>false</b>
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
