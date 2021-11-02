/**
 * @author Carla Heras
 * @version v0.2
 * 
 * Classe que conté l'informació del pilot
 */
import java.util.Date;

public class Pilot {
	private String nom;
	private int nivell;
	private int punts;

	/**
	 * Funcio que guarda el nom del pilot
	 * @param nom Nom del pilot
	 */
	public Pilot(String nom) {
		this.nom = nom;
	}

	/**
	 * @deprecated
	 * ara tractem els punts de forma diferent
	 * @param punts
	 
	public Pilot(String punts) {
		this.punts = punts;
	}
	*/
	
	/**
	 * Funcio que agafa el nom del pilot
	 * @return Retorna el nom del pilot
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Funcio que agafa els punts del pilot
	 * @return Retorna els punts que te el pilot
	 */
	public int getPunts() {
		return punts;
	}

	/**
	 * Funcio que seteja els punts del pilot
	 * @param punts Punts que te el pilot
	 */
	public void setPunts(int punts) {
		this.punts = punts;
	}

	/**
	 * Funcio que afegeix punts
	 * @param p Numpero de punts que s'afegeixen al pilot
	 */
	public void addPunts(int p) {
		punts += p;
	}

	//sobrecàrrega que hereta de la classe Object
	public String toString() {
		return "Pilot{" +
				"nom='" + nom + '\'' +
				", punts=" + punts +
				'}';
	}
}
