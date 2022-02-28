/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class Alumno {
    private final String DNI;
    private final String nombre;
    private int edad;

    public Alumno(String DNI, String nombre, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("Soy %s y tengo %d años", nombre, edad);
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Alumno )
            return DNI.equals(((Alumno)obj).getDNI());
        else
            return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return DNI.hashCode();
    }



    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
