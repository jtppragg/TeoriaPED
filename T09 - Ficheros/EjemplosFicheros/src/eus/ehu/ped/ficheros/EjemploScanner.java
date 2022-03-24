package eus.ehu.ped.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EjemploScanner {
    public static void main( String[] args ) throws IOException {
        List<Alumno> alumnos = cargaAlumnos("notas.txt");
        double media = 0;
        for( Alumno a : alumnos )
            media += a.getNota();
        media /= alumnos.size();
        System.out.println("Nota media = " + media);
    }
    
    // main como en el ejemplo anterior

    private static List<Alumno> cargaAlumnos(String fichero) throws IOException {
        List<Alumno> alumnos = new ArrayList<>();
        try( Scanner sc = new Scanner(new File(fichero)) ) {
            sc.useLocale(Locale.US);
            sc.useDelimiter("[:\\n]");
            while( sc.hasNext() ) {
                Alumno a = new Alumno();
                a.setNombre(sc.next());
                a.setNota(sc.nextDouble());
                alumnos.add(a);
            }
        }
        return alumnos;
    }
}
