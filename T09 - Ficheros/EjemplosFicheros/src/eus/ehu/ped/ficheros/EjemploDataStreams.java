package eus.ehu.ped.ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploDataStreams {
    public static void main(String[] args) {
        File original = new File("original.dat");
        File redondeo = new File("redondeo.dat");        
        double[] valores = {1.1, 1.8, 3.2, 5.7, 8.8, 10.0};
        
        try {
            creaOriginal(valores, original);
            creaRedondeo(original, redondeo);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void creaOriginal(double[] valores, File file) throws IOException {
        try (
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        ) {
            dos.writeInt(valores.length);
            for( double valor : valores )
                dos.writeDouble(valor);
        }
    }

    private static void creaRedondeo(File original, File redondeo) throws IOException {
        try (
            DataInputStream dis = new DataInputStream(new FileInputStream(original));
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(redondeo));
        ) {
            int len = dis.readInt();
            dos.writeInt(len);
            for( int i = 0; i < len; i++ ) {
                long valor = Math.round(dis.readDouble());
                dos.writeLong(valor);
            }
        }
    }
}
