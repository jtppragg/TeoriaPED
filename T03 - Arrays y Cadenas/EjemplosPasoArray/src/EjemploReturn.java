/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class EjemploReturn {
    public static void main(String[] args) {
        char[] vocales = creaArray();
        for( char vocal : vocales )
            System.out.println(vocal);
    }
    
    private static char[] creaArray() {
        char[] vocales = new char[5];
        vocales[0] = 'a';
        vocales[1] = 'e';
        vocales[2] = 'i';
        vocales[3] = 'o';
        vocales[4] = 'u';
        return vocales;
    }
}
