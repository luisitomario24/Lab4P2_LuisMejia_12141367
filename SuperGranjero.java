package Laboratorio_4;

public class SuperGranjero extends Aldeano {

    public SuperGranjero(int ataque) {
        super(1000);
    }

    public SuperGranjero(String nombre, String apellido, int edad, double vida) {
        super(nombre,apellido,edad,vida);

    }

    @Override
    public int daño(Aldeano atacar) {
        return 0;
    }
}
