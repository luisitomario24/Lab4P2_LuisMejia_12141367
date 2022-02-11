package Laboratorio_4;

public class Explosivo extends Aldeano {
    public Explosivo(int ataque){
        super(250);
    }

    @Override
    public int daño(Aldeano atacar) {
        return 0;
    }
}
