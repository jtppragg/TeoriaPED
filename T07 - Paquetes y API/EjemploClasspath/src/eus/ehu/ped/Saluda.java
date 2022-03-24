/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import eus.ehu.ped.sub.Ejemplo1;

/**
 *
 * @author gorka
 */
public class Saluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejemplo1 ej = new Ejemplo1();
        System.out.println("Hola " + ej.getNombre());
    }

}
