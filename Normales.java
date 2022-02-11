package Laboratorio_4;

public class Normales extends Aldeano {

    public Normales( int ataque) {
        super(50);

    }

    public Normales(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }

    @Override
    public double daño(Aldeano atacar) {
        ////si el aldeano normal ataca al pacifista
        if (atacar instanceof Pacifista )
            //Agarramos los puntos de ataque que genera por golpe el aldeano normal y lo multiplicamos por 1.05 porque contra pacifistas el daño aumenta
            return super.getAtaque()*1.05;
        return 0;
    }
}
