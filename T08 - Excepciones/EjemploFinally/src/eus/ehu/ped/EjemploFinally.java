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
            System.out.println("Abro fichero");
            System.out.println("Trabajo con fichero");
            int n = 1/0;
            return;
        } catch( ArithmeticException e ) {
            System.out.println(e.getMessage());            
        } catch( Exception e ) {
            System.out.println(e.getMessage());            
        } finally {
            System.out.println("Cierro fichero");
        }
    }
    
}
