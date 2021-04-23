/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class Instrumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instrumento[] orquesta = creaOrquesta();
        suena(orquesta, "cuerda");
    }

    private static Instrumento[] creaOrquesta() {
        Instrumento[] o = new Instrumento[5];
        o[0] = new Guitarra();
        o[1] = new Piano();
        o[2] = new Flauta();
        o[3] = new Tambor();
        o[4] = new Guitarra();
        return o;
    }

    private static void suena(Instrumento[] orquesta, String tipo) {
        for( Instrumento i : orquesta )
            if( i.getTipo().equals(tipo) )
                System.out.println(i.suena());
    }
    
}
