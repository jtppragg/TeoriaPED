package eus.ped.herencia;

public abstract class Forma {
    public Forma() {
        System.out.println("Constructor de Forma");
    }
    
    public abstract double area();
    
    public final void saluda() {
        System.out.println("No soy una forma");
    }
}
