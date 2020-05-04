/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import eus.ehu.ped.ui.Presentacion;

/**
 *
 * @author gorka
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Presentacion presentacion = new Presentacion();
        presentacion.pideJugadores();
        presentacion.muestraPorteros();
        presentacion.muestraJugador();
    }
}
