package eus.ped.herencia;

public class Rectangulo  extends Forma {
    private final double alto, ancho;
    
    public Rectangulo( double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
        System.out.println("Constructor de Rectangulo");
    }

    @Override
    public double area() {
        return alto * ancho;
    }    
}
