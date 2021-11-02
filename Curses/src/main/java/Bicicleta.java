/**
 * @author Carla Heras
 * @version v0.2
 * 
 * Classe heredada de Vechicle, conté l'informació de bicicleta
 */
public class Bicicleta extends Vehicle{

    /**
     * Funcio que guarda la variable de velocitat en una variable anomenada velocitatMAX
     * @param vel
     */
    public Bicicleta(int vel) {
        super(vel);
    }

    /**
     * @deprecated
     * variable "tipus" en desús
     
    public Bicicleta(int vel, int tipus) {
        super(vel);
    }
    */
}
