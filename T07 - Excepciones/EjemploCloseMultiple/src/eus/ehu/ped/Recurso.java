/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author gorka
 */
public class Recurso implements Closeable {
    private String id;
    
    public void open(String id) {
        this.id = id;
        System.out.println("Abierto recurso " + id);
    }

    @Override
    public void close() throws IOException {
        if( id.equals("#2") )
            throw new IOException("No se ha podido cerrar #2");
        System.out.println("Cerrado recurso " + id);
    }
    
}
