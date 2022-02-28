/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class EjemploObject {

    public static void main(String[] args) {
        // Caso 1
        Alumno a1 = new Alumno("11111111", "Jon", 20);
        System.out.println(a1);        

        // Caso 2
        Alumno a2 = new Alumno("11111111", "Jon", 20);
        if( a1 == a2 )
            System.out.println("Mismo alumno");
        else
            System.out.println("Distinto alumno");

        // Caso 3
        if( a1.equals(a2) )
            System.out.println("Mismo alumno");
        else
            System.out.println("Distinto alumno");
    }

}
