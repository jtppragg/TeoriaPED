/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class Derivada extends Base {

    @Override
    public void saluda(String nombre) {
        super.saluda(nombre);
        System.out.println("Hoy va a hacer sol");
    }


    public void despide() {
        System.out.println("¡Adiós!");
    }
}
