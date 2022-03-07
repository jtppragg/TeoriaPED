/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import java.io.IOException;

/**
 *
 * @author gorka
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try(Operador op = new Operador()) {
            op.open();
        }
    }
    
}
