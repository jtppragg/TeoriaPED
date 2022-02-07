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
public class AsignacionOk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        
        for( int i = 0; i < a.length; i++ )
            a[i] = i;
        
        for( int i = 0; i < a.length; i++ )
            b[i] = a[i];
        
        System.out.println(a[2] + " vs " + b[2]);        
        a[2] = 10;
        System.out.println(a[2] + " vs " + b[2]);
    }
    
}
