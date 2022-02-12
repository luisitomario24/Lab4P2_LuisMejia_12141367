package Laboratorio_4;
import java.util.ArrayList;
import java.util.Scanner;

import static Lab_Progra2.Lab2p2_Luis_12141367.leer;

public class main {
    public static ArrayList<Familias>General=new ArrayList<Familias>();
    public static ArrayList<Aldeano>nuevoaldeano=new ArrayList<Aldeano>();
    public static String apellido_familia1;
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
        Familias Montesco=new Familias("montesco",famMontesco);

        //Creamos la famila de julieta que es de tipo de aldeanos normales
        ArrayList<Aldeano>famCapuleto=new ArrayList();
        Aldeano Julietta=new Normales("Julietta","Capuleto",11,600);
        //Creamos algunos miembros de la familia de julieta por defecto
        famCapuleto.add(new Herrero("Diego","capuleto",12,600));
        famCapuleto.add(new Agronomo("Manuel","capuleto",14,600));
        Familias Capuleto=new Familias("Capuleto",famCapuleto);


        //Creamos otra familia por defecto en este caso la mia
        ArrayList<Aldeano>familiamejia=new ArrayList();
        Aldeano Luismario=new Agronomo("Luis","mejia",19,200);
        Familias Fam=new Familias("Mejia",familiamejia);

        //creamos un arrayList para las familas
        General.add(new Familias(apellido_familia));
        General.add(Montesco);
        General.add(Fam);
        General.add(Capuleto);

        do{
            opciones( menu() );
        }while(true);}

    public static int menu(){
        Scanner leer=new Scanner (System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Bienvenido");
        System.out.println( "0.Salir\n"+
                "1.Pelear\n"+
                "2.Listar familias\n"+
                "3.RegistrarAldeanos\n"+
                "4.RegistrarFamilia\n"
        );

        System.out.println("Porfavor ingrese una opcion ");
        return leer.nextInt();
    }
    public static void opciones(int opcion){
        if(opcion==0)
            System.exit(0);
        if(opcion==1)
            pelear();
        if(opcion ==2)
            listarFamilias ();
        if(opcion==3)
            registrarAldeanos();
        if(opcion==4)
            System.out.println("h");
            registrarFamilia ();
    }
    public static void registrarFamilia(){
        Scanner leer = new Scanner(System.in );
        System.out.println("Imgrese el apellido");
         apellido_familia1=leer.next();
        Familias familia1=new Familias (apellido_familia1,null);
        General.add(familia1);

    }
    public static void registrarAldeanos(){
        Scanner leer = new Scanner(System.in );
        System.out.println("Ingrese el nombre del aldeano");
        String nombre = leer.next();
        System.out.println("Imgrese el apellido");
        String apellido_familia=leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese la vida del aldeano");
        double vida_familia = leer.nextDouble();

        if(apellido_familia.equals(apellido_familia1)){
            int pos=General.indexOf(apellido_familia1) ;
            General.get(pos).setAldeanos(nuevoaldeano);
        }

        




    }
    public static void listarFamilias(){
        for(Familias a:General){
            System.out.println(a.toString());
        }
    }
    public static void pelear(){

    }

}






