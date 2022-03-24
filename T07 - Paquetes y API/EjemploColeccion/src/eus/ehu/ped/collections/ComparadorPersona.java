/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped.collections;

import java.util.Comparator;

/**
 *
 * @author gorka
 */
public class ComparadorPersona implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}
