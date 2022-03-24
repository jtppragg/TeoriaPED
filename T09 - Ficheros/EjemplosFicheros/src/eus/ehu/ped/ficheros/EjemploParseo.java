package eus.ehu.ped.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjemploParseo {
    public static void main( String[] args ) throws IOException {
        List<Alumno> alumnos = cargaAlumnos("notas.txt");
        double media = 0;
        for( Alumno a : alumnos )
            media += a.getNota();
        media /= alumnos.size();
        System.out.println("Nota media = " + media);
    }

    private static List<Alumno> cargaAlumnos(String fichero) throws IOException {
        List<Alumno> alumnos = new ArrayList<>();
        try( BufferedReader br = new BufferedReader(new FileReader(fichero)) ) {
            String line;
            String[] fields;
            while( (line=br.readLine()) != null ) {
                fields = line.split(":");
                Alumno a = new Alumno();
                a.setNombre(fields[0]);
                a.setNota(Double.parseDouble(fields[1]));
                alumnos.add(a);
            }
        }
        return alumnos;
    }
}
