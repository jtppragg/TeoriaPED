package eus.ehu.ped.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EjemploMap {
	public static void main(String[] args) {
		Map<String, Double> notas = new HashMap<>();
                //Map<String, Double> notas = new TreeMap<>() ;

		notas.put("John", 5.0);
		notas.put("Sam", 8.0);
		notas.put("Katy", 10.0);

		System.out.println(notas.get("Sam"));

		for( String alumno : notas.keySet() )
			System.out.println(alumno);

		for( Double nota : notas.values() )
			System.out.println(nota);

		for( Entry<String, Double> entry : notas.entrySet() )
			System.out.println(entry.getKey() + ": " + entry.getValue());
	}
}
