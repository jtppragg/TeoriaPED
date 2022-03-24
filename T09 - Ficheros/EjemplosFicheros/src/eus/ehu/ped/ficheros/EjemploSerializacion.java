package eus.ehu.ped.ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Alumno implements Serializable {
    private String nombre;
    private double nota;
    
    public Alumno() {
    }
    
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    // getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

public class EjemploSerializacion {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("John Doe", 8.5), a2;
        //a1.setNombre("John Doe");
        //a1.setNota(8.5);
        
        try {
            serializa(a1, "alumno.dat");
            a2 = deserializa("alumno.dat");        
            System.out.printf("%s: %.2f\n", a2.getNombre(), a2.getNota());
        } catch( IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }

    private static void serializa(Alumno a1, String fichero) throws IOException {
        try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero)) ) {
            oos.writeObject(a1);
        }
    }

    private static Alumno deserializa(String fichero) throws IOException, ClassNotFoundException {
        try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero)) ) {
            return (Alumno)ois.readObject();
        }
    }
}
