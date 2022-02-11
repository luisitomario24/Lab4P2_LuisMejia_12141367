package Laboratorio_4;

public class Normales extends Aldeano {

    public Normales( int ataque) {
        super(50);

    }

    public Normales(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }

    @Override
    public int daño(Aldeano atacar) {
        return 0;
    }
}
