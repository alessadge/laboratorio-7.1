
import java.io.Serializable;
import javax.swing.JOptionPane;


public class Batallas extends Thread implements Serializable{
    private Guerrero jugador1;
    private Guerrero jugador2;
    private String ID;
    private String Bitacora;
    
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
        
        while(jugador1.getSalud()>0&&jugador2.getSalud()>0){
            

            jugador2.setSalud(jugador1.ataque(jugador2.getDefensa(), jugador2.getSalud(), jugador2.getAtaque()));
            jugador1.setSalud(jugador2.ataque(jugador1.getDefensa(), jugador1.getSalud(), jugador1.getAtaque()));
            System.out.println(this);
            Bitacora+=this+"\n";
        }
        if (jugador1.getSalud()>0) {
            System.out.println("El ganador es: "+jugador1);
            Bitacora+="El ganador es: "+jugador1;
        }else{
            System.out.println("El ganador es: "+jugador2);
            Bitacora+="El ganador es: "+jugador2;
        }
            
            
            
            
            
          /*  
            
            jugador2.setSalud(jugador1.ataque(jugador2.getDefensa(), jugador2.getSalud(), jugador2.getAtaque()));
            jugador1.setSalud(jugador2.ataque(jugador1.getDefensa(), jugador1.getSalud(), jugador1.getAtaque()));
            
            
        }
        
        if(jugador1.getSalud()<jugador2.getSalud()){
            JOptionPane.showMessageDialog(null,jugador2.getNombre()+" gano");
        }else{
            JOptionPane.showMessageDialog(null, jugador1.getNombre()+" gano");
        }
        */
    }
}

