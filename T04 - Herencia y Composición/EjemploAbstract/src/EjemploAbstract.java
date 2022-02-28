/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class EjemploAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Error
        //Forma forma = new Forma();

        // OK
        Rectangulo rect = new Rectangulo(2, 3);
        System.out.println(rect.getPerimeter());

        // Polimorfismo
        Forma forma = new Rectangulo(4, 5);
        System.out.println(forma.getPerimeter());

        // Error
        //forma.setAlto(4);

        // Polimorfismo
        forma = rect;
        System.out.println(forma.getPerimeter());
    }

}
