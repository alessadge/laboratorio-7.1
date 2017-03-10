
public class Alumnos extends Guerrero {
    private int numero;
    private String carrera;
    private int edad;

    public Alumnos() {
        super();
    }

    public Alumnos(int numero, String carrera, int edad, String nombre, String nickname, float ataque, float defensa, float salud, float puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
        this.numero = numero;
        this.carrera = carrera;
        this.edad = edad;
    }

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public float ataque(float defensaRival, float vidaRival, float ataqueRival) {
        vidaRival =  (float) (vidaRival - ((ataque) - (defensaRival))) ;
        return vidaRival;
        
    }
    
}
