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
public class MiRecurso implements Closeable {
    private final int id;

    public MiRecurso(int id) {
        this.id = id;
    }

    public void open() {
        System.out.println("Abierto #" + id);
    }

    public void work() {
        System.out.println("Trabajando #" + id);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Cerrado #" + id);
    }
}
