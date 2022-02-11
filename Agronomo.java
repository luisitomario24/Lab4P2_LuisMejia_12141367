package Laboratorio_4;

public class Agronomo extends Aldeano {
    public Agronomo(int ataque ) {
        super(100);
    }

    public Agronomo(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }

    @Override
    public int daño(Aldeano atacar) {
        return 0;
    }
}
