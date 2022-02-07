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
public class AsignacionExt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[3];
        for( int i = 0; i < a.length; i++ )
            a[i] = i;
        
        int[] b = Arrays.copyOf(a, a.length);
        
        System.out.println(a[2] + " vs " + b[2]);        
        a[2] = 10;
        System.out.println(a[2] + " vs " + b[2]);
    }
    
}
