/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class Contacto {
    private String nombre;
    private String direccion;
    private final Telefono movil = new Telefono();
    private final Telefono fijo = new Telefono();
    private Telefono telefono = movil;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Telefono getFijo() {
        return fijo;
    }

    public Telefono getMovil() {
        return movil;
    }

    public void setLlamada(boolean usarMovil) {
        telefono = usarMovil ? movil : fijo;
    }

    // Método delegado
    public String getNumero() {
        return telefono.getNumero();
    }

}
