/**
 * @author Carla Heras
 * @version v0.2
 * 
 * Classe que conté l'informacio del vehicle
 */
public abstract class Vehicle {
	private int velocitatMAX;
	private Pilot pilot;

	/**
     * Funcio que guarda la variable de velocitat en una variable anomenada velocitatMAX
     * @param vel
     */
	public Vehicle(int vel) {
		velocitatMAX = vel;
	}

	/**
     * @deprecated
     * variable "tipus" en desús
     
    public Vehicle(int vel, int tipus) {
		velocitatMAX = vel;
	}
    */	

	/**
	 * Funcio que agafa l'informacio del pilot
	 * @return Retorna l'informacio del pilot
	 */
	public Pilot getPilot() {
		return pilot;
	}

	/**
	 * Funcio que seteja el pilot
	 * @param pilot 
	 */
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	/**
	 * Funcio que mostra la velocitat maxima
	 * @return Retorna la velocitat maxima
	 */
	public int getVelocitatMAX() {
		return velocitatMAX;
	}

	/**
	 * Funcio que seteja la velocitat maxima
	 * @param velocitatMAX 
	 */
	public void setVelocitatMAX(int velocitatMAX) {
		this.velocitatMAX = velocitatMAX;
	}
}
