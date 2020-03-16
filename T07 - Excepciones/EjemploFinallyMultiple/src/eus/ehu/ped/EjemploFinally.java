/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

/**
 *
 * @author gorka
 */
public class EjemploFinally {

    public static void main(String[] args) {
        try {
            System.out.println("Abro fichero1");
            try {
                System.out.println("Abro fichero2");
                try {
                    System.out.println("Abro fichero3");
                    System.out.println("Trabajo con fichero1");
                    System.out.println("Trabajo con fichero2");
                    System.out.println("Trabajo con fichero3");
                    int n = 1/0;
                    return;
                } finally {
                    System.out.println("Cierro fichero3");
                }
            } finally {
                System.out.println("Cierro fichero2");
            }
        } catch( Exception e ) {
            System.out.println(e.getMessage());            
        } finally {
            System.out.println("Cierro fichero1");            
        }
    }
    
}
