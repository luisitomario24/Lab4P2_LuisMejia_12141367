package Laboratorio_4;

public class Herrero extends Aldeano{
    private int daño;

    public Herrero(String nombre,String apellido,int edad,double vida) {
        super(nombre,apellido,edad,vida*1.5);

    }


    public Herrero(int daño) {
       super(daño);
       if(daño>200 && daño<500){
           this.daño=daño;
        }

    }

    @Override
    public double daño(Aldeano atacar) {
        //Los aldeanos de tipo herrero tienen mas o menos daño dependiendo a quien le esten haciendo daño
        if(atacar instanceof Pacifista){
            return super.getAtaque()*1.1;
        }
        //en el caso de que el herrero pelee contra un agronomo el daño es diferente
        else if (atacar instanceof Agronomo){
            return super.getAtaque()*1.05;
        }
        // de pelear contra otro tipo de aldeano pues su daño sera el establecido por defecto
        return  super.getAtaque();


    }

}
