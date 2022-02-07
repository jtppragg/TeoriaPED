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
public class ComparacionOk {

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
        
        for( int i = 0; i < a.length; i++ )
            if( a[i] != b[i] ) {
                System.out.println("diferentes");
                return;
            }
        System.out.println("iguales");
    }
    
}
