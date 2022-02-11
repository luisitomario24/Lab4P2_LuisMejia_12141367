package Laboratorio_4;
public class Pacifista extends Aldeano {
    public Pacifista(int ataque) {
        super(0);

    }
    //el metodo de atacar del aldeano solo son palabras jaja
    @Override
    public double  daño(Aldeano atacar) {
        System.out.println("No hay necesidad de llegar a los golpes xd");
        return 0;
    }

}

