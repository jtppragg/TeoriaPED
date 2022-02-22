/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

class Padre {
    Padre(String nombre) {
        System.out.println("Constructor de la clase Padre: " + nombre);
    }
}

class Hija extends Padre {
    Hija() {
        super("Desde la Hija");
        System.out.println("Constructor de la clase Hija");
    }
}

class Nieta extends Hija {
    Nieta() {
        //super();
        System.out.println("Constructor de la clase Nieta");
    }
}

public class Constructores {
    public static void main(String[] args) {
        new Nieta();
    }
}
