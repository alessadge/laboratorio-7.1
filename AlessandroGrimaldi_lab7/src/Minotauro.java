
public class Minotauro extends Guerrero {

    public Minotauro() {
        super();
    }

    public Minotauro(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    

    @Override
    public float ataque(float defensaRival, float vidaRival, float ataqueRival) {
        
        return vidaRival;
    }
    
}
