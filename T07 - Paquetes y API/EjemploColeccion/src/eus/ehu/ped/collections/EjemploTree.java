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
public class EjemploTree {
    public static void main(String[] args) {
        Set<String> compra = new TreeSet<>();
        
        compra.add("Manzana");
        compra.add("Pan");
        compra.add("Leche");
        compra.add("Manzana");
        
        for( String producto : compra )
            System.out.println(producto);
    }
}
