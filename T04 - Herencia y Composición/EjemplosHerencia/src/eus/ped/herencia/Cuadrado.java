package eus.ped.herencia;

public class Cuadrado extends Rectangulo {
    private final double lado;
    public Cuadrado( double lado ) {        
        super(lado, lado);
        this.lado = lado;
        System.out.println("Constructor de Cuadrado");
    }

    @Override
    public String toString() {
        return "Soy un cuadrado de lado " + lado;
    }

    @Override
    public boolean equals(Object obj) {
        Cuadrado c = (Cuadrado)obj;
        return lado == c.lado;
    }
    
    
}
