package Laboratorio_4;

import java.util.ArrayList;

public class Familias {
    private ArrayList<Aldeano> aldeanos=new ArrayList();
    private String apellido_familia;

    public Familias() {

    }
    public Familias(String apellido_familia,ArrayList<Aldeano> aldeanos) {
        this.apellido_familia = apellido_familia;
        this.aldeanos = aldeanos;
    }

    public Familias(String apellido_familia) {
        this.apellido_familia=apellido_familia;
        this.aldeanos=new ArrayList<>();
    }

    public ArrayList<Aldeano> getAldeanos() {
        return aldeanos;
    }

    public void setAldeanos(ArrayList<Aldeano> aldeanos) {
        this.aldeanos = aldeanos;
    }

    public String getapellido_familia() {
        return apellido_familia;
    }

    public void setLinaje(String apellido_familia) {
        this.apellido_familia = apellido_familia;
    }

    @Override
    public String toString() {
        return "Familias{" +
                "apellido_familia='" + apellido_familia + '\'' +
                '}';
    }
}
