/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

/**
 *
 * @author gorka
 */
public class Consumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static String hello(java.lang.String name) {
        eus.ehu.ped.HelloService_Service service = new eus.ehu.ped.HelloService_Service();
        eus.ehu.ped.HelloService port = service.getHelloServicePort();
        return port.hello(name);
    }

}
