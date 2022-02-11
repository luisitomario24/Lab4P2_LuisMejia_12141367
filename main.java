package Laboratorio_4;
import java.util.ArrayList;
public class main {

    public static void main(String[] args) {
        String apellido_familia="";
        //Creamos un array lista para almacenar algunos usuarios por defecto de las familias
        ArrayList<Aldeano>famMontesco=new ArrayList();
        //Creamos a romero como el unico superGranjero
        Aldeano Romeo=new SuperGranjero("romeo","montescu",20,1000);
        //Creamos un herrero por defecto para la familia montesco
        famMontesco.add(new Herrero("Miguel","montescu",70,250));
        famMontesco.add(new Agronomo("Miguel","montescu",69,300));
        famMontesco.add(new Herrero("Raul","montescu",68,300));

        //Creamos la famila de julieta que es de tipo de aldeanos normales
        ArrayList<Aldeano>famCapuleto=new ArrayList();
        Aldeano Julietta=new Normales("Julietta","Capuleto",11,600);
        //Creamos algunos miembros de la familia de julieta por defecto
        famCapuleto.add(new Herrero("Diego","capuleto",12,600));
        famCapuleto.add(new Agronomo("Manuel","capuleto",14,600));

        //Creamos otra familia por defecto en este caso la mia
        ArrayList<Aldeano>familamejia=new ArrayList();
        Aldeano Luismario=new Agronomo("Luis","mejia",19,200);

        //creamos un arrayList para las familas
        ArrayList<Familias>General=new ArrayList<Familias>();
        General.add(new Familias(apellido_familia));
    }

}
