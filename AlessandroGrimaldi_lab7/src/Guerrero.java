
import java.io.Serializable;
import javax.swing.JOptionPane;


public abstract class Guerrero implements Serializable {
    protected String nombre;
    protected String nickname;
    protected float ataque;
    protected float defensa;
    protected float salud;
    protected float puntos;

    private static final long SerialVersionUID = 777L;
    
    public Guerrero() {
    }

    public Guerrero(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        this.nombre = nombre;
        setAtaque(ataque);
        setDefensa(defensa);
        setSalud(salud);
        this.puntos = puntos;
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        if(ataque>201&&ataque<301){
        this.ataque = ataque;
        JOptionPane.showMessageDialog(null, "Ataque no cumple con los requisitos");
        }
    }

    public float getDefensa() {
        return defensa;
    }

    public void setDefensa(float defensa) {
        if(defensa>25&&defensa<75){
        this.defensa = defensa;
        JOptionPane.showMessageDialog(null, "Defensa no cumple con los requisitos");
        }
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        if(salud>801){
        this.salud = salud;
        JOptionPane.showMessageDialog(null, "Salud no cumple con los requisitos");
        }
    }

    public float getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    public abstract float ataque(float defensaRival, float vidaRival, float ataqueRival);
        
    
}
