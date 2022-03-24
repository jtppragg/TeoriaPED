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
    public static void main(String[] args) {
        try(
            MiRecurso recurso1 = new MiRecurso(1);
            MiRecurso recurso2 = new MiRecurso(2);
        ) {
            recurso1.open();
            recurso2.open();
            recurso1.work();
            recurso2.work();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
