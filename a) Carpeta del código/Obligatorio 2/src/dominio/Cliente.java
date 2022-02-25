// Hecho por Augusto Vélez (266655) y Tadeo Goday (256686).

package dominio;

import java.util.*;
import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre; // No se puede repetir.
    private String direccion;
    private int telefono;
    
    // Constructores:
    
    public Cliente(){}
    
    public Cliente(String unNombre, String unaDireccion, int unTelefono){
        this.nombre = unNombre;
        this.direccion = unaDireccion;
        this.telefono = unTelefono;
    }
    
    // Los get:
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    
    // Los set:
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public void setDireccion(String unaDireccion){
        this.direccion = unaDireccion;
    }
    
    public void setTelefono(int unTelefono){
        this.telefono = unTelefono;
    }
    
    // toString();
    
    @Override
    public String toString(){
        return this.nombre + " (" + this.direccion + ", " + this.telefono + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        Cliente cliente = (Cliente) obj;
        return this.nombre.toUpperCase().replace(" ", "").equals(cliente.nombre.toUpperCase().replace(" ", ""));
    }
}
