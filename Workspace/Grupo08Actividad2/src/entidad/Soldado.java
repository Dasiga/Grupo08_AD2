package entidad;

/** El objetivo de esta clase es definir el estado y funciones de un Soldado
 * 
 * 
 * @author Pablo
 *
 */
public class Soldado {

	
	private boolean estaMuerto;
	private int numeroBalas;
	
	/**
	 * 
	 * @return Esta clase nos retorna el estado del soldado. Si esta muerto nos retorna un valor boolean en estado true, en caso
	 * contrario nos retornará false.
	 */
	public boolean isEstaMuerto() {
		return estaMuerto;
	}
	
	/**
	 * 
	 * @param estaMuerto Le pasaremos un boolean: True o False para definir el estado del soldado.
	 */
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	
	/**
	 * 
	 * @return Nos devuelve un valor int con el numero de balas que le quedan al soldado.
	 */
	public int getNumeroBalas() {
		return numeroBalas;
	}
	
	/**
	 * 
	 * @param numeroBalas Definimos cuantas balas tiene un soldado con un valor int.
	 */
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	
	/**
	 * 
	 * @return Nos devuelve un valor boolean True si el numero de balas es superior a 0, en caso contrario nos devuelve False.
	 */
	public boolean puedeDisparar() {
		
		if(this.numeroBalas > 0)
			return true;
		
		return false;		
	}
	
	/**
	 * Esta clase decrementará el numero de balas del soldado actual y establece la variable estaMuerto a True del soldado del parametro.
	 * @param sol Le pasamos un objeto de la clase Soldado.
	 */
	
	public void disparar(Soldado sol) {
		
		this.numeroBalas--;
		
		sol.estaMuerto = true;
	}
}
