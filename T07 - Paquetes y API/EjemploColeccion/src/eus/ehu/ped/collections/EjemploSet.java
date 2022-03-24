package eus.ehu.ped.collections;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
	public static void main(String[] args) {
        Set<String> compra = new HashSet<>();
        //Set<String> compra = new LinkedHashSet<>();

        compra.add("Manzana");
        compra.add("Pan");
        compra.add("Leche");
        compra.add("Manzana");

        for( String producto : compra )
            System.out.println(producto);
    }
}
