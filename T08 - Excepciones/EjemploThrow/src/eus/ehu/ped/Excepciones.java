package eus.ehu.ped;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Excepciones {

    public static void main(String[] args) {
        PrintWriter pw = null;
        int num;
        
        try {
            pw = new PrintWriter("numeros.txt");
            for( String arg : args ) {
                num = Integer.parseInt(arg);
                pw.println(num+1);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error al crear el fichero");
        } catch (NumberFormatException ex) {
            System.err.println("Error al convertir a número");
            ex.printStackTrace();
        } catch( Exception ex ) {
        	ex.printStackTrace();
        } finally {
            if( pw != null )
                pw.close();
        }
    }
    
}
