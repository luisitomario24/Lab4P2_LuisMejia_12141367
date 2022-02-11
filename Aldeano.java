package Laboratorio_4;

import practicapolimorfismo.Soldado;

public abstract class Aldeano {
    private String nombre;
    private String apellido;
    private int edad;
    private double vida;
    private int ataque;

    public Aldeano(int ataque) {
        this.ataque=ataque;

    }

    public Aldeano(String nombre, String apellido, int edad, double vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
    }

    public abstract int daño(Aldeano atacar);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Aldeano{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", vida=" + vida +
                ", ataque=" + ataque +
                '}';
    }
}
