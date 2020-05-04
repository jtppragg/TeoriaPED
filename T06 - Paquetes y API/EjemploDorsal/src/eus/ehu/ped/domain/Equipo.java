/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped.domain;

import eus.ehu.ped.domain.beans.Jugador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author gorka
 */
public class Equipo {
    private static final Integer[] DORSALES_PORTERO = {1, 13, 25};
    private Map<Integer, Jugador> map = new HashMap<>();
    
    public void contrata(Jugador jugador) {
        map.put(jugador.getDorsal(), jugador);
    }
    
    public Jugador localiza(int dorsal) {
        return map.get(dorsal);
    }
    
    public List<Jugador> getPorteros() {
        Set<Integer> dorsalesPorteros = new HashSet<>(Arrays.asList(DORSALES_PORTERO));
        List<Jugador> porteros = new ArrayList<>();
        for( Jugador jugador : map.values() )
            if( dorsalesPorteros.contains(jugador.getDorsal()) )
                porteros.add(jugador);
        /*porteros = map.values().stream()
            .filter(j->dorsalesPorteros.contains(j.getDorsal()))
            .collect(Collectors.toList());*/
        return porteros;
    }
}
