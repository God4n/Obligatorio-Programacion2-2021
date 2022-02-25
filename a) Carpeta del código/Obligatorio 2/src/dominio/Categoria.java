// Hecho por Augusto Vélez (266655) y Tadeo Goday (256686).

package dominio;

import java.util.*;
import java.io.Serializable;

public class Categoria implements Serializable {
    private String descripcion; // No se pueden repetir.
    private String detalle; 
    private int prioridad; // Del 1 al 10 (1 es el máximo).
    
    // Los get:
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public String getDetalle(){
        return this.detalle;
    }
    
    public int getPrioridad(){
        return this.prioridad;
    }
    
    // Los set:
    
    public void setDescripcion(String unaDescripcion){
        this.descripcion = unaDescripcion;
    }
    
    public void setDetalle(String unDetalle){
        this.detalle = unDetalle;
    }
    
    public void setPrioridad(int unaPrioridad){
        this.prioridad = unaPrioridad;
    }
    
    // Constructor con parámetros:
    
    public Categoria(String unaDescripcion, String unDetalle, int unaPrioridad){
        this.setDescripcion(unaDescripcion);
        this.setDetalle(unDetalle);
        this.setPrioridad(unaPrioridad);
    }
    
    // toString():
    
    @Override
    public String toString(){
        return this.descripcion;
    }
    public String toStringConDetalles(){
        return this.descripcion + " (" + this.prioridad + "): " + this.detalle;
    }
    
    @Override
    public boolean equals(Object obj) {
        Categoria categoria = (Categoria) obj;
        return this.descripcion.toUpperCase().replace(" ", "").equals(categoria.descripcion.toUpperCase().replace(" ", ""));
    }
}
