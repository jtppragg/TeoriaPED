/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class EjemploCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Caso 1
        String str1 = "Hola";
        str1 = modifica(str1);
        System.out.println(str1);
        
        // Caso 2
        System.out.println(str1.replace("Hola", "Adiós"));
        
        // Caso 3
        System.out.println(str1);

        // Caso 4
        StringBuilder str2 = new StringBuilder("Hola");
        modifica(str2);
        System.out.println(str2);
        
        // Caso 5
        str2.replace(0, 4, "Adiós");
        System.out.println(str2);

        // Caso 6
        char[] str3 = str1.toCharArray();
        str3[0] = 'A';
        str3[1] = 'g';
        str3[2] = 'u';
        str3[3] = 'r';
        str1 = new String(str3);
        System.out.println(str1);
    }

    private static String modifica(String str) {
        return str.concat(" Gorka");
    }

    private static void modifica(StringBuilder str) {
        str.append(" Gorka");
    }

}
