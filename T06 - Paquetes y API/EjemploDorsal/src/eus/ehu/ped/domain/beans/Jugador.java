/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped.domain.beans;

/**
 *
 * @author gorka
 */
public class Jugador extends Persona {
    private int dorsal;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if( dorsal < 1 || dorsal > 99 )
            throw new IllegalArgumentException("El dorsal debe ser un número entre 1 y 99");
        this.dorsal = dorsal;
    }
}
