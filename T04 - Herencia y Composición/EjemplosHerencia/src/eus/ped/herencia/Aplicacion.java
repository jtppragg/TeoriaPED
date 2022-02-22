package eus.ped.herencia;
public class Aplicacion {

    public static void main(String[] args) {
        /*Forma f;
        Object o;
        
        f = new Circulo(2);
        System.out.println(f.area());
        
        f = new Rectangulo(2, 3);
        System.out.println(f.area());
        
        f = new Cuadrado(4);
        System.out.println(f.area());
        f.saluda();*/
        
        Cuadrado c1 = new Cuadrado(3);
        Cuadrado c2 = new Cuadrado(3);
        if( c1.equals(c2) )
            System.out.println("Iguales");
        else
            System.out.println("Diferentes");
                    
        
    }
    
}
