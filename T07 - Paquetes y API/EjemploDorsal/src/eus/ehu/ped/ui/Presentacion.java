/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped.ui;

import eus.ehu.ped.domain.Equipo;
import eus.ehu.ped.domain.beans.Jugador;

/**
 *
 * @author gorka
 */
public class Presentacion {
    private final Equipo equipo = new Equipo();
    
    public void pideJugadores() {
        do {
            System.out.print("Introduce dorsal: ");
            int dorsal = Input.sc().nextInt();
            System.out.print("Introduce nombre: ");
            String nombre = Input.purge().nextLine();
            Jugador jugador = new Jugador();
            jugador.setDorsal(dorsal);
            jugador.setNombre(nombre);
            equipo.contrata(jugador);
            System.out.print("¿Nuevo jugador (s/n)?");
        } while(Input.nextChar() == 's');
    }

    public void muestraPorteros() {
        System.out.println("Porteros:");
        for( Jugador jugador : equipo.getPorteros() )
            System.out.println(jugador.getNombre());
    }

    public void muestraJugador() {
        do {
            System.out.print("Introduce dorsal: ");
            int dorsal = Input.sc().nextInt();
            Jugador jugador = equipo.localiza(dorsal);
            if( jugador == null )
                System.out.println("No hay ningún jugador con ese dorsal");
            else
                System.out.println(jugador.getNombre());
            System.out.print("¿Otra consulta (s/n)?");
        } while(Input.nextChar() == 's');
    }
}
