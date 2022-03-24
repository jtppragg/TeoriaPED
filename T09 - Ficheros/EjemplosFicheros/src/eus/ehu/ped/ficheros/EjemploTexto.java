package eus.ehu.ped.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploTexto {
    public static void main(String[] args) {
        Alumno[] alumnos = {
            new Alumno("John Doe", 8.5),
            new Alumno("Jane Doe", 9.5)
        };
        
        try {
            guardaNotas(alumnos, "notas.txt");
            muestraNotas("notas.txt");
        } catch( IOException e ) {
            e.printStackTrace();
        }
    }

    private static void guardaNotas(Alumno[] alumnos, String fichero) throws IOException {
        try( PrintWriter pw = new PrintWriter(fichero) ) {
            for( Alumno a : alumnos ) {
                pw.print(a.getNombre());
                pw.print(':');
                pw.println(a.getNota());
            }
        }
    }

    private static void muestraNotas(String notastxt) throws IOException {
        try( BufferedReader br = new BufferedReader(new FileReader(notastxt)) ) {
            String line;
            while( (line = br.readLine()) != null )
                System.out.println(line);
        }
    }
}
