
package eus.ehu.ped.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploSort {
    public static void main(String[] args) {
        List<String> compra = new ArrayList<>();
        
        compra.add("Manzana");
        compra.add("Pan");
        compra.add("Leche");
        compra.add("Manzana");
        
        Collections.sort(compra);
        
        for( String producto : compra )
            System.out.println(producto);
    }
}
