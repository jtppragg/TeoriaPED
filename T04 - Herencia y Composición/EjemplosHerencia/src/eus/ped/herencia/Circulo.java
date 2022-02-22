package eus.ped.herencia;

public class Circulo extends Forma {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
        System.out.println("Constructor de Circulo");
    }

    @Override
    public double area() {
        return 3.141592 * radio * radio;
    }
}
