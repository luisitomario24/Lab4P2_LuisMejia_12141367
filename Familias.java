package Laboratorio_4;

import java.util.ArrayList;

public class Familias {
    private ArrayList<Aldeano> aldeanos=new ArrayList();
    private String linaje;

    public Familias() {

    }
    public Familias(String linaje,ArrayList<Aldeano> aldeanos) {
        this.linaje = linaje;
        this.aldeanos = aldeanos;
    }

    public ArrayList<Aldeano> getAldeanos() {
        return aldeanos;
    }

    public void setAldeanos(ArrayList<Aldeano> aldeanos) {
        this.aldeanos = aldeanos;
    }

    public String getLinaje() {
        return linaje;
    }

    public void setLinaje(String linaje) {
        this.linaje = linaje;
    }

    @Override
    public String toString() {
        return "Familias{" +
                "linaje='" + linaje + '\'' +
                '}';
    }
}
