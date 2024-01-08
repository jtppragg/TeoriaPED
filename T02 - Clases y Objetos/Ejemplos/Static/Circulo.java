class Circulo {
    private double radio = 5;
    private static final double PI = 3.1416;

    public Circulo(double radio) {
	    this.radio = radio;
    }
    
    public double getCircunferencia() {
        return getCircunferencia(radio);
    }

    public static double getCircunferencia(double r) {
        return 2 * r * PI;
    }

    public static void main(String[] args) {
        Circulo obj = new Circulo(10);
        System.out.println( obj.getCircunferencia() );
        System.out.println( Circulo.getCircunferencia(5) );
    }
} 
