package entidad;

/**
 * 
 * @author olgap
 *La clase que controlará las funciones y atributos del jugador.
 */
public class Jugador {
	/**
	 * @author olgap
	 * Indica que dorsal será un número.
	 * Es private por lo que no será visible por otras funciones.
	 */
	private int dorsal;
	/**
	 * @author olgap 
	 * Indica que numeroTarjetasAmarillas será un número.
	 *  Es private por lo que no será visible por otras funciones.
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * @author olgap
	 * Indica que numeroTarjetasRojas será un número.
	 *  Es private por lo que no será visible por otras funciones.
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
	 * @author olgap
	 * ponerDorsal recibe un número de dorsal y si este está comprendido entre 1 y 30 asignará ese 
	 * número al dorsal del jugador. En caso de no ser un número entre 1 y 30 devolverá un -1.
	 * @param dorsal número de dorsal a asignar.
	 */
    public void ponerDorsal(int dorsal) {
    	
        if(dorsal >= 1 && dorsal <= 30)                     
        	this.dorsal = dorsal;
        else               
        	this.dorsal = -1;
    }

    /**
     * @author olgap
     * Define si el jugador está expulsado o no en función del número de tarjetas amarillas y rojas recibidas.
     * Como base se define como false pero si se cumple la condición de numeroTarjetasAmarillas sea 2 o si
     * numeroTarjetasRojas sea 1 entonces se define como true y devuelve el valor de que el jugador queda expulsado.
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
