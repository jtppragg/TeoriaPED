#Tema 5 - Interfaces y Polimorfismo

Material de apoyo para las clases de teoría de Programación en Entornos Distribuidos. Este repositorio incluye listados con los conceptos explicados en clase así como algunos ejemplos creados en las propias clases.

(c) 2020, Gorka Prieto Agujeta <<gorka.prieto@ehu.eus>>

## Polimorfismo

### Ejemplo: Orquesta

```java
public interface Instrumento {
    String getTipo();
    String suena();
}

public class Flauta implements Instrumento {
    @Override
    public String getTipo() {
        return "viento";
    }

    @Override
    public String suena() {
        return "flauteando";
    }  
}

// Lo mismo para Guitarra, Piano, etc.
```

Y ahora gracias al polimorfismo tocamos todos los instrumentos de la orquesta sin necesidad de saber cómo funciona cada uno:

```java
public class Instrumentos {
    public static void main(String[] args) {
        Instrumento[] orquesta = new Instrumento[5];
        creaOrquesta(orquesta);
        suena(orquesta, "cuerda");
    }

    private static void creaOrquesta(Instrumento[] o) {
        o[0] = new Guitarra();
        o[1] = new Piano();
        o[2] = new Flauta();
        o[3] = new Tambor();
        o[4] = new Guitarra();
    }

    private static void suena(Instrumento[] orquesta, String tipo) {
        for( Instrumento i : orquesta )
            if( i.getTipo().equals(tipo) )
                System.out.println(i.suena());
    } 
}
```

Y la salida por pantalla:

```shell
guitarreando
pianeando
guitarreando
```