package eus.ehu.ped.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class EjemploCopiaMezcla {
    public static void main(String[] args) {        
        File org = new File("/tmp/activeSession.txt");
        File dst = new File("/tmp/prueba");
        
        if( !org.exists() || !org.isFile() ) {
            System.err.println("No existe el fichero de entrada");
            return;
        }
        if( dst.exists() ) {
            System.err.println("Ya existe el fichero de destino");
            return;
        }
        
        copy(org, dst);
    }
    
    private static void copy(File org, File dst) {
        try(
            InputStream is = new FileInputStream(org);
            OutputStream os = new FileOutputStream(dst);
        ) {
            copy(is, os);
        } catch( Exception e ) {
            System.err.println("Error al copiar ficheros: " + e.getMessage());
        }
    }
    
    // main() como en el ejemplo anterior
    
    // copy() de File como en el ejemplo anterior
    
    private static void copy(InputStream is, OutputStream os) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
        ) {
            String line;
            while( (line = br.readLine()) != null )
                pw.println(line);
        }
    }
}
