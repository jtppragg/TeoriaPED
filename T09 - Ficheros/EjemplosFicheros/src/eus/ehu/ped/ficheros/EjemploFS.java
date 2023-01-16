package eus.ehu.ped.ficheros;

import java.io.File;

public class EjemploFS {
    public static void main(String[] args) {
        File dir = new File("/home/gorka/Descargas/Temp");
        for( File entry : dir.listFiles() ) {
            if( entry.getName().charAt(0) == '.' ) // hidden
                continue;
            if( entry.isFile() )
                System.out.printf("%s (%d bytes)\n", entry.getName(), entry.length());
            else if( entry.isDirectory() )
                System.out.println(entry.getName()+"/");
        }
    }
}
