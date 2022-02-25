// Hecho por Augusto Vélez (266655) y Tadeo Goday (256686).

package dominio;

import java.util.*;
import java.io.Serializable;

public class Producto implements Serializable {
    private ArrayList<Categoria> categoriasAsociadas; // Se puede poner una o más.
    private String nombre; // No se puede repetir.
    private int precio;
    
    // Los get:
    
    public ArrayList<Categoria> getCategoriasAsociadas(){
        return this.categoriasAsociadas;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    // Los set:
    
    public void agregarCategoriaAsociada(Categoria unaCategoria){
        this.categoriasAsociadas.add(unaCategoria);
    }
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public void setPrecio(int unPrecio){
        this.precio = unPrecio;
    }
    
    // Método para eliminar categoría:
    
    public void eliminarCategoriaAsociada(Categoria unaCategoria){
        this.categoriasAsociadas.remove(unaCategoria);
    }
    
    // Constructor con parámetros:
    
    public Producto(ArrayList<Categoria> unasCategoriasAsociadas, String unNombre, int unPrecio){
        this.categoriasAsociadas = unasCategoriasAsociadas;
        this.setNombre(unNombre);
        this.setPrecio(unPrecio);
    }
    
    // toString:
    
    @Override
    public String toString(){
        String cats = "";
        for (int i = 0; i < this.categoriasAsociadas.size(); i++) {
            cats += this.categoriasAsociadas.get(i).getDescripcion(); 
            if(i<this.categoriasAsociadas.size()-1){
                cats += "-"; 
            }
        }
        
        return this.nombre + ", $" + this.precio + " (" + cats + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        Producto producto = (Producto) obj;
        return this.nombre.toUpperCase().replace(" ", "").equals(producto.nombre.toUpperCase().replace(" ", ""));
    }
    
    
}
