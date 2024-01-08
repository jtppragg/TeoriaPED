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
	
	// ...
}
