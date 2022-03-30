/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author gorka
 */
public final class IOUtils {
    private IOUtils() {}
    
    public static void copy(InputStream is, OutputStream os, int chunk, long size) throws IOException {
        if( is == null || os == null || size <= 0 || chunk <= 0 )
            return;
        byte[] buffer = new byte[chunk];
        int len;
        do {
            len = size < chunk ? (int)size : chunk;
            len = is.read(buffer, 0, len);
            if( len > 0 ) {
                os.write(buffer, 0, len);
                size -= len;
            }
        } while( len > 0 && size > 0 );
    }
    
    public static String info(File file) {
        return String.format("%s (%d bytes)", file.getAbsolutePath(), file.length());
    }
}
