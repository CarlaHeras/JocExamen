/**
 * @author Carla Heras
 * @version v0.2
 * 
 * Classe heredada de Vehicle, conté l'informacio de Cotxe
 */
public class Cotxe extends Vehicle {
	private String Marca;
	private String Model;

	/**
     * Funcio que guarda la variable de velocitat en una variable anomenada velocitatMAX
     * @param vel
     */
	public Cotxe(int vel) {
		super(vel);
	}

	/**
	 * Funcio que agafa la marca del cotxe
	 * @return Retorna la marca del cotxe
	 */
	public String getMarca() {
		return Marca;
	}

	/**
	 * Funcio que seteja la marca del cotxe
	 * @param marca Marca del cotxe
	 */
	public void setMarca(String marca) {
		Marca = marca;
	}

	/**
	 * Funcio que agafa el model del cotxe
	 * @return Retorna el model del cotxe
	 */
	public String getModel() {
		return Model;
	}

	/**
	 * Funcio que seteja el model del cotxe
	 * @param model Model del cotxe
	 */
	public void setModel(String model) {
		Model = model;
	}



}
