/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import java.util.Arrays;

/**
 *
 * @author gorka
 */
public class Comparacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];

        for( int i = 0; i < a.length; i++ ) {
            a[i] = i;
            b[i] = i;
        }

        if( a == b )
            System.out.println("iguales");
        else
            System.out.println("diferentes");

        if( Arrays.equals(a,b) )
            System.out.println("iguales");
        else
            System.out.println("diferentes");
    }

}
