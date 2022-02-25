// Hecho por Augusto Vélez (266655) y Tadeo Goday (256686).
package dominio;

import java.io.*;
import java.util.*;

public class Sistema extends Observable implements Serializable {

    private ArrayList<Cliente> listaClientes;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Pedido> listaPedidos;
    
    public Sistema(){
        this.listaClientes = new ArrayList<>();
        this.listaCategorias = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
        this.listaPedidos = new ArrayList<>();
    }
    
    /************ Cliente **************/
    
    public ArrayList<Cliente> getListaClientes(){
        return this.listaClientes;
    }
    public void addCliente(Cliente cliente){
        this.listaClientes.add(cliente);
        setChanged();
        notifyObservers();
    }
    public void deleteCliente(Cliente cliente){
        this.listaClientes.remove(cliente);
        setChanged();
        notifyObservers();
    }
    public boolean comprobarExisteCliente(Cliente cliente){
        boolean existe = false;
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if(cliente.equals(this.listaClientes.get(i))){
                existe = true;
            }
        }
        return !existe;
    }
    public ArrayList<Cliente> buscarClientePorNombre(String nombre){
        ArrayList<Cliente> clie = new ArrayList<>();
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if(this.listaClientes.get(i).getNombre().replace(" ", "").contains(nombre.replace(" ", ""))){
                clie.add(this.listaClientes.get(i));
            }
        }
        return clie;
    }
    public void imprimirClientes(){
        System.out.println("\nClientes");
        for (int i = 0; i < this.getListaClientes().size(); i++) {
            System.out.println(this.getListaClientes().get(i));
        }
    }
    
    /************ Categoria **************/
    
    public ArrayList<Categoria> getListaCategorias(){
        return this.listaCategorias;
    }
    
    public ArrayList<Categoria> getListaCategoriasCopias(){
        ArrayList<Categoria> ret = new ArrayList<>();
        for (int i = 0; i < this.listaCategorias.size(); i++) {
            ret.add(this.listaCategorias.get(i));
        }
        return ret;
    }
    
    public void addCategoria(Categoria categoria){
        this.listaCategorias.add(categoria);
        setChanged();
        notifyObservers();
    }
    public void deleteCategoria(Categoria categoria){
        this.listaCategorias.remove(categoria);
        setChanged();
        notifyObservers();
    }
    public boolean comprobarExisteCategoria(Categoria categoria){
        boolean existe = false;
        for (int i = 0; i < this.listaCategorias.size(); i++) {
            if(categoria.equals(this.listaCategorias.get(i))){
                existe = true;
            }
        }
        return !existe;
    }
    public void imprimirCategorias(){
        System.out.println("\nCategorias");
        for (int i = 0; i < this.getListaCategoriasNombres().size(); i++) {
            System.out.println(this.getListaCategoriasNombres().get(i));
        }
    }
    public ArrayList<String> getListaCategoriasNombres(){
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 0; i < this.listaCategorias.size(); i++) {
            ret.add(this.listaCategorias.get(i).toStringConDetalles());
        }
        return ret;
    }
    
    public ArrayList<Categoria> ordenarCategoriaPorPrioridad(){
        ArrayList<Categoria> unaLista = this.getListaCategorias();
        
        Collections.sort(unaLista, new Comparator<Categoria>() {
            @Override
            public int compare(Categoria categoria1, Categoria categoria2) {
                return (categoria1.getPrioridad() - categoria2.getPrioridad());
            }
        });
        
        return unaLista;
    }
    
    public ArrayList<Categoria> ordenarCategoriaPorOrdenAlfabetico(){
        ArrayList<Categoria> unaLista = this.getListaCategorias();
        
        Collections.sort(unaLista, new Comparator<Categoria>() {
            @Override
            public int compare(Categoria categoria1, Categoria categoria2) {
                return categoria1.getDescripcion().toUpperCase().compareTo(categoria2.getDescripcion().toUpperCase());
            }
        });
        
        return unaLista;
    }
    
    public Categoria buscarCategoriaPorNombre(String nombre){
        Categoria retorno = null;
        
        for (int i = 0; i < this.listaCategorias.size(); i++) {
            if(this.listaCategorias.get(i).getDescripcion().equals(nombre)){
                retorno = this.listaCategorias.get(i);
            }
        }
        return retorno;
    }
    /************ Producto **************/
    
    public ArrayList<Producto> getListaProductos(){
        return this.listaProductos;
    }
    public void addProducto(Producto producto){
        this.listaProductos.add(producto);
        setChanged();
        notifyObservers();
    }
    public void deleteProducto(Producto producto){
        this.listaProductos.remove(producto);
        setChanged();
        notifyObservers();
    }
    public boolean comprobarExisteProducto(Producto producto){
        boolean existe = false;
        for (int i = 0; i < this.listaProductos.size(); i++) {
            if(producto.equals(this.listaProductos.get(i))){
                existe = true;
            }
        }
        return !existe;
    }
    public void imprimirProductos(){
        System.out.println("\nProducto");
        for (int i = 0; i < this.getListaProductos().size(); i++) {
            System.out.println(this.getListaProductos().get(i));
        }
    }
    public ArrayList<Producto> buscarProductosPorCategoria(Categoria cat){
        ArrayList<Producto> ret = new ArrayList<>();
        for (int i = 0; i < this.listaProductos.size(); i++) {
            if(this.listaProductos.get(i).getCategoriasAsociadas().contains(cat)){
                ret.add(this.listaProductos.get(i));
            }
        }
        return ret;
    }
    public Producto buscarProductoPorNombre(String nombre){
        Producto retorno = null;
        for (int i = 0; i < this.listaProductos.size(); i++) {
            if(this.listaProductos.get(i).getNombre().equals(nombre)){
                retorno = this.listaProductos.get(i);
            }
        }
        return retorno;
    }
    
    
    /************ Pedido **************/
    
    public ArrayList<Pedido> getListaPedidos(){
        return this.listaPedidos;
    }
    public void addPedido(Pedido pedido){
        this.listaPedidos.add(pedido);
        setChanged();
        notifyObservers();
    }
    public void deletePedido(Pedido pedido){
        this.listaPedidos.remove(pedido);
        setChanged();
        notifyObservers();
    }
    public void imprimirPedido(){
        System.out.println("\nPedido");
        for (int i = 0; i < this.getListaPedidos().size(); i++) {
            System.out.println(this.getListaPedidos().get(i));
        }
    }
}
