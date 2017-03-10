
public class Minotauro extends Guerrero {

    public Minotauro() {
        super();
    }

    public Minotauro(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public String toString() {
        return nombre;
    }

    

    @Override
    public float ataque(float defensaRival, float vidaRival, float ataqueRival) {
        float attack = (float) (ataque * 2);
        float def = (float) (defensaRival * 0.50);
        vidaRival =  (float) (vidaRival - ((ataque+attack) - (defensaRival+def))) ;
        return vidaRival;
    }
    
}
