/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gorka
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        boolean error = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce numerador: ");
                int num = sc.nextInt();
                System.out.print("Introduce denominador: ");
                int den = sc.nextInt();
                int res = num/den;
                System.out.printf("La división es: %d\n", res);
                error = false;
            } catch( ArithmeticException e ) {
                System.out.println("No se puede dividir por cero");
            } catch( InputMismatchException e) {
                System.out.println("No has introducido un entero válido");
            } catch( Exception e ) {
                System.out.printf("Error desconocido: %s\n", e.getMessage());
            }
        } while(error);
    }
    
}
