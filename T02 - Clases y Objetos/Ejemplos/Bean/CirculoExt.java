public class Circulo {
	private int radio;
	private String color;
	
	public Circulo() {
	}

	public Circulo(int radio, String color) {
		this.radio = radio;
		this.color = color;
	}

	public Circulo(int radio) {
		this(radio, "negro");
	}
	
	public int getRadio() {
        	return radio;
	}
	
	public void setRadio(int radio) {
        	if( radio >= 0 )
            		this.radio = radio;
	}
	
	public String getColor() {
        	return color == null ? "vacío" : color;
	}
	
	public void muestra() {
		System.out.println("Círculo " + getColor() + " de radio " + getRadio());
	}

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo(10, "rojo");

		c1.muestra();
		c2.muestra();

		c1.setRadio(20);
		c1.muestra();
	}
}
