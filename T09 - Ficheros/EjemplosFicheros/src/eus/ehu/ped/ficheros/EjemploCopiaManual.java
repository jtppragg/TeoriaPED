package eus.ehu.ped.ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EjemploCopiaManual {
    public static void main(String[] args) {
        File org = new File("/home/gorka/Descargas/Temp", "hola.pdf");
        File dst = new File("/home/gorka/Descargas/Temp/prueba/copia.pdf");

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
            InputStream is = new BufferedInputStream(new FileInputStream(org));
            OutputStream os = new BufferedOutputStream(new FileOutputStream(dst));
        ) {
            copy(is, os);
        } catch( Exception e ) {
            System.err.println("Error al copiar ficheros: " + e.getMessage());
        }
    }

    private static void copy(InputStream is, OutputStream os) throws IOException {
        int data;
        while( (data = is.read()) != -1 )
            os.write(data);
    }
}
