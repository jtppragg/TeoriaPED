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
public class Operador implements Closeable {
    private final Recurso r1 = new Recurso(), r2 = new Recurso(), r3 = new Recurso();
    
    public void open() {
        r1.open("#1");
        r2.open("#2");
        r3.open("#3");
    }
    
    public void work() {
        // ...
    }
    
    @Override
    public void close() throws IOException {
        try (
            Recurso r1 = this.r1;
            Recurso r2 = this.r2;
            Recurso r3 = this.r3) {
        }
    }
}
