package entidad;

public class Jugador {

	private int dorsal;
	private int numeroTarjetasAmarillas;
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
	 * Este método hace que el jugador solo puede tener un dorsal del 1 al 30.
	 * @param dorsal
	 */
	
    public void ponerDorsal(int dorsal) {
    	
        if(dorsal >= 1 && dorsal <= 30)                     
        	this.dorsal = dorsal;
        else               
        	this.dorsal = -1;
    }

/**
 * Si el jugador tiene una segunda amarilla o una roja este sería expulsado
 * @return expulsado true/false.
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
