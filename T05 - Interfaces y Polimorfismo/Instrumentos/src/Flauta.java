/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class Flauta implements Instrumento {

    @Override
    public String getTipo() {
        return "viento";
    }

    @Override
    public String suena() {
        return "flauteando";
    }
    
}
