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
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array1 = new int[3][2];
        array1[2][1] = 3;
        System.out.println(array1[2][1]);

        int[][] array2 = new int[3][];
        //array2[2] = new int[3];
        array2[2][1] = 3;   // Error!
        System.out.println(array1[2][1]);

        int[][] b = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 3, 4}
        };
        System.out.println(b[1][2]);
    }

}
