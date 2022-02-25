// Hecho por Augusto Vélez (266655) y Tadeo Goday (256686).

package dominio;

import java.util.*;
import java.io.Serializable;

public class Pedido extends Observable implements Serializable {
    private int numero;
    private Cliente cliente;
    private ArrayList<Producto> productosPedidos;
    private String Observaciones;
    private int total; // Total de todos los pecios de los produtos (no va en el constructor).
    
    // Los get:
    
    public int getNumero(){
        return this.numero;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public ArrayList<Producto> getProductosPedidos(){
        return this.productosPedidos;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public int getTotal() {
        return total;
    }
    
    // Los set:
    
    public void setNumero(int unNumero){
        this.numero = unNumero + 1;
        setChanged();
        notifyObservers();
    }
    
    public void setCliente(Cliente unCliente){
        this.cliente = unCliente;
        setChanged();
        notifyObservers();
    }
    
    public void addProductoAlPedido(Producto unProducto){
        this.productosPedidos.add(unProducto);
        setChanged();
        notifyObservers();
    }

    public void deleteProductoAlPedido(Producto unProducto){
        this.productosPedidos.remove(unProducto);
        setChanged();
        notifyObservers();
    }
    
    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
        setChanged();
        notifyObservers();
    }

    public void setTotal(int total) {
        this.total = total;
        setChanged();
        notifyObservers();
    }
    
    // Constructores:
    public Pedido(){
        this.productosPedidos = new ArrayList<>();
        setChanged();
        notifyObservers();
    }
     
    public Pedido(int unNumero, Cliente unCliente, ArrayList<Producto> unosProductosPedidos){
        this.setNumero(unNumero);
        this.setCliente(unCliente);
        this.productosPedidos = unosProductosPedidos;
    }
    
    // toString():
    
    @Override
    public String toString(){
        return "Pedido " + this.numero + ": " + this.cliente.getNombre();
    }
    
    // Métodos:
    
    public int calcularTotal(ArrayList<Producto> productosPedidos){
        int totl = 0;
        for(int i = 0; i < productosPedidos.size(); i++){
            totl += productosPedidos.get(i).getPrecio();
        }
        return totl;
    }
    
}
