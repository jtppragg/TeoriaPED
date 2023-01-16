package eus.ehu.ped.ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EjemploCopiaBuffers {
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

    // main() como en el ejemplo anterior

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

    private static void copy(InputStream is, OutputStream os) throws IOException {
        byte[] buffer = new byte[SIZE];
        int len;

        while( (len = is.read(buffer)) > 0 )
            os.write(buffer, 0, len);
    }

    private static final int SIZE = 100;
}
