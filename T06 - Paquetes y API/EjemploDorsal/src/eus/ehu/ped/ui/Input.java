/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped.ui;

import java.util.Scanner;

/**
 *
 * @author gorka
 */
public class Input {
    private static Scanner instance;
    
    public static Scanner sc() {
        if( instance == null )
            purge();
        return instance;
    }
    
    public static Scanner purge() {
        instance = new Scanner(System.in);
        return instance;
    }
    
    public static String askString(String msg) {
        System.out.print(msg + ": ");
        return purge().nextLine();
    }
    
    public static char nextChar() {
        return purge().next().charAt(0);
    }
}
