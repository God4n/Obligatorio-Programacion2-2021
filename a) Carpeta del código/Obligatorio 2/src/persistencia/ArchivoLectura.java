package persistencia;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class ArchivoLectura {
    
    private Scanner in;
    private String linea;
    
    public ArchivoLectura(String nombreArchivo){
        try{
            in = new Scanner(Paths.get(nombreArchivo));
        }
        catch(IOException e){
            System.out.println("Error al abrir el archivo");
        }
    }
    
    public boolean hayMasLineas(){
        boolean hay = false;
        linea = null;
        if(in.hasNext()){
            linea = in.nextLine();
            hay = true;
        }
        return hay;
    }
    
    public String linea(){
        return linea;
    }
    
    public void cerrar(){
        in.close();
    }
    
}
