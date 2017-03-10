
public class Fenix extends Guerrero {

    public Fenix() {
        super();
    }

    public Fenix(String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

   

    @Override
    public float ataque(float defensaRival, float vidaRival, float ataqueRival) {
        float attack = (float) (ataque * 0.75);
        vidaRival =  (float) (vidaRival - ((ataque+attack) - defensaRival)) ;
        return vidaRival;
    }
    
}
