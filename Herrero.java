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
    public int daño(Aldeano atacar) {
        return 0;
    }

}
