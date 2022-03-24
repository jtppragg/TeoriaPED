package eus.ehu.ped.ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ErroresComunes {
    private static void errorCloseBuffered(File org, File dst) throws IOException {
        FileInputStream fis = new FileInputStream(org);
        FileOutputStream fos = new FileOutputStream(dst);
        
        InputStream bis = new BufferedInputStream(fis);
        OutputStream bos = new BufferedOutputStream(fos);

        copy(bis, bos);
        
        fis.close();
        fos.close();
        
        // ¿cuál hay que cerrar?, ¿cómo lo arreglarías?
    }
    
    private static void errorFlushBuffered(BufferedInputStream is, BufferedOutputStream os) throws IOException {
        int data;
        while( (data = is.read()) != -1 )
            os.write(data);
        
        // ¿por qué flush()?
    }
    
    private static void copy(InputStream is, OutputStream os) throws IOException {
        int data;
        while( (data = is.read()) != -1 )
            os.write(data);
    }
}
