/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class PasoPrimitivo {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[2] = 3;
        
        // Caso 1: un elemento del array
        metodo(array[2]);
        System.out.println(array[2]);
        
        // Caso 2: todo el array
        metodo(array);
        System.out.println(array[2]);
    }
    
    private static void metodo(int num) {
        num = 4;
    }
    
    private static void metodo(int[] array) {
        array[2] = 4;
    }
}
