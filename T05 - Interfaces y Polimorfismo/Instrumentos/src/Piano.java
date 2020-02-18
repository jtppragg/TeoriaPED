/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class Piano implements Instrumento {

    @Override
    public String getTipo() {
        return "cuerda";
    }

    @Override
    public String suena() {
        return "pianeando";
    }
    
}
