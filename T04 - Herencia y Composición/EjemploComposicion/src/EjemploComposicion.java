/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class EjemploComposicion {

    public static void main(String[] args) {
        Contacto c = new Contacto();
        c.setNombre("Jon");
        c.getMovil().setNumero("666777888");
        c.getFijo().setNumero("9451234565");
        System.out.println(c.getNumero());
    }

}
