/**
 * @author Carla Heras
 * @version v0.2
 * 
 * Classe que conté tota la informació de la configuració del joc
 */
public class ConfigGame {
    private String username;
    private int numRunners;
    private int numTracks;

    /**
     * Funcio que agafa el numero de circuits
     * @return Retorna el numero de circuits
     */
    public int getNumTracks() {
        return numTracks;
    }

    /**
     * Funcio que seteja el numero de circuits
     * @param numTracks Numero de circuits que es corren
     */
    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    /**
     * Funcio que guarda en variables els valors corresponents de la configuracio per defecte
     */
    public ConfigGame() {
        numRunners = 5;
        numTracks = 3;
        username = "player";
    }

    /**
     * Funcio que seteja el nom d'usuari
     * @param username Nom del usuari
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Funcio que agafa el nom d'usuari
     * @return Retorna el username
     */
    public String getUserName() {
        return username;
    }

    /**
     * Funcio que agafa el numero de corredors
     * @return Retorna el numero de corredors
     */
    public int getNumRunners() {
        return numRunners;
    }

    /**
     * Funcio que seteja el numero de corredors
     * @param numRunners Numero de corredors
     */
    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    //sobrecàrrega que hereta de la classe Object
    public String toString() {
        return "ConfigGame{" +
                "username='" + username + '\'' +
                ", numRunners=" + numRunners +
                ", numTracks=" + numTracks +
                '}';
    }
}
