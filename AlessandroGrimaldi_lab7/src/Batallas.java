
import java.io.Serializable;


public class Batallas extends Thread implements Serializable{
    private Guerrero jugador1;
    private Guerrero jugador2;
    private String ID;

    public Batallas(Guerrero jugador1, Guerrero jugador2, String ID) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.ID = ID;
    }

    public Batallas() {
        super();
    }

    public Guerrero getJugador1() {
        return jugador1;
    }

    public void setJugador1(Guerrero jugador1) {
        this.jugador1 = jugador1;
    }

    public Guerrero getJugador2() {
        return jugador2;
    }

    public void setJugador2(Guerrero jugador2) {
        this.jugador2 = jugador2;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Batallas{" + "jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", ID=" + ID + '}';
    }
    
    public void run(){
        
        while(true){
            
            try {
                
            } catch (Exception e) {
            }
        }
    }
}
