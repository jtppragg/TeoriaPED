package eus.ehu.ped;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Recursos {
	public static void main(String[] args) {
        int num;
        
        try (
			PrintWriter pw1 = new PrintWriter("numeros.txt");
    		PrintWriter pw2 = new PrintWriter("incrementos.txt");
		){
            for( String arg : args ) {
                num = Integer.parseInt(arg);
                pw1.println(num);
                pw2.println(num+1);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error al crear el fichero");
        } catch (NumberFormatException ex) {
            System.err.println("Error al convertir a número");
        }
    }
}
