/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author gorka
 */
public class EjemploComparator {
    public static void main(String[] args) {
        Set<Persona> amigos = new TreeSet<>(new ComparadorPersona());
        
        amigos.add(new Persona(20, "John"));
        amigos.add(new Persona(30, "Jane"));
        amigos.add(new Persona(10, "Doe"));
        
        for( Persona persona : amigos )
            System.out.printf("%s tiene %d años\n",
                persona.getNombre(), persona.getEdad());
    }
}
