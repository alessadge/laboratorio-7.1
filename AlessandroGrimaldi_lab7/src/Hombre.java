
public class Hombre extends Guerrero{

    public Hombre() {
    }

    public Hombre(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    
    
    @Override
    public float ataque(float defensaRival, float vidaRival, float ataqueRival) {
        
        return vidaRival;
    }
    
}
