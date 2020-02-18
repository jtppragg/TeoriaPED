/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public abstract class InstrumentoOrquesta implements Instrumento {
    private String sitio;

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }
}
