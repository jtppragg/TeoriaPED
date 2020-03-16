package eus.ehu.ped;

public class NumeroNegativoException extends Exception {
	private static final long serialVersionUID = 1L;

	public NumeroNegativoException() {
		super("El número debe ser mayor o igual que 0");
	}
}
