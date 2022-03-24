/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped.collections;

/**
 *
 * @author gorka
 */
public class Persona implements Comparable<Persona> {
    private int edad;
    private String nombre;
    
    @Override
    public int compareTo(Persona o) {
        return edad - o.getEdad();
    }
    
    // getters y setters
    
    public Persona() {        
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
