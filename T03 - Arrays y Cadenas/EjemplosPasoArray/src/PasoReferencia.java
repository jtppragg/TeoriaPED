/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class PasoReferencia {
    public static void main(String[] args) {
        Figura[] figs = new Figura[3];
        figs[1] = new Figura();
        figs[1].setNombre("Triángulo");
        
        // Caso 1: un elemento del array
        metodo(figs[1]);
        System.out.println(figs[1].getNombre());
        
        // Caso 2: todo el array
        metodo(figs);
        System.out.println(figs[1].getNombre());
    }
    
    private static void metodo(Figura fig) {
        fig.setNombre("Cuadrado");
    }
    
    private static void metodo(Figura[] figs) {
        figs[1].setNombre("Círculo");
    }
}
