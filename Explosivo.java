package Laboratorio_4;

public class Explosivo extends Aldeano {
    public Explosivo(int ataque){
        super(250);
    }

    @Override
    public double  daño(Aldeano atacar) {
        if(atacar instanceof Herrero){
            return super.getAtaque()*1.05;
        }
        if (atacar instanceof Agronomo){
            return super.getAtaque()*1.1;
        }

        return super.getAtaque();
    }
}
