/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author freddy
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private Personal contacto;
    

    public Cliente(String nombre, String direccion, Personal contacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
    }

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

    public Personal getContacto() {
        return contacto;
    }

    public void setNombreContacto(Personal contacto) {
        this.contacto = contacto;
    }
    
    
}
